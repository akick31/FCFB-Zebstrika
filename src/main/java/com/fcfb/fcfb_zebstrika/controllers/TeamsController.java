package com.fcfb.fcfb_zebstrika.controllers;

import com.fcfb.fcfb_zebstrika.domain.entities.TeamsEntity;
import com.fcfb.fcfb_zebstrika.domain.repositories.TeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/zebstrika")
public class TeamsController {

    @Autowired
    TeamsRepository teamsRepository;

    /**
     * Get a team by id
     * @param id
     * @return
     */
    @GetMapping("/team/{id}")
    public ResponseEntity<TeamsEntity> getTeamById(@PathVariable("id") int id) {
        Optional<TeamsEntity> teamData = teamsRepository.findById(id);

        if (teamData.isPresent()) {
            return new ResponseEntity<>(teamData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Get all teams
     * @return
     */
    @GetMapping("/teams")
    public ResponseEntity<TeamsEntity> getAllTeams() {
        Optional<TeamsEntity> teamData = teamsRepository.findAllTeams();

        if (teamData.isPresent()) {
            return new ResponseEntity<>(teamData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Get a team by name
     * @param name
     * @return
     */
    @GetMapping("/team/name/{name}")
    public ResponseEntity<TeamsEntity> getTeamByName(@PathVariable("name") String name) {
        Optional<TeamsEntity> teamData = teamsRepository.findByName(name);

        if (teamData.isPresent()) {
            return new ResponseEntity<>(teamData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Create a new team
     * @param team
     * @return
     */
    @PostMapping("/team")
    public ResponseEntity<TeamsEntity> createTeam(@RequestBody TeamsEntity team) {
        try {
            TeamsEntity newTeam = teamsRepository.save(new TeamsEntity(
                    team.getLogo(),
                    team.getCoach(),
                    0,
                    team.getName(),
                    0,
                    team.getPrimaryColor(),
                    team.getSecondaryColor(),
                    team.getSubdivision(),
                    team.getOffensivePlaybook(),
                    team.getDefensivePlaybook(),
                    team.getConference(),
                    0,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0,
                    0
            ));
            return new ResponseEntity<>(newTeam, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
    }

    /**
     * Update a team
     * @param name
     * @param team
     * @return
     */
    @PutMapping("/team/{name}")
    public ResponseEntity<TeamsEntity> updateTeam(@PathVariable("name") String name, @RequestBody TeamsEntity team) {
        Optional<TeamsEntity> teamData = teamsRepository.findByName(name);

        if (teamData.isPresent()) {
            TeamsEntity _team = teamData.get();
            _team.setName(team.getName());
            _team.setCoach(team.getCoach());
            _team.setSubdivision(team.getSubdivision());
            _team.setConference(team.getConference());
            _team.setPrimaryColor(team.getPrimaryColor());
            _team.setSecondaryColor(team.getSecondaryColor());
            _team.setCoachesPollRanking(team.getCoachesPollRanking());
            _team.setPlayoffCommitteeRanking(team.getPlayoffCommitteeRanking());
            _team.setOffensivePlaybook(team.getOffensivePlaybook());
            _team.setDefensivePlaybook(team.getDefensivePlaybook());
            _team.setCurrentWins(team.getCurrentWins());
            _team.setCurrentLosses(team.getCurrentLosses());
            _team.setCurrentConferenceWins(team.getCurrentConferenceWins());
            _team.setCurrentConferenceLosses(team.getCurrentConferenceLosses());
            _team.setOverallWins(team.getOverallWins());
            _team.setOverallLosses(team.getOverallLosses());
            _team.setOverallConferenceWins(team.getOverallConferenceWins());
            _team.setOverallConferenceLosses(team.getOverallConferenceLosses());
            teamsRepository.save(_team);
            return new ResponseEntity<>(_team, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    /**
     *
     * @param id
     * @return
     */
    @DeleteMapping("/team/{id}")
    public ResponseEntity<HttpStatus> deleteTeam(@PathVariable("id") int id) {
        try {
            teamsRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
