package com.fcfb.fcfb_zebstrika.game_logic;

import com.fcfb.fcfb_zebstrika.domain.entities.GamePlaysEntity;
import com.fcfb.fcfb_zebstrika.domain.entities.OngoingGamesEntity;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class GameUtils {

    /**
     * Returns the difference between the offensive and defensive numbers.
     * @param offensiveNumber
     * @param defesiveNumber
     * @return
     */
    public int getDifference(int offensiveNumber, int defesiveNumber) {
        int difference = Math.abs(defesiveNumber - offensiveNumber);
        if(difference > 750){
            difference = 1500 - difference;
        }
        return difference;
    }

    /**
     * Returns the number of seconds from the clock.
     * @param clock
     * @return
     */
    public int convertClockToSeconds(String clock) {
        String[] clockArray = clock.split(":");
        int minutes = Integer.parseInt(clockArray[0]);
        int seconds = Integer.parseInt(clockArray[1]);
        return (minutes * 60) + seconds;
    }

    /**
     * Returns the clock from the number of seconds.
     * @param seconds
     * @return
     */
    public String convertClockToString(int seconds) {
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return minutes + ":" + remainingSeconds;
    }

    public Boolean isClockStopped(GamePlaysEntity previousPlay) {
        String play = previousPlay.getPlay();
        String result = previousPlay.getResult();
        String actualResult = previousPlay.getActualResult();
        if (play.equals("SPIKE") || result.equals("INCOMPLETE") || actualResult.equals("TOUCHDOWN")
                || play.equals("FIELD GOAL") || play.equals("PAT") || play.equals("KICKOFF NORMAL")
                || play.equals("KICKOFF ONSIDE") || play.equals("KICKOFF SQUIB") || play.equals("PUNT")
                || actualResult.equals("TURNOVER")) {
            return true;
        }
        return false;
    }

    public String handleHalfTimePossessionChange(OngoingGamesEntity game) {
        String possession = "";
        if (Objects.equals(game.getCoinTossWinner(), "home") && Objects.equals(game.getCoinTossChoice(), "defer")){
            possession = "away";
        }
        else if (Objects.equals(game.getCoinTossWinner(), "home") && Objects.equals(game.getCoinTossChoice(), "receive")){
            possession = "home";
        }
        else if (Objects.equals(game.getCoinTossWinner(), "away") && Objects.equals(game.getCoinTossChoice(), "defer")){
            possession = "home";
        }
        else if (Objects.equals(game.getCoinTossWinner(), "away") && Objects.equals(game.getCoinTossChoice(), "receive")){
            possession = "away";
        }
        return possession;
    }

    //TODO Win probability and ELO rating methods
}
