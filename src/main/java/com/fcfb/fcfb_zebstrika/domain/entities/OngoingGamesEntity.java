package com.fcfb.fcfb_zebstrika.domain.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "ongoing_games", schema = "fcfb_zebstrika")
public class OngoingGamesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "game_id")
    private int gameId;
    @Basic
    @Column(name = "home_team")
    private String homeTeam;
    @Basic
    @Column(name = "away_team")
    private String awayTeam;
    @Basic
    @Column(name = "home_coach")
    private String homeCoach;
    @Basic
    @Column(name = "away_coach")
    private String awayCoach;
    @Basic
    @Column(name = "home_offensive_playbook")
    private String homeOffensivePlaybook;
    @Basic
    @Column(name = "away_offensive_playbook")
    private String awayOffensivePlaybook;
    @Basic
    @Column(name = "home_defensive_playbook")
    private String homeDefensivePlaybook;
    @Basic
    @Column(name = "away_defensive_playbook")
    private String awayDefensivePlaybook;
    @Basic
    @Column(name = "home_score")
    private Integer homeScore;
    @Basic
    @Column(name = "away_score")
    private Integer awayScore;
    @Basic
    @Column(name = "possession")
    private String possession;
    @Basic
    @Column(name = "quarter")
    private Integer quarter;
    @Basic
    @Column(name = "clock")
    private String clock;
    @Basic
    @Column(name = "ball_location")
    private Integer ballLocation;
    @Basic
    @Column(name = "down")
    private Integer down;
    @Basic
    @Column(name = "yards_to_go")
    private Integer yardsToGo;
    @Basic
    @Column(name = "tv_channel")
    private String tvChannel;
    @Basic
    @Column(name = "start_time")
    private String startTime;
    @Basic
    @Column(name = "location")
    private String location;
    @Basic
    @Column(name = "home_wins")
    private Integer homeWins;
    @Basic
    @Column(name = "home_losses")
    private Integer homeLosses;
    @Basic
    @Column(name = "away_wins")
    private Integer awayWins;
    @Basic
    @Column(name = "away_losses")
    private Integer awayLosses;
    @Basic
    @Column(name = "scorebug")
    private String scorebug;
    @Basic
    @Column(name = "subdivision")
    private String subdivision;
    @Basic
    @Column(name = "timestamp")
    private LocalDateTime timestamp;
    @Basic
    @Column(name = "win_probability")
    private Double winProbability;
    @Basic
    @Column(name = "is_final")
    private Boolean isFinal;
    @Basic
    @Column(name = "season")
    private Integer season;
    @Basic
    @Column(name = "waiting_on")
    private String waitingOn;
    @Basic
    @Column(name = "win_probability_plot")
    private String winProbabilityPlot;
    @Basic
    @Column(name = "score_plot")
    private String scorePlot;
    @Basic
    @Column(name = "num_plays")
    private Integer numPlays;

    public OngoingGamesEntity(String homeTeam, String awayTeam, String homeCoach, String awayCoach,
                              String homeOffensivePlaybook, String awayOffensivePlaybook, String homeDefensivePlaybook,
                              String awayDefensivePlaybook, Integer homeScore, Integer awayScore, String possession,
                              Integer quarter, String clock, Integer ballLocation, Integer down, Integer yardsToGo,
                              String tvChannel, String startTime, String location, Integer homeWins, Integer homeLosses,
                              Integer awayWins, Integer awayLosses, String scorebug, String subdivision,
                              LocalDateTime timestamp, Double winProbability, Boolean isFinal, Integer season,
                              String waitingOn, String winProbabilityPlot, String scorePlot, Integer numPlays) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeCoach = homeCoach;
        this.awayCoach = awayCoach;
        this.homeOffensivePlaybook = homeOffensivePlaybook;
        this.awayOffensivePlaybook = awayOffensivePlaybook;
        this.homeDefensivePlaybook = homeDefensivePlaybook;
        this.awayDefensivePlaybook = awayDefensivePlaybook;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.possession = possession;
        this.quarter = quarter;
        this.clock = clock;
        this.ballLocation = ballLocation;
        this.down = down;
        this.yardsToGo = yardsToGo;
        this.tvChannel = tvChannel;
        this.startTime = startTime;
        this.location = location;
        this.homeWins = homeWins;
        this.homeLosses = homeLosses;
        this.awayWins = awayWins;
        this.awayLosses = awayLosses;
        this.scorebug = scorebug;
        this.subdivision = subdivision;
        this.timestamp = timestamp;
        this.winProbability = winProbability;
        this.isFinal = isFinal;
        this.season = season;
        this.waitingOn = waitingOn;
        this.winProbabilityPlot = winProbabilityPlot;
        this.scorePlot = scorePlot;
        this.numPlays = numPlays;
    }

    public OngoingGamesEntity() {
        
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
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

    public String getHomeCoach() {
        return homeCoach;
    }

    public void setHomeCoach(String homeCoach) {
        this.homeCoach = homeCoach;
    }

    public String getAwayCoach() {
        return awayCoach;
    }

    public void setAwayCoach(String awayCoach) {
        this.awayCoach = awayCoach;
    }

    public String getHomeOffensivePlaybook() {
        return homeOffensivePlaybook;
    }

    public void setHomeOffensivePlaybook(String homeOffensivePlaybook) {
        this.homeOffensivePlaybook = homeOffensivePlaybook;
    }

    public String getAwayOffensivePlaybook() {
        return awayOffensivePlaybook;
    }

    public void setAwayOffensivePlaybook(String awayOffensivePlaybook) {
        this.awayOffensivePlaybook = awayOffensivePlaybook;
    }

    public String getHomeDefensivePlaybook() {
        return homeDefensivePlaybook;
    }

    public void setHomeDefensivePlaybook(String homeDefensivePlaybook) {
        this.homeDefensivePlaybook = homeDefensivePlaybook;
    }

    public String getAwayDefensivePlaybook() {
        return awayDefensivePlaybook;
    }

    public void setAwayDefensivePlaybook(String awayDefensivePlaybook) {
        this.awayDefensivePlaybook = awayDefensivePlaybook;
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

    public String getPossession() {
        return possession;
    }

    public void setPossession(String possession) {
        this.possession = possession;
    }

    public Integer getQuarter() {
        return quarter;
    }

    public void setQuarter(Integer quarter) {
        this.quarter = quarter;
    }

    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    public Integer getBallLocation() {
        return ballLocation;
    }

    public void setBallLocation(Integer ballLocation) {
        this.ballLocation = ballLocation;
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

    public String getTvChannel() {
        return tvChannel;
    }

    public void setTvChannel(String tvChannel) {
        this.tvChannel = tvChannel;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getHomeWins() {
        return homeWins;
    }

    public void setHomeWins(Integer homeWins) {
        this.homeWins = homeWins;
    }

    public Integer getHomeLosses() {
        return homeLosses;
    }

    public void setHomeLosses(Integer homeLosses) {
        this.homeLosses = homeLosses;
    }

    public Integer getAwayWins() {
        return awayWins;
    }

    public void setAwayWins(Integer awayWins) {
        this.awayWins = awayWins;
    }

    public Integer getAwayLosses() {
        return awayLosses;
    }

    public void setAwayLosses(Integer awayLosses) {
        this.awayLosses = awayLosses;
    }

    public String getScorebug() {
        return scorebug;
    }

    public void setScorebug(String scorebug) {
        this.scorebug = scorebug;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Double getWinProbability() {
        return winProbability;
    }

    public void setWinProbability(Double winProbability) {
        this.winProbability = winProbability;
    }

    public Boolean getIsFinal() {
        return isFinal;
    }

    public void setIsFinal(Boolean isFinal) {
        this.isFinal = isFinal;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public String getWaitingOn() {
        return waitingOn;
    }

    public void setWaitingOn(String waitingOn) {
        this.waitingOn = waitingOn;
    }

    public String getWinProbabilityPlot() {
        return winProbabilityPlot;
    }

    public void setWinProbabilityPlot(String winProbabilityPlot) {
        this.winProbabilityPlot = winProbabilityPlot;
    }

    public String getScorePlot() {
        return scorePlot;
    }

    public void setScorePlot(String scorePlot) {
        this.scorePlot = scorePlot;
    }

    public Integer getNumPlays() {
        return numPlays;
    }

    public void setNumPlays(Integer numPlays) {
        this.numPlays = numPlays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OngoingGamesEntity that = (OngoingGamesEntity) o;
        return gameId == that.gameId && Objects.equals(homeTeam, that.homeTeam) && Objects.equals(awayTeam, that.awayTeam) && Objects.equals(homeCoach, that.homeCoach) && Objects.equals(awayCoach, that.awayCoach) && Objects.equals(homeOffensivePlaybook, that.homeOffensivePlaybook) && Objects.equals(awayOffensivePlaybook, that.awayOffensivePlaybook) && Objects.equals(homeDefensivePlaybook, that.homeDefensivePlaybook) && Objects.equals(awayDefensivePlaybook, that.awayDefensivePlaybook) && Objects.equals(homeScore, that.homeScore) && Objects.equals(awayScore, that.awayScore) && Objects.equals(possession, that.possession) && Objects.equals(quarter, that.quarter) && Objects.equals(clock, that.clock) && Objects.equals(ballLocation, that.ballLocation) && Objects.equals(down, that.down) && Objects.equals(yardsToGo, that.yardsToGo) && Objects.equals(tvChannel, that.tvChannel) && Objects.equals(startTime, that.startTime) && Objects.equals(location, that.location) && Objects.equals(homeWins, that.homeWins) && Objects.equals(homeLosses, that.homeLosses) && Objects.equals(awayWins, that.awayWins) && Objects.equals(awayLosses, that.awayLosses) && Objects.equals(scorebug, that.scorebug) && Objects.equals(subdivision, that.subdivision) && Objects.equals(timestamp, that.timestamp) && Objects.equals(winProbability, that.winProbability) && Objects.equals(isFinal, that.isFinal) && Objects.equals(season, that.season) && Objects.equals(waitingOn, that.waitingOn) && Objects.equals(winProbabilityPlot, that.winProbabilityPlot) && Objects.equals(scorePlot, that.scorePlot) && Objects.equals(numPlays, that.numPlays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId, homeTeam, awayTeam, homeCoach, awayCoach, homeOffensivePlaybook, awayOffensivePlaybook, homeDefensivePlaybook, awayDefensivePlaybook, homeScore, awayScore, possession, quarter, clock, ballLocation, down, yardsToGo, tvChannel, startTime, location, homeWins, homeLosses, awayWins, awayLosses, scorebug, subdivision, timestamp, winProbability, isFinal, season, waitingOn, winProbabilityPlot, scorePlot, numPlays);
    }

    @Override
    public String toString() {
        return "{\n" +
                "  \"gameId\": \"" + gameId + "\",\n" +
                "  \"homeTeam\": \"" + homeTeam + "\",\n" +
                "  \"awayTeam\": \"" + awayTeam + "\",\n" +
                "  \"homeCoach\": \"" + homeCoach + "\",\n" +
                "  \"awayCoach\": \"" + awayCoach + "\",\n" +
                "  \"homeOffensivePlaybook\": \"" + homeOffensivePlaybook + "\",\n" +
                "  \"awayOffensivePlaybook\": \"" + awayOffensivePlaybook + "\",\n" +
                "  \"homeDefensivePlaybook\": \"" + homeDefensivePlaybook + "\",\n" +
                "  \"awayDefensivePlaybook\": \"" + awayDefensivePlaybook + "\",\n" +
                "  \"homeScore\": " + homeScore + ",\n" +
                "  \"awayScore\": " + awayScore + ",\n" +
                "  \"possession\": \"" + possession + "\",\n" +
                "  \"quarter\": " + quarter + ",\n" +
                "  \"clock\": \"" + clock + "\",\n" +
                "  \"ballLocation\": " + ballLocation + ",\n" +
                "  \"down\": " + down + ",\n" +
                "  \"yardsToGo\": " + yardsToGo + ",\n" +
                "  \"tvChannel\": \"" + tvChannel + "\",\n" +
                "  \"startTime\": \"" + startTime + "\",\n" +
                "  \"location\": \"" + location + "\",\n" +
                "  \"homeWins\": " + homeWins + ",\n" +
                "  \"homeLosses\": " + homeLosses + ",\n" +
                "  \"awayWins\": " + awayWins + ",\n" +
                "  \"awayLosses\": " + awayLosses + ",\n" +
                "  \"scorebug\": \"" + scorebug + "\",\n" +
                "  \"subdivision\": \"" + subdivision + "\",\n" +
                "  \"timestamp\": \"" + timestamp + "\",\n" +
                "  \"winProbability\": " + winProbability + ",\n" +
                "  \"isFinal\": " + isFinal + ",\n" +
                "  \"season\": " + season + ",\n" +
                "  \"waitingOn\": \"" + waitingOn + "\",\n" +
                "  \"winProbabilityPlot\": \"" + winProbabilityPlot + "\",\n" +
                "  \"scorePlot\": \"" + scorePlot + "\",\n" +
                "  \"numPlays\": " + numPlays + "\n" +
                "}";
    }
}
