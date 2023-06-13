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
    public GamePlaysEntity runNormalPlay(GamePlaysEntity gamePlay, GamePlaysEntity previousPlay, OngoingGamesEntity game,
                                   String play, String runoffType, Boolean timeoutCalled, String offensiveNumber,
                                   String decryptedDefensiveNumber) {
        int difference = gameUtils.getDifference(Integer.parseInt(offensiveNumber), Integer.parseInt(decryptedDefensiveNumber));

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
                break;
            case "TO - 5 YARDS":
                actualResult = "TURNOVER";
                ballLocation = 100 - ballLocation - 5;
                if (ballLocation <= 0) {
                    ballLocation = 20;
                }
                break;
            case "TO - 10 YARDS":
                actualResult = "TURNOVER";
                ballLocation = 100 - ballLocation - 10;
                if (ballLocation <= 0) {
                    ballLocation = 20;
                }
                break;
            case "TO - 15 YARDS":
                actualResult = "TURNOVER";
                ballLocation = 100 - ballLocation - 15;
                if (ballLocation <= 0) {
                    ballLocation = 20;
                }
                break;
            case "TO - 20 YARDS":
                actualResult = "TURNOVER";
                ballLocation = 100 - ballLocation - 20;
                if (ballLocation <= 0) {
                    ballLocation = 20;
                }
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
                } else if (ballLocation <= 0) {
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
                ballLocation = 20;
                if (Objects.equals(possession, "home")) {
                    awayScore += 2;
                } else {
                    homeScore += 2;
                }
                break;
            case "TOUCHDOWN":
                ballLocation = 97;
                if (Objects.equals(possession, "home")) {
                    homeScore += 6;
                } else {
                    awayScore += 6;
                }
                break;
            case "TURNOVER TOUCHDOWN":
                ballLocation = 97;
                if (Objects.equals(possession, "home")) {
                    awayScore += 6;
                    possession = "away";
                } else {
                    homeScore += 6;
                    possession = "home";
                }
                break;
        }

        // Handle clock logic
        int clock = gamePlay.getClock() - runoffTime - playTime;
        int quarter = gamePlay.getGameQuarter();
        if (clock <= 0 && quarter < 4 && !actualResult.contains("TOUCHDOWN")) {
            quarter += 1;
            clock = 420;
            if (quarter == 3) {
                ballLocation = 35;
                possession = gameUtils.handleHalfTimePossessionChange(game);
            }
        }
        else if (clock <= 0 && !actualResult.contains("TOUCHDOWN") && gamePlay.getGameQuarter() == 4) {
            // Check if game is over or needs to go to OT
            if (homeScore > awayScore || awayScore > homeScore) {
                quarter = 0;
            }
            else {
                quarter = 5;
            }
        }

        gamePlay.setHomeScore(homeScore);
        gamePlay.setAwayScore(awayScore);
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
        gamePlay.setPlayTime(playTime);
        gamePlay.setRunoffTime(runoffTime);
        gamePlay.setWinProbability(gamePlay.getWinProbability());
        gamePlay.setDifference(difference);

        if (!gameUtils.isClockStopped(previousPlay) && timeoutCalled) {
            gamePlay.setTimeoutUsed(true);
        }
        else{
            gamePlay.setTimeoutUsed(false);
        }

        return gamePlay;
    }

    public GamePlaysEntity runKickoffPlay(GamePlaysEntity gamePlay, OngoingGamesEntity game, String play, String offensiveNumber,
                                         String decryptedDefensiveNumber) {
        int difference = gameUtils.getDifference(Integer.parseInt(offensiveNumber), Integer.parseInt(decryptedDefensiveNumber));

        String possession = gamePlay.getPossession();

        RangesEntity resultInformation = rangesRepository.findNonNormalResult(play.toLowerCase(), difference);
        String result = resultInformation.getResult().toUpperCase();
        play = play.toUpperCase();

        int homeScore = game.getHomeScore();
        int awayScore = game.getAwayScore();
        int ballLocation = 35;
        int down = 1;
        int yardsToGo = 10;
        int playTime = resultInformation.getPlayTime();
        String actualResult = "";

        // Get the actual result of the play
        switch (result) {
            case "TOUCHDOWN":
                actualResult = "KICKING TEAM TOUCHDOWN";
                ballLocation = 97;
                break;
            case "FUMBLE":
                actualResult = "MUFFED KICK";
                ballLocation = 75;
                break;
            case "5":
                actualResult = "KICKOFF";
                ballLocation = 5;
                break;
            case "10":
                actualResult = "KICKOFF";
                ballLocation = 10;
                break;
            case "20":
                actualResult = "KICKOFF";
                ballLocation = 20;
                break;
            case "TOUCHBACK":
                actualResult = "KICKOFF";
                ballLocation = 25;
                break;
            case "30":
                actualResult = "KICKOFF";
                ballLocation = 30;
                break;
            case "35":
                actualResult = "KICKOFF";
                ballLocation = 35;
                break;
            case "40":
                actualResult = "KICKOFF";
                ballLocation = 40;
                break;
            case "45":
                actualResult = "KICKOFF";
                ballLocation = 45;
                break;
            case "50":
                actualResult = "KICKOFF";
                ballLocation = 50;
                break;
            case "65":
                actualResult = "KICKOFF";
                ballLocation = 65;
                break;
            case "RETURN TOUCHDOWN":
                actualResult = "RETURN TOUCHDOWN";
                ballLocation = 97;
                break;
            case "RECOVERED":
                actualResult = "ONSIDE KICK RECOVERED";
                ballLocation = 45;
                break;
            case "NO GOOD":
                actualResult = "ONSIDE KICK FAILED";
                ballLocation = 55;
                break;
        }

        // Handle the actual result of the play if it's not a generic gain/loss
        switch (actualResult) {
            case "KICKING TEAM TOUCHDOWN":
                if (Objects.equals(possession, "home")) {
                    homeScore += 6;
                } else {
                    awayScore += 6;
                }
                break;
            case "KICKOFF":
            case "ONSIDE KICK FAILED":
                if (Objects.equals(possession, "home")) {
                    possession = "away";
                } else {
                    possession = "home";
                }
                break;
            case "RETURN TOUCHDOWN":
                if (Objects.equals(possession, "home")) {
                    possession = "away";
                    awayScore += 6;
                } else {
                    possession = "home";
                    homeScore += 6;
                }
                break;
            case "ONSIDE KICK RECOVERED":
            case "MUFFED KICK":
                if (Objects.equals(possession, "home")) {
                    possession = "home";
                } else {
                    possession = "away";
                }
                break;
        }

        // Handle clock logic
        int clock = gamePlay.getClock() - playTime;g
        int quarter = gamePlay.getGameQuarter();
        if (clock <= 0 && quarter < 4 && !actualResult.contains("TOUCHDOWN")) {
            quarter += 1;
            clock = 420;
            if (quarter == 3) {
                possession = gameUtils.handleHalfTimePossessionChange(game);
            }
        }
        else if (clock <= 0 && !actualResult.contains("TOUCHDOWN") && gamePlay.getGameQuarter() == 4) {
            // Check if game is over or needs to go to OT
            if (homeScore > awayScore || awayScore > homeScore) {
                quarter = 0;
            }
            else {
                quarter = 5;
            }
        }

        gamePlay.setHomeScore(homeScore);
        gamePlay.setAwayScore(awayScore);
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
        gamePlay.setYards(0);
        gamePlay.setPlayTime(playTime);
        gamePlay.setRunoffTime(0);
        gamePlay.setWinProbability(gamePlay.getWinProbability());
        gamePlay.setDifference(difference);
        gamePlay.setTimeoutUsed(false);

        return gamePlay;
    }

    public GamePlaysEntity runPointAfterPlay(GamePlaysEntity gamePlay, OngoingGamesEntity game, String play,
                                          String offensiveNumber, String decryptedDefensiveNumber) {
        int difference = gameUtils.getDifference(Integer.parseInt(offensiveNumber), Integer.parseInt(decryptedDefensiveNumber));

        String possession = gamePlay.getPossession();

        RangesEntity resultInformation = rangesRepository.findNonNormalResult(play.toLowerCase(), difference);
        String result = resultInformation.getResult().toUpperCase();
        play = play.toUpperCase();

        int homeScore = game.getHomeScore();
        int awayScore = game.getAwayScore();
        int ballLocation = 25;
        int down = 1;
        int yardsToGo = 10;
        String actualResult = "";

        // Get the actual result of the play
        switch (result) {
            case "GOOD":
                actualResult = "GOOD";
                break;
            case "NO GOOD":
                actualResult = "NO GOOD";
                break;
            case "DEFENSE TWO POINT":
                actualResult = "DEFENSE TWO POINT";
                break;
        }

        // Handle the actual result of the play if it's not a generic gain/loss
        switch (actualResult) {
            case "GOOD":
                if (play.equals("PAT")) {
                    if (Objects.equals(possession, "home")) {
                        homeScore += 1;
                    } else {
                        awayScore += 1;
                    }
                } else if (play.equals("TWO POINT")) {
                    if (Objects.equals(possession, "home")) {
                        homeScore += 2;
                    } else {
                        awayScore += 2;
                    }
                }
            case "DEFENSE TWO POINT":
                if (Objects.equals(possession, "home")) {
                    awayScore += 2;
                } else {
                    homeScore += 2;
                }
                break;
        }

        // Handle clock logic
        int clock = gamePlay.getClock();
        int quarter = gamePlay.getGameQuarter();
        if (clock <= 0 && quarter < 4) {
            quarter += 1;
            clock = 420;
            if (quarter == 3) {
                possession = gameUtils.handleHalfTimePossessionChange(game);
            }
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

        gamePlay.setHomeScore(homeScore);
        gamePlay.setAwayScore(awayScore);
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
        gamePlay.setYards(0);
        gamePlay.setPlayTime(0);
        gamePlay.setRunoffTime(0);
        gamePlay.setWinProbability(gamePlay.getWinProbability());
        gamePlay.setDifference(difference);
        gamePlay.setTimeoutUsed(false);

        return gamePlay;
    }
}
