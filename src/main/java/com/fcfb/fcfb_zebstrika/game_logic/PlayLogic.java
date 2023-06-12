package com.fcfb.fcfb_zebstrika.game_logic;

import com.fcfb.fcfb_zebstrika.domain.entities.GamePlaysEntity;
import com.fcfb.fcfb_zebstrika.domain.entities.OngoingGamesEntity;
import com.fcfb.fcfb_zebstrika.domain.entities.RangesEntity;
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
    public GamePlaysEntity runPlay(GamePlaysEntity gamePlay, GamePlaysEntity previousPlay, OngoingGamesEntity game,
                                   String play, String runoffType, Boolean timeoutCalled, String offensiveNumber,
                                   String decryptedDefensiveNumber) {
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

        RangesEntity resultInformation = rangesRepository.findNormalResult(play.toLowerCase(), offensivePlaybook, defensivePlaybook, difference);
        String result = resultInformation.getResult().toUpperCase();
        play = play.toUpperCase();
        runoffType = runoffType.toUpperCase();
        int playTime = resultInformation.getPlayTime();

        // Determine runoff time between plays
        int runoffTime = 0;
        if (!gameUtils.isClockStopped(previousPlay) && !timeoutCalled) {
            if (Objects.equals(play, "SPIKE")) {
                runoffTime = 3;
            } else if (Objects.equals(runoffType, "KNEEL")) {
                runoffTime = 30;
            } else if (Objects.equals(runoffType, "CHEW")) {
                runoffTime = 30;
            } else if (Objects.equals(runoffType, "HURRY")) {
                runoffTime = 7;
            } else if (Objects.equals(offensivePlaybook, "pro")) {
                runoffTime = 15;
            } else if (Objects.equals(offensivePlaybook, "air raid")) {
                runoffTime = 10;
            } else if (Objects.equals(offensivePlaybook, "flexbone")) {
                runoffTime = 20;
            } else if (Objects.equals(offensivePlaybook, "spread")) {
                runoffTime = 13;
            } else if (Objects.equals(offensivePlaybook, "west coast")) {
                runoffTime = 17;
            }
        }

        int homeScore = game.getHomeScore();
        int awayScore = game.getAwayScore();
        int ballLocation = game.getBallLocation();
        int down = game.getDown();
        int yardsToGo = game.getYardsToGo();
        int yards = 0;
        String actualResult = "";

        // Get the actual result of the play
        switch (result) {
            //TODO HANDLE SITUATIONS WHERE THE TURNOVER IS A TOUCHDOWN ANYWAYS
            case "PICK/FUMBLE 6":
                actualResult = "TURNOVER TOUCHDOWN";
                break;
            case "TO + 20 YARDS":
                actualResult = "TURNOVER";
                ballLocation = 100 - ballLocation + 20;
                if (ballLocation > 100) {
                    actualResult = "TURNOVER TOUCHDOWN";
                }
                break;
            case "TO + 15 YARDS":
                actualResult = "TURNOVER";
                ballLocation = 100 - ballLocation + 15;
                if (ballLocation > 100) {
                    actualResult = "TURNOVER TOUCHDOWN";
                }
                break;
            case "TO + 10 YARDS":
                actualResult = "TURNOVER";
                ballLocation = 100 - ballLocation + 10;
                if (ballLocation > 100) {
                    actualResult = "TURNOVER TOUCHDOWN";
                }
                break;
            case "TO + 5 YARDS":
                actualResult = "TURNOVER";
                ballLocation = 100 - ballLocation + 5;
                if (ballLocation > 100) {
                    actualResult = "TURNOVER TOUCHDOWN";
                }
                break;
            case "TURNOVER":
                actualResult = "TURNOVER";
                ballLocation = 100 - ballLocation;
                //TODO
                break;
            case "TO - 5 YARDS":
                actualResult = "TURNOVER";
                ballLocation = 100 - ballLocation - 5;
                break;
            case "TO - 10 YARDS":
                actualResult = "TURNOVER";
                ballLocation = 100 - ballLocation - 10;
                break;
            case "TO - 15 YARDS":
                actualResult = "TURNOVER";
                ballLocation = 100 - ballLocation - 15;
                break;
            case "TO - 20 YARDS":
                actualResult = "TURNOVER";
                ballLocation = 100 - ballLocation - 20;
                break;
            case "NO GAIN":
            case "INCOMPLETE":
                actualResult = "NO GAIN";
                break;
            // General gains and losses
            default:
                result = result + " YARDS";
                yards = Integer.parseInt(result);
                ballLocation += yards;
                if (ballLocation >= 100) {
                    actualResult = "TOUCHDOWN";
                } else if (ballLocation < 0) {
                    actualResult = "SAFETY";
                } else if (yards > yardsToGo) {
                    down = 1;
                    yardsToGo = 10;
                    actualResult = "FIRST DOWN";
                } else {
                    down += 1;
                    if (down > 4) {
                        actualResult = "TURNOVER ON DOWNS";
                        ballLocation = 100 - ballLocation;
                    } else {
                        yardsToGo -= yards;
                        if (yards > 0) {
                            actualResult = "GAIN";
                        } else {
                            actualResult = "LOSS";
                        }
                    }
                }

                break;
        }

        // Handle the actual result of the play if it's not a generic gain/loss
        switch (actualResult) {
            case "TURNOVER ON DOWNS":
            case "TURNOVER":
                if (Objects.equals(possession, "home")) {
                    possession = "away";
                } else {
                    possession = "home";
                }
                down = 1;
                yardsToGo = 10;
                break;
            case "SAFETY":
                //TODO
                if (Objects.equals(possession, "home")) {
                    awayScore += 2;
                } else {
                    homeScore += 2;
                }
                break;
            case "TOUCHDOWN":
                //TODO
                ballLocation = 97;
                if (Objects.equals(possession, "home")) {
                    homeScore += 6;
                } else {
                    awayScore += 6;
                }
                break;
            case "TURNOVER TOUCHDOWN":
                //TODO
                ballLocation = 97;
                if (Objects.equals(possession, "home")) {
                    awayScore += 6;
                    possession = "away";
                } else {
                    homeScore += 6;
                    possession = "home";
                }
                //TODO
                break;
        }


        // Handle clock logic
        int clock = gamePlay.getClock() - runoffTime - playTime;
        int quarter = gamePlay.getGameQuarter();
        if (clock <= 0 && quarter < 4) {
            quarter += 1;
            clock = 420;
        }
        else if (clock <= 0 && gamePlay.getGameQuarter() == 4) {
            // Check if game is over or needs to go to OT
            if (homeScore > awayScore || awayScore > homeScore) {
                quarter = 0;
            }
            else {
                quarter = 5;
            }
        }

        gamePlay.setHomeScore(gamePlay.getHomeScore());
        gamePlay.setAwayScore(gamePlay.getAwayScore());
        gamePlay.setPossession(possession);
        gamePlay.setGameQuarter(quarter);
        gamePlay.setClock(clock);
        gamePlay.setBallLocation(ballLocation);
        gamePlay.setDown(down);
        gamePlay.setYardsToGo(yardsToGo);
        gamePlay.setDefensiveNumber(decryptedDefensiveNumber);
        gamePlay.setOffensiveNumber(offensiveNumber);
        gamePlay.setOffensiveSubmitter(gamePlay.getOffensiveSubmitter());
        gamePlay.setDefensiveSubmitter(gamePlay.getDefensiveSubmitter());
        gamePlay.setPlay(play);
        gamePlay.setResult(result);
        gamePlay.setActualResult(actualResult);
        gamePlay.setYards(yards);
        gamePlay.setPlayTime(gamePlay.getPlayTime());
        gamePlay.setRunoffTime(gamePlay.getRunoffTime());
        gamePlay.setWinProbability(gamePlay.getWinProbability());
        gamePlay.setDifference(difference); //DONE

        return gamePlay;

    }
}
