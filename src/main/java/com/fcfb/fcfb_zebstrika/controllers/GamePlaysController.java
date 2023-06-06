package com.fcfb.fcfb_zebstrika.controllers;

import com.fcfb.fcfb_zebstrika.domain.entities.GamePlaysEntity;
import com.fcfb.fcfb_zebstrika.domain.entities.OngoingGamesEntity;
import com.fcfb.fcfb_zebstrika.domain.repositories.GamePlaysRepository;
import com.fcfb.fcfb_zebstrika.domain.repositories.OngoingGamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/zebstrika")
public class GamePlaysController {

    @Autowired
    GamePlaysRepository gamePlaysRepository;

    @Autowired
    OngoingGamesRepository ongoingGamesRepository;

    @PostMapping("/game_plays/start/{gameId}/{defensiveNumber}")
    public ResponseEntity<String> startPlayWithDefensiveNumber(@PathVariable("gameId") int gameId,
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

                String playId = UUID.randomUUID().toString();

                //TODO encrypt defensive number

                gamePlaysRepository.save(new GamePlaysEntity(
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
                        defensiveNumber,
                        0,
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

                return new ResponseEntity<>("Started new play for game " + gameId, HttpStatus.CREATED);
            }
            else {
                return new ResponseEntity<>("Could not find game data, the game may not have been started yet",
                        HttpStatus.NOT_FOUND);
            }

        } catch (Exception e) {
            return new ResponseEntity<>(e.toString(), HttpStatus.BAD_REQUEST);
        }
    }
}
