package com.fcfb.fcfb_zebstrika.game_logic;

import org.springframework.stereotype.Component;

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
}
