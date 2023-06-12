package com.fcfb.fcfb_zebstrika.controllers;

import com.fcfb.fcfb_zebstrika.domain.entities.GamePlaysEntity;
import com.fcfb.fcfb_zebstrika.domain.entities.GameStatsEntity;
import com.fcfb.fcfb_zebstrika.domain.entities.OngoingGamesEntity;
import com.fcfb.fcfb_zebstrika.domain.repositories.GamePlaysRepository;
import com.fcfb.fcfb_zebstrika.domain.repositories.GameStatsRepository;
import com.fcfb.fcfb_zebstrika.domain.repositories.OngoingGamesRepository;
import com.fcfb.fcfb_zebstrika.game_logic.GameInformation;
import com.fcfb.fcfb_zebstrika.game_logic.GameStats;
import com.fcfb.fcfb_zebstrika.game_logic.PlayLogic;
import com.fcfb.fcfb_zebstrika.game_logic.GameUtils;
import com.fcfb.fcfb_zebstrika.utils.EncryptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/zebstrika")
public class GamePlaysController {
    private final PlayLogic playLogic;
    private final GameInformation gameInformation;
    private final GameStats gameStats;
    private final EncryptionUtils encryptionUtils;
    private final GameUtils gameUtils;

    @Autowired
    GamePlaysRepository gamePlaysRepository;

    @Autowired
    OngoingGamesRepository ongoingGamesRepository;

    @Autowired
    GameStatsRepository gameStatsRepository;

    public GamePlaysController(PlayLogic playLogic, GameInformation gameInformation, GameStats gameStats,
                               EncryptionUtils encryptionUtils, GameUtils gameUtils) {
        this.playLogic = playLogic;
        this.gameInformation = gameInformation;
        this.gameStats = gameStats;
        this.encryptionUtils = encryptionUtils;
        this.gameUtils = gameUtils;
    }

    /**
     * Start a new play, the defensive number was submitted. The defensive number is encrypted
     * @param gameId
     * @param defensiveNumber
     * @return
     */
    @PostMapping("/game_plays/defense_submitted/{gameId}/{defensiveNumber}")
    public ResponseEntity<String> defensiveNumberSubmitted(@PathVariable("gameId") int gameId,
                                                               @PathVariable("defensiveNumber") int defensiveNumber) {
        try {
            Optional<OngoingGamesEntity> gameData = ongoingGamesRepository.findById(gameId);

            if (gameData.isPresent()) {
                String offensiveSubmitter = "";
                String defensiveSubmitter = "";
                if (Objects.equals(gameData.get().getPossession(), "home")) {
                    offensiveSubmitter = gameData.get().getHomeCoach();
                    defensiveSubmitter = gameData.get().getAwayCoach();
                } else {
                    offensiveSubmitter = gameData.get().getAwayCoach();
                    defensiveSubmitter = gameData.get().getHomeCoach();
                }

                String encryptedDefensiveNumber = encryptionUtils.encrypt(String.valueOf(defensiveNumber));
                int clock = gameUtils.convertClockToSeconds(gameData.get().getClock());

                GamePlaysEntity gamePlay = gamePlaysRepository.save(new GamePlaysEntity(
                        gameId,
                        gameData.get().getNumPlays() + 1,
                        gameData.get().getHomeScore(),
                        gameData.get().getAwayScore(),
                        gameData.get().getQuarter(),
                        clock,
                        gameData.get().getBallLocation(),
                        gameData.get().getPossession(),
                        gameData.get().getDown(),
                        gameData.get().getYardsToGo(),
                        encryptedDefensiveNumber,
                        "0",
                        offensiveSubmitter,
                        defensiveSubmitter,
                        "None",
                        "None",
                        "None",
                        0,
                        0,
                        0,
                        gameData.get().getWinProbability(),
                        gameData.get().getHomeTeam(),
                        gameData.get().getAwayTeam(),
                        0));

                return new ResponseEntity<>(gamePlay.toString(), HttpStatus.CREATED);
            }
            else {
                return new ResponseEntity<>(null,
                        HttpStatus.NOT_FOUND);
            }

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * The offensive number was submitted, run the play
     * @param playId
     * @param offensiveNumber
     * @param play
     * @return
     */
    @PutMapping("/game_plays/offense_submitted/{playId}/{offensiveNumber}/{play}/{runoffType}/{offensiveTimeoutCalled}/{defensiveTimeoutCalled}")
    public ResponseEntity<String> offensiveNumberSubmitted(@PathVariable("playId") int playId,
                                                                    @PathVariable("offensiveNumber") int offensiveNumber,
                                                                    @PathVariable("play") String play,
                                                                    @PathVariable("runoffType") String runoffType,
                                                                    @PathVariable("offensiveTimeoutCalled") Boolean offensiveTimeoutCalled,
                                                                    @PathVariable("defensiveTimeoutCalled") Boolean defensiveTimeoutCalled) {
        try {
            Optional<GamePlaysEntity> gamePlayData = gamePlaysRepository.findById(playId);


            if (gamePlayData.isPresent()) {
                String decryptedDefensiveNumber = encryptionUtils.decrypt(gamePlayData.get().getDefensiveNumber());

                GamePlaysEntity gamePlay = gamePlayData.get();
                Optional<OngoingGamesEntity> gameData = ongoingGamesRepository.findById(gamePlay.getGameId());

                if (gameData.isPresent()) {
                    Optional<GameStatsEntity> statsData = gameStatsRepository.findById(gamePlay.getGameId());

                    if (statsData.isPresent()) {
                        OngoingGamesEntity game = gameData.get();
                        GameStatsEntity stats = statsData.get();

                        //TODO handle if play is not "normal", aka if last play was TD etc.
                        GamePlaysEntity previousPlay = gamePlaysRepository.getPreviousPlay(gamePlay.getGameId());
                        Boolean timeoutCalled = false;
                        if (offensiveTimeoutCalled || defensiveTimeoutCalled) {
                            timeoutCalled = true;
                        }
                        gamePlay = playLogic.runPlay(gamePlay, previousPlay, game, play, runoffType, timeoutCalled, String.valueOf(offensiveNumber), decryptedDefensiveNumber);
                        game = gameInformation.updateGameInformation(game, gamePlay, previousPlay, offensiveTimeoutCalled, defensiveTimeoutCalled);
                        stats = gameStats.updateGameStats(stats, gamePlay);

                        // If game quarter is 0, then the game is over
                        if (gamePlay.getGameQuarter() == 0) {
                            game.setIsFinal(true);
                        }
                        // If game quarter is 5, then the game is in OT
                        else if (gamePlay.getGameQuarter() >= 5) {
                            game.setIsOT(true);
                        }

                        ongoingGamesRepository.save(game);
                        gameStatsRepository.save(stats);
                        gamePlaysRepository.save(gamePlay);
                        return new ResponseEntity<>(gamePlay.toString(), HttpStatus.OK);
                    }
                }
            }
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
