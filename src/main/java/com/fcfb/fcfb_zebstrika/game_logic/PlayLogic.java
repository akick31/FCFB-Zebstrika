package com.fcfb.fcfb_zebstrika.game_logic;

import com.fcfb.fcfb_zebstrika.domain.entities.GamePlaysEntity;
import com.fcfb.fcfb_zebstrika.domain.entities.OngoingGamesEntity;
import com.fcfb.fcfb_zebstrika.domain.repositories.RangesRepository;
import com.fcfb.fcfb_zebstrika.game_logic.GameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class PlayLogic {
    private final GameUtils gameUtils;

    @Autowired
    RangesRepository rangesRepository;

    public PlayLogic(GameUtils gameUtils) {
        this.gameUtils = gameUtils;
    }

    /**
     * Runs the play, returns the updated gamePlay
     * @param gamePlay
     * @param game
     * @param play
     * @param offensiveNumber
     * @param decryptedDefensiveNumber
     * @return
     */
    public GamePlaysEntity runPlay(GamePlaysEntity gamePlay, OngoingGamesEntity game, String play, String offensiveNumber, String decryptedDefensiveNumber) {
        int difference = gameUtils.getDifference(Integer.parseInt(offensiveNumber), Integer.parseInt(decryptedDefensiveNumber));

        //TODO: GET RESULT FROM RANGES
        String possession = gamePlay.getPossession();
        String offensivePlaybook = "";
        String defensivePlaybook = "";
        if(Objects.equals(possession, "home")) {
            offensivePlaybook = game.getHomeOffensivePlaybook();
            defensivePlaybook = game.getAwayDefensivePlaybook();
        }
        else {
            offensivePlaybook = game.getAwayOffensivePlaybook();
            defensivePlaybook = game.getHomeDefensivePlaybook();
        }

        String result = rangesRepository.findNormalResult(play.toLowerCase(), offensivePlaybook, defensivePlaybook, difference);

        gamePlay.setHomeScore(gamePlay.getHomeScore());
        gamePlay.setAwayScore(gamePlay.getAwayScore());
        gamePlay.setPossession(gamePlay.getPossession());
        gamePlay.setGameQuarter(gamePlay.getGameQuarter());
        gamePlay.setClock(gamePlay.getClock());
        gamePlay.setBallLocation(gamePlay.getBallLocation());
        gamePlay.setDown(gamePlay.getDown());
        gamePlay.setYardsToGo(gamePlay.getYardsToGo());
        gamePlay.setDefensiveNumber(decryptedDefensiveNumber);
        gamePlay.setOffensiveNumber(offensiveNumber);
        gamePlay.setOffensiveSubmitter(gamePlay.getOffensiveSubmitter());
        gamePlay.setDefensiveSubmitter(gamePlay.getDefensiveSubmitter());
        gamePlay.setPlay(play);
        gamePlay.setResult(result);
        gamePlay.setActualResult(gamePlay.getActualResult());
        gamePlay.setYards(gamePlay.getYards());
        gamePlay.setPlayTime(gamePlay.getPlayTime());
        gamePlay.setRunoffTime(gamePlay.getRunoffTime());
        gamePlay.setWinProbability(gamePlay.getWinProbability());
        gamePlay.setDifference(difference); //DONE

        return gamePlay;

    }
}
