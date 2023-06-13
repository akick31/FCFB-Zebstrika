package com.fcfb.fcfb_zebstrika.controllers;

import com.fcfb.fcfb_zebstrika.domain.entities.GamePlaysEntity;
import com.fcfb.fcfb_zebstrika.domain.entities.OngoingGamesEntity;
import com.fcfb.fcfb_zebstrika.domain.entities.TeamsEntity;
import com.fcfb.fcfb_zebstrika.domain.repositories.GamePlaysRepository;
import com.fcfb.fcfb_zebstrika.domain.repositories.OngoingGamesRepository;
import com.fcfb.fcfb_zebstrika.domain.repositories.TeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/zebstrika")
public class OngoingGamesController {

    @Autowired
    OngoingGamesRepository ongoingGamesRepository;

    @Autowired
    TeamsRepository teamsRepository;

    /**
     * Start a game
     * @param season
     * @param subdivision
     * @param homeTeam
     * @param awayTeam
     * @param tvChannel
     * @param startTime
     * @param location
     * @return
     */

    @PostMapping("/games/start/{season}/{subdivision}/{homeTeam}/{awayTeam}/{tvChannel}/{startTime}/{location}/{coinTossWinner}/{coinTossChoice}")
    public ResponseEntity<String> startGame(@PathVariable("season") String season,
                                            @PathVariable("subdivision") String subdivision,
                                            @PathVariable("homeTeam") String homeTeam,
                                            @PathVariable("awayTeam") String awayTeam,
                                            @PathVariable("tvChannel") String tvChannel,
                                            @PathVariable("startTime") String startTime,
                                            @PathVariable("location") String location,
                                            @PathVariable("coinTossWinner") String coinTossWinner,
                                            @PathVariable("coinTossChoice") String coinTossChoice) {

        try {
            Optional<TeamsEntity> homeTeamData = teamsRepository.findByName(homeTeam);
            Optional<TeamsEntity> awayTeamData = teamsRepository.findByName(awayTeam);

            if (homeTeamData.isPresent() && awayTeamData.isPresent()) {
                OngoingGamesEntity newGame = ongoingGamesRepository.save(new OngoingGamesEntity(
                        homeTeam,
                        awayTeam,
                        homeTeamData.get().getCoach(),
                        awayTeamData.get().getCoach(),
                        homeTeamData.get().getOffensivePlaybook().toLowerCase(),
                        awayTeamData.get().getOffensivePlaybook().toLowerCase(),
                        homeTeamData.get().getDefensivePlaybook().toLowerCase(),
                        awayTeamData.get().getDefensivePlaybook().toLowerCase(),
                        0,
                        0,
                        "home",
                        1,
                        "7:00",
                        0,
                        0,
                        0,
                        tvChannel,
                        startTime,
                        location,
                        homeTeamData.get().getCurrentWins(),
                        homeTeamData.get().getCurrentLosses(),
                        awayTeamData.get().getCurrentWins(),
                        awayTeamData.get().getCurrentLosses(),
                        "none_scorebug.png",
                        subdivision,
                        LocalDateTime.now(),
                        0.0,
                        Boolean.FALSE,
                        Boolean.FALSE,
                        Integer.parseInt(season),
                        awayTeamData.get().getCoach(),
                        "none_winprob.png",
                        "none_scoreplot.png",
                        0,
                        3,
                        3,
                        coinTossWinner,
                        coinTossChoice));

                // Create image names
                String gameId = String.valueOf(newGame.getGameId());
                String scorebugName = gameId + "_scorebug.png";
                String winprobName = gameId + "_winprob.png";
                String scoreplotName = gameId + "_scoreplot.png";

                // Update the entity with the new image names
                newGame.setScorebug(scorebugName);
                newGame.setWinProbabilityPlot(winprobName);
                newGame.setScorePlot(scoreplotName);

                // Save the updated entity
                ongoingGamesRepository.save(newGame);

                return new ResponseEntity<>(newGame.toString(), HttpStatus.CREATED);
            }
            else {
                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }
}
