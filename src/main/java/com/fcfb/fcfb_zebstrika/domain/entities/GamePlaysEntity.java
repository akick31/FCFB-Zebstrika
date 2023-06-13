package com.fcfb.fcfb_zebstrika.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "game_plays", schema = "fcfb_zebstrika")
public class GamePlaysEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "play_id")
    private int playId;
    @Basic
    @Column(name = "game_id")
    private int gameId;
    @Basic
    @Column(name = "play_number")
    private int playNumber;
    @Basic
    @Column(name = "home_score")
    private Integer homeScore;
    @Basic
    @Column(name = "away_score")
    private Integer awayScore;
    @Basic
    @Column(name = "game_quarter")
    private Integer gameQuarter;
    @Basic
    @Column(name = "clock")
    private Integer clock;
    @Basic
    @Column(name = "ball_location")
    private Integer ballLocation;
    @Basic
    @Column(name = "possession")
    private String possession;
    @Basic
    @Column(name = "down")
    private Integer down;
    @Basic
    @Column(name = "yards_to_go")
    private Integer yardsToGo;
    @Basic
    @Column(name = "defensive_number")
    private String defensiveNumber;
    @Basic
    @Column(name = "offensive_number")
    private String offensiveNumber;
    @Basic
    @Column(name = "defensive_submitter")
    private String defensiveSubmitter;
    @Basic
    @Column(name = "offensive_submitter")
    private String offensiveSubmitter;
    @Basic
    @Column(name = "play")
    private String play;
    @Basic
    @Column(name = "result")
    private String result;
    @Basic
    @Column(name = "difference")
    private Integer difference;
    @Basic
    @Column(name = "actual_result")
    private String actualResult;
    @Basic
    @Column(name = "yards")
    private Integer yards;
    @Basic
    @Column(name = "play_time")
    private Integer playTime;
    @Basic
    @Column(name = "runoff_time")
    private Integer runoffTime;
    @Basic
    @Column(name = "win_probability")
    private Double winProbability;
    @Basic
    @Column(name = "home_team")
    private String homeTeam;
    @Basic
    @Column(name = "away_team")
    private String awayTeam;
    @Basic
    @Column(name = "timeout_used")
    private Boolean timeoutUsed;

    public GamePlaysEntity(Integer gameId, Integer playNumber, Integer homeScore, Integer awayScore, Integer quarter,
                           Integer clock, Integer ballLocation, String possession, Integer down, Integer yardsToGo,
                           String defensiveNumber, String offensiveNumber, String offensiveSubmitter,
                           String defensiveSubmitter, String play, String result, String actualResult, int yards,
                           int playTime, int runoffTime, Double winProbability, String homeTeam, String awayTeam,
                           int difference, Boolean timeoutUsed) {
        this.gameId = gameId;
        this.playNumber = playNumber;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.gameQuarter = quarter;
        this.clock = clock;
        this.ballLocation = ballLocation;
        this.possession = possession;
        this.down = down;
        this.yardsToGo = yardsToGo;
        this.defensiveNumber = defensiveNumber;
        this.offensiveNumber = offensiveNumber;
        this.offensiveSubmitter = offensiveSubmitter;
        this.defensiveSubmitter = defensiveSubmitter;
        this.play = play;
        this.result = result;
        this.actualResult = actualResult;
        this.yards = yards;
        this.playTime = playTime;
        this.runoffTime = runoffTime;
        this.winProbability = winProbability;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.difference = difference;
        this.timeoutUsed = timeoutUsed;
    }

    public GamePlaysEntity() {

    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getPlayNumber() {
        return playNumber;
    }

    public void setPlayNumber(int playNumber) {
        this.playNumber = playNumber;
    }

    public Integer getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(Integer homeScore) {
        this.homeScore = homeScore;
    }

    public Integer getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(Integer awayScore) {
        this.awayScore = awayScore;
    }

    public Integer getGameQuarter() {
        return gameQuarter;
    }

    public void setGameQuarter(Integer gameQuarter) {
        this.gameQuarter = gameQuarter;
    }

    public Integer getClock() {
        return clock;
    }

    public void setClock(Integer clock) {
        this.clock = clock;
    }

    public Integer getBallLocation() {
        return ballLocation;
    }

    public void setBallLocation(Integer ballLocation) {
        this.ballLocation = ballLocation;
    }

    public String getPossession() {
        return possession;
    }

    public void setPossession(String possession) {
        this.possession = possession;
    }

    public Integer getDown() {
        return down;
    }

    public void setDown(Integer down) {
        this.down = down;
    }

    public Integer getYardsToGo() {
        return yardsToGo;
    }

    public void setYardsToGo(Integer yardsToGo) {
        this.yardsToGo = yardsToGo;
    }

    public String getDefensiveNumber() {
        return defensiveNumber;
    }

    public void setDefensiveNumber(String defensiveNumber) {
        this.defensiveNumber = defensiveNumber;
    }

    public String getOffensiveNumber() {
        return offensiveNumber;
    }

    public void setOffensiveNumber(String offensiveNumber) {
        this.offensiveNumber = offensiveNumber;
    }

    public String getDefensiveSubmitter() {
        return defensiveSubmitter;
    }

    public void setDefensiveSubmitter(String defensiveSubmitter) {
        this.defensiveSubmitter = defensiveSubmitter;
    }

    public String getOffensiveSubmitter() {
        return offensiveSubmitter;
    }

    public void setOffensiveSubmitter(String offensiveSubmitter) {
        this.offensiveSubmitter = offensiveSubmitter;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getDifference() {
        return difference;
    }

    public void setDifference(Integer difference) {
        this.difference = difference;
    }

    public String getActualResult() {
        return actualResult;
    }

    public void setActualResult(String actualResult) {
        this.actualResult = actualResult;
    }

    public Integer getYards() {
        return yards;
    }

    public void setYards(Integer yards) {
        this.yards = yards;
    }

    public Integer getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Integer playTime) {
        this.playTime = playTime;
    }

    public Integer getRunoffTime() {
        return runoffTime;
    }

    public void setRunoffTime(Integer runoffTime) {
        this.runoffTime = runoffTime;
    }

    public Double getWinProbability() {
        return winProbability;
    }

    public void setWinProbability(Double winProbability) {
        this.winProbability = winProbability;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getPlayId() {
        return playId;
    }

    public void setPlayId(int playId) {
        this.playId = playId;
    }

    public Boolean getTimeoutUsed() {
        return timeoutUsed;
    }

    public void setTimeoutUsed(Boolean timeoutUsed) {
        this.timeoutUsed = timeoutUsed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GamePlaysEntity that = (GamePlaysEntity) o;
        return playNumber == that.playNumber && Objects.equals(gameId, that.gameId) && Objects.equals(homeScore, that.homeScore) && Objects.equals(awayScore, that.awayScore) && Objects.equals(gameQuarter, that.gameQuarter) && Objects.equals(clock, that.clock) && Objects.equals(ballLocation, that.ballLocation) && Objects.equals(possession, that.possession) && Objects.equals(down, that.down) && Objects.equals(yardsToGo, that.yardsToGo) && Objects.equals(defensiveNumber, that.defensiveNumber) && Objects.equals(offensiveNumber, that.offensiveNumber) && Objects.equals(defensiveSubmitter, that.defensiveSubmitter) && Objects.equals(offensiveSubmitter, that.offensiveSubmitter) && Objects.equals(play, that.play) && Objects.equals(result, that.result) && Objects.equals(difference, that.difference) && Objects.equals(actualResult, that.actualResult) && Objects.equals(yards, that.yards) && Objects.equals(playTime, that.playTime) && Objects.equals(runoffTime, that.runoffTime) && Objects.equals(winProbability, that.winProbability) && Objects.equals(homeTeam, that.homeTeam) && Objects.equals(awayTeam, that.awayTeam) && Objects.equals(playId, that.playId) && Objects.equals(timeoutUsed, that.timeoutUsed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId, playNumber, homeScore, awayScore, gameQuarter, clock, ballLocation, possession, down, yardsToGo, defensiveNumber, offensiveNumber, defensiveSubmitter, offensiveSubmitter, play, result, difference, actualResult, yards, playTime, runoffTime, winProbability, homeTeam, awayTeam, playId, timeoutUsed);
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"playId\": " + playId + ",\n" +
                "  \"gameId\": " + gameId + ",\n" +
                "  \"playNumber\": " + playNumber + ",\n" +
                "  \"homeScore\": " + homeScore + ",\n" +
                "  \"awayScore\": " + awayScore + ",\n" +
                "  \"quarter\": " + gameQuarter + ",\n" +
                "  \"clock\": \"" + clock + "\",\n" +
                "  \"ballLocation\": " + ballLocation + ",\n" +
                "  \"possession\": \"" + possession + "\",\n" +
                "  \"down\": " + down + ",\n" +
                "  \"yardsToGo\": " + yardsToGo + ",\n" +
                "  \"defensiveNumber\": " + defensiveNumber + ",\n" +
                "  \"offensiveNumber\": " + offensiveNumber + ",\n" +
                "  \"offensiveSubmitter\": \"" + offensiveSubmitter + "\",\n" +
                "  \"defensiveSubmitter\": \"" + defensiveSubmitter + "\",\n" +
                "  \"play\": \"" + play + "\",\n" +
                "  \"result\": \"" + result + "\",\n" +
                "  \"actualResult\": \"" + actualResult + "\",\n" +
                "  \"yards\": " + yards + ",\n" +
                "  \"playTime\": " + playTime + ",\n" +
                "  \"runoffTime\": " + runoffTime + ",\n" +
                "  \"winProbability\": " + winProbability + ",\n" +
                "  \"homeTeam\": \"" + homeTeam + "\",\n" +
                "  \"awayTeam\": \"" + awayTeam + "\",\n" +
                "  \"difference\": " + difference + "\",\n" +
                "  \"timeoutUsed\": " + timeoutUsed + "\n" +
                "}";
    }

}
