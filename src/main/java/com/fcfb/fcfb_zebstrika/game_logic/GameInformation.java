package com.fcfb.fcfb_zebstrika.game_logic;

import com.fcfb.fcfb_zebstrika.domain.entities.GamePlaysEntity;
import com.fcfb.fcfb_zebstrika.domain.entities.OngoingGamesEntity;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class GameInformation {
    private final GameUtils gameUtils;

    public GameInformation(GameUtils gameUtils) {
        this.gameUtils = gameUtils;
    }

    public OngoingGamesEntity updateGameInformation(OngoingGamesEntity game, GamePlaysEntity play,
                                                    GamePlaysEntity previousPlay, Boolean offensiveTimeout,
                                                    Boolean defensiveTimeout) {
        String possession = game.getPossession();
        if (!gameUtils.isClockStopped(previousPlay)) {
            if (Objects.equals(possession, "home") && defensiveTimeout) {
                game.setAwayTimeouts(game.getAwayTimeouts() - 1);
            } else if (Objects.equals(possession, "home") && offensiveTimeout) {
                game.setHomeTimeouts(game.getHomeTimeouts() - 1);
            } else if (Objects.equals(possession, "away") && defensiveTimeout) {
                game.setHomeTimeouts(game.getHomeTimeouts() - 1);
            } else if (Objects.equals(possession, "away") && offensiveTimeout) {
                game.setAwayTimeouts(game.getAwayTimeouts() - 1);
            }
        }

        return game;
    }
}
