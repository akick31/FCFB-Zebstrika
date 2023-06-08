package com.fcfb.fcfb_zebstrika.controllers;

import com.fcfb.fcfb_zebstrika.domain.entities.GamePlaysEntity;
import com.fcfb.fcfb_zebstrika.domain.entities.OngoingGamesEntity;
import com.fcfb.fcfb_zebstrika.domain.repositories.GamePlaysRepository;
import com.fcfb.fcfb_zebstrika.domain.repositories.OngoingGamesRepository;
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
    private final EncryptionUtils encryptionUtils;

    @Autowired
    GamePlaysRepository gamePlaysRepository;

    @Autowired
    OngoingGamesRepository ongoingGamesRepository;

    public GamePlaysController(EncryptionUtils encryptionUtils) {
        this.encryptionUtils = encryptionUtils;
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

                GamePlaysEntity gamePlay = gamePlaysRepository.save(new GamePlaysEntity(
                        gameId,
                        gameData.get().getNumPlays() + 1,
                        gameData.get().getHomeScore(),
                        gameData.get().getAwayScore(),
                        gameData.get().getQuarter(),
                        gameData.get().getClock(),
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

    @PutMapping("/game_plays/offense_submitted/{playId}/{offensiveNumber}/{play}")
    public ResponseEntity<String> offensiveNumberSubmitted(@PathVariable("playId") int playId,
                                                                    @PathVariable("offensiveNumber") int offensiveNumber,
                                                                    @PathVariable("play") String play) {
        try {
            Optional<GamePlaysEntity> gamePlayData = gamePlaysRepository.findById(playId);

            if (gamePlayData.isPresent()) {
                String decryptedDefensiveNumber = encryptionUtils.decrypt(gamePlayData.get().getDefensiveNumber());

                GamePlaysEntity gamePlay = gamePlayData.get();

                //TODO HANDLE LOGIC OF PLAY

                gamePlay.setHomeScore(gamePlay.getHomeScore());
                gamePlay.setAwayScore(gamePlay.getAwayScore());
                gamePlay.setPossession(gamePlay.getPossession());
                gamePlay.setGameQuarter(gamePlay.getGameQuarter());
                gamePlay.setClock(gamePlay.getClock());
                gamePlay.setBallLocation(gamePlay.getBallLocation());
                gamePlay.setDown(gamePlay.getDown());
                gamePlay.setYardsToGo(gamePlay.getYardsToGo());
                gamePlay.setDefensiveNumber(decryptedDefensiveNumber);
                gamePlay.setOffensiveNumber(String.valueOf(offensiveNumber));
                gamePlay.setOffensiveSubmitter(gamePlay.getOffensiveSubmitter());
                gamePlay.setDefensiveSubmitter(gamePlay.getDefensiveSubmitter());
                gamePlay.setPlay(play);
                gamePlay.setResult(gamePlay.getResult());
                gamePlay.setActualResult(gamePlay.getActualResult());
                gamePlay.setYards(gamePlay.getYards());
                gamePlay.setPlayTime(gamePlay.getPlayTime());
                gamePlay.setRunoffTime(gamePlay.getRunoffTime());
                gamePlay.setWinProbability(gamePlay.getWinProbability());
                gamePlay.setDifference(gamePlay.getDifference());

                gamePlaysRepository.save(gamePlay);

                //TODO UPDATE ONGOING GAME WITH THIS INFO

                return new ResponseEntity<>(gamePlay.toString(), HttpStatus.OK);
            }
            else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
