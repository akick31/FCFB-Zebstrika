package com.fcfb.fcfb_zebstrika.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "game_stats", schema = "fcfb_zebstrika")
public class GameStatsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "game_id")
    private String gameId;
    @Basic
    @Column(name = "home_team")
    private String homeTeam;
    @Basic
    @Column(name = "away_team")
    private String awayTeam;
    @Basic
    @Column(name = "home_team_rank")
    private Integer homeTeamRank;
    @Basic
    @Column(name = "away_team_rank")
    private Integer awayTeamRank;
    @Basic
    @Column(name = "start_time")
    private String startTime;
    @Basic
    @Column(name = "location")
    private String location;
    @Basic
    @Column(name = "tv_channel")
    private String tvChannel;
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
    @Column(name = "season")
    private Integer season;
    @Basic
    @Column(name = "subdivision")
    private String subdivision;
    @Basic
    @Column(name = "home_score")
    private Integer homeScore;
    @Basic
    @Column(name = "away_score")
    private Integer awayScore;
    @Basic
    @Column(name = "home_pass_attempts")
    private Integer homePassAttempts;
    @Basic
    @Column(name = "home_pass_completions")
    private Integer homePassCompletions;
    @Basic
    @Column(name = "home_pass_completion_percentage")
    private Double homePassCompletionPercentage;
    @Basic
    @Column(name = "home_pass_yards")
    private Integer homePassYards;
    @Basic
    @Column(name = "away_pass_attempts")
    private Integer awayPassAttempts;
    @Basic
    @Column(name = "away_pass_completions")
    private Integer awayPassCompletions;
    @Basic
    @Column(name = "away_pass_completion_percentage")
    private Double awayPassCompletionPercentage;
    @Basic
    @Column(name = "away_pass_yards")
    private Integer awayPassYards;
    @Basic
    @Column(name = "home_rush_attempts")
    private Integer homeRushAttempts;
    @Basic
    @Column(name = "home_rush_3_yards_or_more")
    private Integer homeRush3YardsOrMore;
    @Basic
    @Column(name = "home_rush_success_percentage")
    private Double homeRushSuccessPercentage;
    @Basic
    @Column(name = "home_rush_yards")
    private Integer homeRushYards;
    @Basic
    @Column(name = "away_rush_attempts")
    private Integer awayRushAttempts;
    @Basic
    @Column(name = "away_rush_3_yards_or_more")
    private Integer awayRush3YardsOrMore;
    @Basic
    @Column(name = "away_rush_success_percentage")
    private Double awayRushSuccessPercentage;
    @Basic
    @Column(name = "away_rush_yards")
    private Integer awayRushYards;
    @Basic
    @Column(name = "home_total_yards")
    private Integer homeTotalYards;
    @Basic
    @Column(name = "away_total_yards")
    private Integer awayTotalYards;
    @Basic
    @Column(name = "home_interceptions_lost")
    private Integer homeInterceptionsLost;
    @Basic
    @Column(name = "home_fumbles_lost")
    private Integer homeFumblesLost;
    @Basic
    @Column(name = "home_turnovers_lost")
    private Integer homeTurnoversLost;
    @Basic
    @Column(name = "home_turnover_touchdowns_lost")
    private Integer homeTurnoverTouchdownsLost;
    @Basic
    @Column(name = "away_interceptions_lost")
    private Integer awayInterceptionsLost;
    @Basic
    @Column(name = "away_home_fumbles_lost")
    private Integer awayHomeFumblesLost;
    @Basic
    @Column(name = "away_home_turnovers_lost")
    private Integer awayHomeTurnoversLost;
    @Basic
    @Column(name = "away_turnover_touchdowns_lost")
    private Integer awayTurnoverTouchdownsLost;
    @Basic
    @Column(name = "home_field_goal_made")
    private Integer homeFieldGoalMade;
    @Basic
    @Column(name = "home_field_goal_attempts")
    private Integer homeFieldGoalAttempts;
    @Basic
    @Column(name = "home_field_goal_percentage")
    private Double homeFieldGoalPercentage;
    @Basic
    @Column(name = "home_longest_field_goal")
    private Integer homeLongestFieldGoal;
    @Basic
    @Column(name = "home_blocked_opponent_field_goals")
    private Integer homeBlockedOpponentFieldGoals;
    @Basic
    @Column(name = "home_field_goal_touchdown")
    private Integer homeFieldGoalTouchdown;
    @Basic
    @Column(name = "away_field_goal_made")
    private Integer awayFieldGoalMade;
    @Basic
    @Column(name = "away_field_goal_attempts")
    private Integer awayFieldGoalAttempts;
    @Basic
    @Column(name = "away_field_goal_percentage")
    private Double awayFieldGoalPercentage;
    @Basic
    @Column(name = "away_longest_field_goal")
    private Integer awayLongestFieldGoal;
    @Basic
    @Column(name = "away_blocked_opponent_field_goals")
    private Integer awayBlockedOpponentFieldGoals;
    @Basic
    @Column(name = "away_field_goal_touchdown")
    private Integer awayFieldGoalTouchdown;
    @Basic
    @Column(name = "home_punts_attempted")
    private Integer homePuntsAttempted;
    @Basic
    @Column(name = "home_longest_punt")
    private Integer homeLongestPunt;
    @Basic
    @Column(name = "home_average_punt_length")
    private Double homeAveragePuntLength;
    @Basic
    @Column(name = "home_blocked_opponent_punt")
    private Integer homeBlockedOpponentPunt;
    @Basic
    @Column(name = "home_punt_return_td")
    private Integer homePuntReturnTd;
    @Basic
    @Column(name = "home_punt_return_td_percentage")
    private Double homePuntReturnTdPercentage;
    @Basic
    @Column(name = "away_punts_attempted")
    private Integer awayPuntsAttempted;
    @Basic
    @Column(name = "away_longest_punt")
    private Integer awayLongestPunt;
    @Basic
    @Column(name = "away_average_punt_length")
    private Double awayAveragePuntLength;
    @Basic
    @Column(name = "away_blocked_opponent_punt")
    private Integer awayBlockedOpponentPunt;
    @Basic
    @Column(name = "away_punt_return_td")
    private Integer awayPuntReturnTd;
    @Basic
    @Column(name = "away_punt_return_td_percentage")
    private Double awayPuntReturnTdPercentage;
    @Basic
    @Column(name = "home_number_of_kickoffs")
    private Integer homeNumberOfKickoffs;
    @Basic
    @Column(name = "home_onside_attempts")
    private Integer homeOnsideAttempts;
    @Basic
    @Column(name = "home_onside_success")
    private Integer homeOnsideSuccess;
    @Basic
    @Column(name = "home_onside_success_percentage")
    private Double homeOnsideSuccessPercentage;
    @Basic
    @Column(name = "home_normal_kickoff_attempts")
    private Integer homeNormalKickoffAttempts;
    @Basic
    @Column(name = "home_touchbacks")
    private Integer homeTouchbacks;
    @Basic
    @Column(name = "home_touchback_percentage")
    private Double homeTouchbackPercentage;
    @Basic
    @Column(name = "home_kick_return_td")
    private Integer homeKickReturnTd;
    @Basic
    @Column(name = "home_kick_return_td_percentage")
    private Double homeKickReturnTdPercentage;
    @Basic
    @Column(name = "away_number_of_kickoffs")
    private Integer awayNumberOfKickoffs;
    @Basic
    @Column(name = "away_onside_attempts")
    private Integer awayOnsideAttempts;
    @Basic
    @Column(name = "away_onside_success")
    private Integer awayOnsideSuccess;
    @Basic
    @Column(name = "away_onside_success_percentage")
    private Double awayOnsideSuccessPercentage;
    @Basic
    @Column(name = "away_normal_kickoff_attempts")
    private Integer awayNormalKickoffAttempts;
    @Basic
    @Column(name = "away_touchbacks")
    private Integer awayTouchbacks;
    @Basic
    @Column(name = "away_touchback_percentage")
    private Double awayTouchbackPercentage;
    @Basic
    @Column(name = "away_kick_return_td")
    private Integer awayKickReturnTd;
    @Basic
    @Column(name = "away_kick_return_td_percentage")
    private Double awayKickReturnTdPercentage;
    @Basic
    @Column(name = "home_number_of_drives")
    private Integer homeNumberOfDrives;
    @Basic
    @Column(name = "home_number_of_td_drives")
    private Integer homeNumberOfTdDrives;
    @Basic
    @Column(name = "home_td_drive_percentage")
    private Double homeTdDrivePercentage;
    @Basic
    @Column(name = "home_number_of_fg_drives")
    private Integer homeNumberOfFgDrives;
    @Basic
    @Column(name = "home_fg_drive_percentage")
    private Double homeFgDrivePercentage;
    @Basic
    @Column(name = "home_number_of_punt_drives")
    private Integer homeNumberOfPuntDrives;
    @Basic
    @Column(name = "home_punt_drive_percentage")
    private Double homePuntDrivePercentage;
    @Basic
    @Column(name = "home_number_of_turnover_drives")
    private Integer homeNumberOfTurnoverDrives;
    @Basic
    @Column(name = "home_turnover_drive_percentage")
    private Double homeTurnoverDrivePercentage;
    @Basic
    @Column(name = "away_number_of_drives")
    private Integer awayNumberOfDrives;
    @Basic
    @Column(name = "away_number_of_td_drives")
    private Integer awayNumberOfTdDrives;
    @Basic
    @Column(name = "away_td_drive_percentage")
    private Double awayTdDrivePercentage;
    @Basic
    @Column(name = "away_number_of_fg_drives")
    private Integer awayNumberOfFgDrives;
    @Basic
    @Column(name = "away_fg_drive_percentage")
    private Double awayFgDrivePercentage;
    @Basic
    @Column(name = "away_number_of_punt_drives")
    private Integer awayNumberOfPuntDrives;
    @Basic
    @Column(name = "away_punt_drive_percentage")
    private Double awayPuntDrivePercentage;
    @Basic
    @Column(name = "away_number_of_turnover_drives")
    private Integer awayNumberOfTurnoverDrives;
    @Basic
    @Column(name = "away_turnover_drive_percentage")
    private Double awayTurnoverDrivePercentage;
    @Basic
    @Column(name = "home_time_of_possession")
    private String homeTimeOfPossession;
    @Basic
    @Column(name = "away_time_of_possession")
    private String awayTimeOfPossession;
    @Basic
    @Column(name = "q1_home_score")
    private Integer q1HomeScore;
    @Basic
    @Column(name = "q2_home_score")
    private Integer q2HomeScore;
    @Basic
    @Column(name = "q3_home_score")
    private Integer q3HomeScore;
    @Basic
    @Column(name = "q4_home_score")
    private Integer q4HomeScore;
    @Basic
    @Column(name = "ot_home_score")
    private Integer otHomeScore;
    @Basic
    @Column(name = "q1_away_score")
    private Integer q1AwayScore;
    @Basic
    @Column(name = "q2_away_score")
    private Integer q2AwayScore;
    @Basic
    @Column(name = "q3_away_score")
    private Integer q3AwayScore;
    @Basic
    @Column(name = "q4_away_score")
    private Integer q4AwayScore;
    @Basic
    @Column(name = "ot_away_score")
    private Integer otAwayScore;
    @Basic
    @Column(name = "home_touchdowns")
    private Integer homeTouchdowns;
    @Basic
    @Column(name = "away_touchdowns")
    private Integer awayTouchdowns;
    @Basic
    @Column(name = "is_bowl")
    private Boolean isBowl;
    @Basic
    @Column(name = "is_playoffs")
    private Boolean isPlayoffs;
    @Basic
    @Column(name = "is_national_championship")
    private Boolean isNationalChampionship;
    @Basic
    @Column(name = "is_conference_game")
    private Boolean isConferenceGame;
    @Basic
    @Column(name = "is_division_game")
    private Boolean isDivisionGame;
    @Basic
    @Column(name = "scorebug")
    private String scorebug;
    @Basic
    @Column(name = "win_probability_plot")
    private String winProbabilityPlot;
    @Basic
    @Column(name = "score_plot_graph")
    private String scorePlotGraph;
    @Basic
    @Column(name = "is_final")
    private Boolean isFinal;
    @Basic
    @Column(name = "stats_updated")
    private Boolean statsUpdated;
    @Basic
    @Column(name = "average_home_offensive_diff")
    private Double averageHomeOffensiveDiff;
    @Basic
    @Column(name = "average_home_defensive_diff")
    private Double averageHomeDefensiveDiff;
    @Basic
    @Column(name = "average_home_specialteams_diff")
    private Double averageHomeSpecialteamsDiff;
    @Basic
    @Column(name = "average_away_offensive_diff")
    private Double averageAwayOffensiveDiff;
    @Basic
    @Column(name = "average_away_defensive_diff")
    private Double averageAwayDefensiveDiff;
    @Basic
    @Column(name = "average_away_specialteams_diff")
    private Double averageAwaySpecialteamsDiff;
    @Basic
    @Column(name = "home_average_yards_per_play")
    private Double homeAverageYardsPerPlay;
    @Basic
    @Column(name = "away_average_yards_per_play")
    private Double awayAverageYardsPerPlay;
    @Basic
    @Column(name = "home_third_down_conversion_success")
    private Integer homeThirdDownConversionSuccess;
    @Basic
    @Column(name = "home_third_down_conversion_attempts")
    private Integer homeThirdDownConversionAttempts;
    @Basic
    @Column(name = "home_third_down_conversion_percentage")
    private Double homeThirdDownConversionPercentage;
    @Basic
    @Column(name = "home_fourth_down_conversion_success")
    private Integer homeFourthDownConversionSuccess;
    @Basic
    @Column(name = "home_fourth_down_conversion_attempts")
    private Integer homeFourthDownConversionAttempts;
    @Basic
    @Column(name = "home_fourth_down_conversion_percentage")
    private Double homeFourthDownConversionPercentage;
    @Basic
    @Column(name = "away_third_down_conversion_success")
    private Integer awayThirdDownConversionSuccess;
    @Basic
    @Column(name = "away_third_down_conversion_attempts")
    private Integer awayThirdDownConversionAttempts;
    @Basic
    @Column(name = "away_third_down_conversion_percentage")
    private Double awayThirdDownConversionPercentage;
    @Basic
    @Column(name = "away_fourth_down_conversion_success")
    private Integer awayFourthDownConversionSuccess;
    @Basic
    @Column(name = "away_fourth_down_conversion_attempts")
    private Integer awayFourthDownConversionAttempts;
    @Basic
    @Column(name = "away_fourth_down_conversion_percentage")
    private Double awayFourthDownConversionPercentage;
    @Basic
    @Column(name = "home_largest_lead")
    private Integer homeLargestLead;
    @Basic
    @Column(name = "away_largest_lead")
    private Integer awayLargestLead;
    @Basic
    @Column(name = "home_pass_touchdowns")
    private Integer homePassTouchdowns;
    @Basic
    @Column(name = "home_rush_touchdowns")
    private Integer homeRushTouchdowns;
    @Basic
    @Column(name = "away_pass_touchdowns")
    private Integer awayPassTouchdowns;
    @Basic
    @Column(name = "away_rush_touchdowns")
    private Integer awayRushTouchdowns;
    @Basic
    @Column(name = "home_blocked_opponent_punt_td")
    private Integer homeBlockedOpponentPuntTd;
    @Basic
    @Column(name = "away_blocked_opponent_punt_td")
    private Integer awayBlockedOpponentPuntTd;
    @Basic
    @Column(name = "home_record")
    private String homeRecord;
    @Basic
    @Column(name = "away_record")
    private String awayRecord;

    public GameStatsEntity(String gameId, String homeTeam, String awayTeam, Integer homeTeamRank, Integer awayTeamRank, 
                           String startTime, String location, String tvChannel, String homeCoach, String awayCoach, 
                           String homeOffensivePlaybook, String awayOffensivePlaybook, String homeDefensivePlaybook, 
                           String awayDefensivePlaybook, Integer season, String subdivision, Integer homeScore,
                           Integer awayScore, Integer homePassAttempts, Integer homePassCompletions,
                           Double homePassCompletionPercentage, Integer homePassYards,
                           Integer awayPassAttempts, Integer awayPassCompletions, Double awayPassCompletionPercentage, 
                           Integer awayPassYards, Integer homeRushAttempts, Integer homeRush3YardsOrMore, 
                           Double homeRushSuccessPercentage, Integer homeRushYards, Integer awayRushAttempts, 
                           Integer awayRush3YardsOrMore, Double awayRushSuccessPercentage, Integer awayRushYards, 
                           Integer homeTotalYards, Integer awayTotalYards, Integer homeInterceptionsLost, 
                           Integer homeFumblesLost, Integer homeTurnoversLost, Integer homeTurnoverTouchdownsLost, 
                           Integer awayInterceptionsLost, Integer awayHomeFumblesLost, Integer awayHomeTurnoversLost, 
                           Integer awayTurnoverTouchdownsLost, Integer homeFieldGoalMade, Integer homeFieldGoalAttempts, 
                           Double homeFieldGoalPercentage, Integer homeLongestFieldGoal, 
                           Integer homeBlockedOpponentFieldGoals, Integer homeFieldGoalTouchdown, 
                           Integer awayFieldGoalMade, Integer awayFieldGoalAttempts, Double awayFieldGoalPercentage, 
                           Integer awayLongestFieldGoal, Integer awayBlockedOpponentFieldGoals, 
                           Integer awayFieldGoalTouchdown, Integer homePuntsAttempted, Integer homeLongestPunt, 
                           Double homeAveragePuntLength, Integer homeBlockedOpponentPunt, Integer homePuntReturnTd, 
                           Double homePuntReturnTdPercentage, Integer awayPuntsAttempted, Integer awayLongestPunt, 
                           Double awayAveragePuntLength, Integer awayBlockedOpponentPunt, Integer awayPuntReturnTd, 
                           Double awayPuntReturnTdPercentage, Integer homeNumberOfKickoffs, Integer homeOnsideAttempts, 
                           Integer homeOnsideSuccess, Double homeOnsideSuccessPercentage, 
                           Integer homeNormalKickoffAttempts, Integer homeTouchbacks, Double homeTouchbackPercentage, 
                           Integer homeKickReturnTd, Double homeKickReturnTdPercentage, Integer awayNumberOfKickoffs, 
                           Integer awayOnsideAttempts, Integer awayOnsideSuccess, Double awayOnsideSuccessPercentage, 
                           Integer awayNormalKickoffAttempts, Integer awayTouchbacks, Double awayTouchbackPercentage, 
                           Integer awayKickReturnTd, Double awayKickReturnTdPercentage, Integer homeNumberOfDrives, 
                           Integer homeNumberOfTdDrives, Double homeTdDrivePercentage, Integer homeNumberOfFgDrives, 
                           Double homeFgDrivePercentage, Integer homeNumberOfPuntDrives, Double homePuntDrivePercentage, 
                           Integer homeNumberOfTurnoverDrives, Double homeTurnoverDrivePercentage, 
                           Integer awayNumberOfDrives, Integer awayNumberOfTdDrives, Double awayTdDrivePercentage, 
                           Integer awayNumberOfFgDrives, Double awayFgDrivePercentage, Integer awayNumberOfPuntDrives, 
                           Double awayPuntDrivePercentage, Integer awayNumberOfTurnoverDrives, 
                           Double awayTurnoverDrivePercentage, String homeTimeOfPossession, String awayTimeOfPossession, 
                           Integer q1HomeScore, Integer q2HomeScore, Integer q3HomeScore, Integer q4HomeScore, 
                           Integer otHomeScore, Integer q1AwayScore, Integer q2AwayScore, Integer q3AwayScore, 
                           Integer q4AwayScore, Integer otAwayScore, Integer homeTouchdowns, Integer awayTouchdowns, 
                           Boolean isBowl, Boolean isPlayoffs, Boolean isNationalChampionship, Boolean isConferenceGame, 
                           Boolean isDivisionGame, String scorebug, String winProbabilityPlot, String scorePlotGraph, 
                           Boolean isFinal, Boolean statsUpdated, Double averageHomeOffensiveDiff,
                           Double averageHomeDefensiveDiff, Double averageHomeSpecialteamsDiff, 
                           Double averageAwayOffensiveDiff, Double averageAwayDefensiveDiff, 
                           Double averageAwaySpecialteamsDiff, Double homeAverageYardsPerPlay, 
                           Double awayAverageYardsPerPlay, Integer homeThirdDownConversionSuccess, 
                           Integer homeThirdDownConversionAttempts, Double homeThirdDownConversionPercentage, 
                           Integer homeFourthDownConversionSuccess, Integer homeFourthDownConversionAttempts, 
                           Double homeFourthDownConversionPercentage, Integer awayThirdDownConversionSuccess, 
                           Integer awayThirdDownConversionAttempts, Double awayThirdDownConversionPercentage, 
                           Integer awayFourthDownConversionSuccess, Integer awayFourthDownConversionAttempts, 
                           Double awayFourthDownConversionPercentage, Integer homeLargestLead, Integer awayLargestLead, 
                           Integer homePassTouchdowns, Integer homeRushTouchdowns, Integer awayPassTouchdowns, 
                           Integer awayRushTouchdowns, Integer homeBlockedOpponentPuntTd, 
                           Integer awayBlockedOpponentPuntTd, String homeRecord, String awayRecord) {
        this.gameId = gameId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeTeamRank = homeTeamRank;
        this.awayTeamRank = awayTeamRank;
        this.startTime = startTime;
        this.location = location;
        this.tvChannel = tvChannel;
        this.homeCoach = homeCoach;
        this.awayCoach = awayCoach;
        this.homeOffensivePlaybook = homeOffensivePlaybook;
        this.awayOffensivePlaybook = awayOffensivePlaybook;
        this.homeDefensivePlaybook = homeDefensivePlaybook;
        this.awayDefensivePlaybook = awayDefensivePlaybook;
        this.season = season;
        this.subdivision = subdivision;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.homePassAttempts = homePassAttempts;
        this.homePassCompletions = homePassCompletions;
        this.homePassCompletionPercentage = homePassCompletionPercentage;
        this.homePassYards = homePassYards;
        this.awayPassAttempts = awayPassAttempts;
        this.awayPassCompletions = awayPassCompletions;
        this.awayPassCompletionPercentage = awayPassCompletionPercentage;
        this.awayPassYards = awayPassYards;
        this.homeRushAttempts = homeRushAttempts;
        this.homeRush3YardsOrMore = homeRush3YardsOrMore;
        this.homeRushSuccessPercentage = homeRushSuccessPercentage;
        this.homeRushYards = homeRushYards;
        this.awayRushAttempts = awayRushAttempts;
        this.awayRush3YardsOrMore = awayRush3YardsOrMore;
        this.awayRushSuccessPercentage = awayRushSuccessPercentage;
        this.awayRushYards = awayRushYards;
        this.homeTotalYards = homeTotalYards;
        this.awayTotalYards = awayTotalYards;
        this.homeInterceptionsLost = homeInterceptionsLost;
        this.homeFumblesLost = homeFumblesLost;
        this.homeTurnoversLost = homeTurnoversLost;
        this.homeTurnoverTouchdownsLost = homeTurnoverTouchdownsLost;
        this.awayInterceptionsLost = awayInterceptionsLost;
        this.awayHomeFumblesLost = awayHomeFumblesLost;
        this.awayHomeTurnoversLost = awayHomeTurnoversLost;
        this.awayTurnoverTouchdownsLost = awayTurnoverTouchdownsLost;
        this.homeFieldGoalMade = homeFieldGoalMade;
        this.homeFieldGoalAttempts = homeFieldGoalAttempts;
        this.homeFieldGoalPercentage = homeFieldGoalPercentage;
        this.homeLongestFieldGoal = homeLongestFieldGoal;
        this.homeBlockedOpponentFieldGoals = homeBlockedOpponentFieldGoals;
        this.homeFieldGoalTouchdown = homeFieldGoalTouchdown;
        this.awayFieldGoalMade = awayFieldGoalMade;
        this.awayFieldGoalAttempts = awayFieldGoalAttempts;
        this.awayFieldGoalPercentage = awayFieldGoalPercentage;
        this.awayLongestFieldGoal = awayLongestFieldGoal;
        this.awayBlockedOpponentFieldGoals = awayBlockedOpponentFieldGoals;
        this.awayFieldGoalTouchdown = awayFieldGoalTouchdown;
        this.homePuntsAttempted = homePuntsAttempted;
        this.homeLongestPunt = homeLongestPunt;
        this.homeAveragePuntLength = homeAveragePuntLength;
        this.homeBlockedOpponentPunt = homeBlockedOpponentPunt;
        this.homePuntReturnTd = homePuntReturnTd;
        this.homePuntReturnTdPercentage = homePuntReturnTdPercentage;
        this.awayPuntsAttempted = awayPuntsAttempted;
        this.awayLongestPunt = awayLongestPunt;
        this.awayAveragePuntLength = awayAveragePuntLength;
        this.awayBlockedOpponentPunt = awayBlockedOpponentPunt;
        this.awayPuntReturnTd = awayPuntReturnTd;
        this.awayPuntReturnTdPercentage = awayPuntReturnTdPercentage;
        this.homeNumberOfKickoffs = homeNumberOfKickoffs;
        this.homeOnsideAttempts = homeOnsideAttempts;
        this.homeOnsideSuccess = homeOnsideSuccess;
        this.homeOnsideSuccessPercentage = homeOnsideSuccessPercentage;
        this.homeNormalKickoffAttempts = homeNormalKickoffAttempts;
        this.homeTouchbacks = homeTouchbacks;
        this.homeTouchbackPercentage = homeTouchbackPercentage;
        this.homeKickReturnTd = homeKickReturnTd;
        this.homeKickReturnTdPercentage = homeKickReturnTdPercentage;
        this.awayNumberOfKickoffs = awayNumberOfKickoffs;
        this.awayOnsideAttempts = awayOnsideAttempts;
        this.awayOnsideSuccess = awayOnsideSuccess;
        this.awayOnsideSuccessPercentage = awayOnsideSuccessPercentage;
        this.awayNormalKickoffAttempts = awayNormalKickoffAttempts;
        this.awayTouchbacks = awayTouchbacks;
        this.awayTouchbackPercentage = awayTouchbackPercentage;
        this.awayKickReturnTd = awayKickReturnTd;
        this.awayKickReturnTdPercentage = awayKickReturnTdPercentage;
        this.homeNumberOfDrives = homeNumberOfDrives;
        this.homeNumberOfTdDrives = homeNumberOfTdDrives;
        this.homeTdDrivePercentage = homeTdDrivePercentage;
        this.homeNumberOfFgDrives = homeNumberOfFgDrives;
        this.homeFgDrivePercentage = homeFgDrivePercentage;
        this.homeNumberOfPuntDrives = homeNumberOfPuntDrives;
        this.homePuntDrivePercentage = homePuntDrivePercentage;
        this.homeNumberOfTurnoverDrives = homeNumberOfTurnoverDrives;
        this.homeTurnoverDrivePercentage = homeTurnoverDrivePercentage;
        this.awayNumberOfDrives = awayNumberOfDrives;
        this.awayNumberOfTdDrives = awayNumberOfTdDrives;
        this.awayTdDrivePercentage = awayTdDrivePercentage;
        this.awayNumberOfFgDrives = awayNumberOfFgDrives;
        this.awayFgDrivePercentage = awayFgDrivePercentage;
        this.awayNumberOfPuntDrives = awayNumberOfPuntDrives;
        this.awayPuntDrivePercentage = awayPuntDrivePercentage;
        this.awayNumberOfTurnoverDrives = awayNumberOfTurnoverDrives;
        this.awayTurnoverDrivePercentage = awayTurnoverDrivePercentage;
        this.homeTimeOfPossession = homeTimeOfPossession;
        this.awayTimeOfPossession = awayTimeOfPossession;
        this.q1HomeScore = q1HomeScore;
        this.q2HomeScore = q2HomeScore;
        this.q3HomeScore = q3HomeScore;
        this.q4HomeScore = q4HomeScore;
        this.otHomeScore = otHomeScore;
        this.q1AwayScore = q1AwayScore;
        this.q2AwayScore = q2AwayScore;
        this.q3AwayScore = q3AwayScore;
        this.q4AwayScore = q4AwayScore;
        this.otAwayScore = otAwayScore;
        this.homeTouchdowns = homeTouchdowns;
        this.awayTouchdowns = awayTouchdowns;
        this.isBowl = isBowl;
        this.isPlayoffs = isPlayoffs;
        this.isNationalChampionship = isNationalChampionship;
        this.isConferenceGame = isConferenceGame;
        this.isDivisionGame = isDivisionGame;
        this.scorebug = scorebug;
        this.winProbabilityPlot = winProbabilityPlot;
        this.scorePlotGraph = scorePlotGraph;
        this.isFinal = isFinal;
        this.statsUpdated = statsUpdated;
        this.averageHomeOffensiveDiff = averageHomeOffensiveDiff;
        this.averageHomeDefensiveDiff = averageHomeDefensiveDiff;
        this.averageHomeSpecialteamsDiff = averageHomeSpecialteamsDiff;
        this.averageAwayOffensiveDiff = averageAwayOffensiveDiff;
        this.averageAwayDefensiveDiff = averageAwayDefensiveDiff;
        this.averageAwaySpecialteamsDiff = averageAwaySpecialteamsDiff;
        this.homeAverageYardsPerPlay = homeAverageYardsPerPlay;
        this.awayAverageYardsPerPlay = awayAverageYardsPerPlay;
        this.homeThirdDownConversionSuccess = homeThirdDownConversionSuccess;
        this.homeThirdDownConversionAttempts = homeThirdDownConversionAttempts;
        this.homeThirdDownConversionPercentage = homeThirdDownConversionPercentage;
        this.homeFourthDownConversionSuccess = homeFourthDownConversionSuccess;
        this.homeFourthDownConversionAttempts = homeFourthDownConversionAttempts;
        this.homeFourthDownConversionPercentage = homeFourthDownConversionPercentage;
        this.awayThirdDownConversionSuccess = awayThirdDownConversionSuccess;
        this.awayThirdDownConversionAttempts = awayThirdDownConversionAttempts;
        this.awayThirdDownConversionPercentage = awayThirdDownConversionPercentage;
        this.awayFourthDownConversionSuccess = awayFourthDownConversionSuccess;
        this.awayFourthDownConversionAttempts = awayFourthDownConversionAttempts;
        this.awayFourthDownConversionPercentage = awayFourthDownConversionPercentage;
        this.homeLargestLead = homeLargestLead;
        this.awayLargestLead = awayLargestLead;
        this.homePassTouchdowns = homePassTouchdowns;
        this.homeRushTouchdowns = homeRushTouchdowns;
        this.awayPassTouchdowns = awayPassTouchdowns;
        this.awayRushTouchdowns = awayRushTouchdowns;
        this.homeBlockedOpponentPuntTd = homeBlockedOpponentPuntTd;
        this.awayBlockedOpponentPuntTd = awayBlockedOpponentPuntTd;
        this.homeRecord = homeRecord;
        this.awayRecord = awayRecord;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
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

    public Integer getHomeTeamRank() {
        return homeTeamRank;
    }

    public void setHomeTeamRank(Integer homeTeamRank) {
        this.homeTeamRank = homeTeamRank;
    }

    public Integer getAwayTeamRank() {
        return awayTeamRank;
    }

    public void setAwayTeamRank(Integer awayTeamRank) {
        this.awayTeamRank = awayTeamRank;
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

    public String getTvChannel() {
        return tvChannel;
    }

    public void setTvChannel(String tvChannel) {
        this.tvChannel = tvChannel;
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

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
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

    public Integer getHomePassAttempts() {
        return homePassAttempts;
    }

    public void setHomePassAttempts(Integer homePassAttempts) {
        this.homePassAttempts = homePassAttempts;
    }

    public Integer getHomePassCompletions() {
        return homePassCompletions;
    }

    public void setHomePassCompletions(Integer homePassCompletions) {
        this.homePassCompletions = homePassCompletions;
    }

    public Double getHomePassCompletionPercentage() {
        return homePassCompletionPercentage;
    }

    public void setHomePassCompletionPercentage(Double homePassCompletionPercentage) {
        this.homePassCompletionPercentage = homePassCompletionPercentage;
    }

    public Integer getHomePassYards() {
        return homePassYards;
    }

    public void setHomePassYards(Integer homePassYards) {
        this.homePassYards = homePassYards;
    }

    public Integer getAwayPassAttempts() {
        return awayPassAttempts;
    }

    public void setAwayPassAttempts(Integer awayPassAttempts) {
        this.awayPassAttempts = awayPassAttempts;
    }

    public Integer getAwayPassCompletions() {
        return awayPassCompletions;
    }

    public void setAwayPassCompletions(Integer awayPassCompletions) {
        this.awayPassCompletions = awayPassCompletions;
    }

    public Double getAwayPassCompletionPercentage() {
        return awayPassCompletionPercentage;
    }

    public void setAwayPassCompletionPercentage(Double awayPassCompletionPercentage) {
        this.awayPassCompletionPercentage = awayPassCompletionPercentage;
    }

    public Integer getAwayPassYards() {
        return awayPassYards;
    }

    public void setAwayPassYards(Integer awayPassYards) {
        this.awayPassYards = awayPassYards;
    }

    public Integer getHomeRushAttempts() {
        return homeRushAttempts;
    }

    public void setHomeRushAttempts(Integer homeRushAttempts) {
        this.homeRushAttempts = homeRushAttempts;
    }

    public Integer getHomeRush3YardsOrMore() {
        return homeRush3YardsOrMore;
    }

    public void setHomeRush3YardsOrMore(Integer homeRush3YardsOrMore) {
        this.homeRush3YardsOrMore = homeRush3YardsOrMore;
    }

    public Double getHomeRushSuccessPercentage() {
        return homeRushSuccessPercentage;
    }

    public void setHomeRushSuccessPercentage(Double homeRushSuccessPercentage) {
        this.homeRushSuccessPercentage = homeRushSuccessPercentage;
    }

    public Integer getHomeRushYards() {
        return homeRushYards;
    }

    public void setHomeRushYards(Integer homeRushYards) {
        this.homeRushYards = homeRushYards;
    }

    public Integer getAwayRushAttempts() {
        return awayRushAttempts;
    }

    public void setAwayRushAttempts(Integer awayRushAttempts) {
        this.awayRushAttempts = awayRushAttempts;
    }

    public Integer getAwayRush3YardsOrMore() {
        return awayRush3YardsOrMore;
    }

    public void setAwayRush3YardsOrMore(Integer awayRush3YardsOrMore) {
        this.awayRush3YardsOrMore = awayRush3YardsOrMore;
    }

    public Double getAwayRushSuccessPercentage() {
        return awayRushSuccessPercentage;
    }

    public void setAwayRushSuccessPercentage(Double awayRushSuccessPercentage) {
        this.awayRushSuccessPercentage = awayRushSuccessPercentage;
    }

    public Integer getAwayRushYards() {
        return awayRushYards;
    }

    public void setAwayRushYards(Integer awayRushYards) {
        this.awayRushYards = awayRushYards;
    }

    public Integer getHomeTotalYards() {
        return homeTotalYards;
    }

    public void setHomeTotalYards(Integer homeTotalYards) {
        this.homeTotalYards = homeTotalYards;
    }

    public Integer getAwayTotalYards() {
        return awayTotalYards;
    }

    public void setAwayTotalYards(Integer awayTotalYards) {
        this.awayTotalYards = awayTotalYards;
    }

    public Integer getHomeInterceptionsLost() {
        return homeInterceptionsLost;
    }

    public void setHomeInterceptionsLost(Integer homeInterceptionsLost) {
        this.homeInterceptionsLost = homeInterceptionsLost;
    }

    public Integer getHomeFumblesLost() {
        return homeFumblesLost;
    }

    public void setHomeFumblesLost(Integer homeFumblesLost) {
        this.homeFumblesLost = homeFumblesLost;
    }

    public Integer getHomeTurnoversLost() {
        return homeTurnoversLost;
    }

    public void setHomeTurnoversLost(Integer homeTurnoversLost) {
        this.homeTurnoversLost = homeTurnoversLost;
    }

    public Integer getHomeTurnoverTouchdownsLost() {
        return homeTurnoverTouchdownsLost;
    }

    public void setHomeTurnoverTouchdownsLost(Integer homeTurnoverTouchdownsLost) {
        this.homeTurnoverTouchdownsLost = homeTurnoverTouchdownsLost;
    }

    public Integer getAwayInterceptionsLost() {
        return awayInterceptionsLost;
    }

    public void setAwayInterceptionsLost(Integer awayInterceptionsLost) {
        this.awayInterceptionsLost = awayInterceptionsLost;
    }

    public Integer getAwayHomeFumblesLost() {
        return awayHomeFumblesLost;
    }

    public void setAwayHomeFumblesLost(Integer awayHomeFumblesLost) {
        this.awayHomeFumblesLost = awayHomeFumblesLost;
    }

    public Integer getAwayHomeTurnoversLost() {
        return awayHomeTurnoversLost;
    }

    public void setAwayHomeTurnoversLost(Integer awayHomeTurnoversLost) {
        this.awayHomeTurnoversLost = awayHomeTurnoversLost;
    }

    public Integer getAwayTurnoverTouchdownsLost() {
        return awayTurnoverTouchdownsLost;
    }

    public void setAwayTurnoverTouchdownsLost(Integer awayTurnoverTouchdownsLost) {
        this.awayTurnoverTouchdownsLost = awayTurnoverTouchdownsLost;
    }

    public Integer getHomeFieldGoalMade() {
        return homeFieldGoalMade;
    }

    public void setHomeFieldGoalMade(Integer homeFieldGoalMade) {
        this.homeFieldGoalMade = homeFieldGoalMade;
    }

    public Integer getHomeFieldGoalAttempts() {
        return homeFieldGoalAttempts;
    }

    public void setHomeFieldGoalAttempts(Integer homeFieldGoalAttempts) {
        this.homeFieldGoalAttempts = homeFieldGoalAttempts;
    }

    public Double getHomeFieldGoalPercentage() {
        return homeFieldGoalPercentage;
    }

    public void setHomeFieldGoalPercentage(Double homeFieldGoalPercentage) {
        this.homeFieldGoalPercentage = homeFieldGoalPercentage;
    }

    public Integer getHomeLongestFieldGoal() {
        return homeLongestFieldGoal;
    }

    public void setHomeLongestFieldGoal(Integer homeLongestFieldGoal) {
        this.homeLongestFieldGoal = homeLongestFieldGoal;
    }

    public Integer getHomeBlockedOpponentFieldGoals() {
        return homeBlockedOpponentFieldGoals;
    }

    public void setHomeBlockedOpponentFieldGoals(Integer homeBlockedOpponentFieldGoals) {
        this.homeBlockedOpponentFieldGoals = homeBlockedOpponentFieldGoals;
    }

    public Integer getHomeFieldGoalTouchdown() {
        return homeFieldGoalTouchdown;
    }

    public void setHomeFieldGoalTouchdown(Integer homeFieldGoalTouchdown) {
        this.homeFieldGoalTouchdown = homeFieldGoalTouchdown;
    }

    public Integer getAwayFieldGoalMade() {
        return awayFieldGoalMade;
    }

    public void setAwayFieldGoalMade(Integer awayFieldGoalMade) {
        this.awayFieldGoalMade = awayFieldGoalMade;
    }

    public Integer getAwayFieldGoalAttempts() {
        return awayFieldGoalAttempts;
    }

    public void setAwayFieldGoalAttempts(Integer awayFieldGoalAttempts) {
        this.awayFieldGoalAttempts = awayFieldGoalAttempts;
    }

    public Double getAwayFieldGoalPercentage() {
        return awayFieldGoalPercentage;
    }

    public void setAwayFieldGoalPercentage(Double awayFieldGoalPercentage) {
        this.awayFieldGoalPercentage = awayFieldGoalPercentage;
    }

    public Integer getAwayLongestFieldGoal() {
        return awayLongestFieldGoal;
    }

    public void setAwayLongestFieldGoal(Integer awayLongestFieldGoal) {
        this.awayLongestFieldGoal = awayLongestFieldGoal;
    }

    public Integer getAwayBlockedOpponentFieldGoals() {
        return awayBlockedOpponentFieldGoals;
    }

    public void setAwayBlockedOpponentFieldGoals(Integer awayBlockedOpponentFieldGoals) {
        this.awayBlockedOpponentFieldGoals = awayBlockedOpponentFieldGoals;
    }

    public Integer getAwayFieldGoalTouchdown() {
        return awayFieldGoalTouchdown;
    }

    public void setAwayFieldGoalTouchdown(Integer awayFieldGoalTouchdown) {
        this.awayFieldGoalTouchdown = awayFieldGoalTouchdown;
    }

    public Integer getHomePuntsAttempted() {
        return homePuntsAttempted;
    }

    public void setHomePuntsAttempted(Integer homePuntsAttempted) {
        this.homePuntsAttempted = homePuntsAttempted;
    }

    public Integer getHomeLongestPunt() {
        return homeLongestPunt;
    }

    public void setHomeLongestPunt(Integer homeLongestPunt) {
        this.homeLongestPunt = homeLongestPunt;
    }

    public Double getHomeAveragePuntLength() {
        return homeAveragePuntLength;
    }

    public void setHomeAveragePuntLength(Double homeAveragePuntLength) {
        this.homeAveragePuntLength = homeAveragePuntLength;
    }

    public Integer getHomeBlockedOpponentPunt() {
        return homeBlockedOpponentPunt;
    }

    public void setHomeBlockedOpponentPunt(Integer homeBlockedOpponentPunt) {
        this.homeBlockedOpponentPunt = homeBlockedOpponentPunt;
    }

    public Integer getHomePuntReturnTd() {
        return homePuntReturnTd;
    }

    public void setHomePuntReturnTd(Integer homePuntReturnTd) {
        this.homePuntReturnTd = homePuntReturnTd;
    }

    public Double getHomePuntReturnTdPercentage() {
        return homePuntReturnTdPercentage;
    }

    public void setHomePuntReturnTdPercentage(Double homePuntReturnTdPercentage) {
        this.homePuntReturnTdPercentage = homePuntReturnTdPercentage;
    }

    public Integer getAwayPuntsAttempted() {
        return awayPuntsAttempted;
    }

    public void setAwayPuntsAttempted(Integer awayPuntsAttempted) {
        this.awayPuntsAttempted = awayPuntsAttempted;
    }

    public Integer getAwayLongestPunt() {
        return awayLongestPunt;
    }

    public void setAwayLongestPunt(Integer awayLongestPunt) {
        this.awayLongestPunt = awayLongestPunt;
    }

    public Double getAwayAveragePuntLength() {
        return awayAveragePuntLength;
    }

    public void setAwayAveragePuntLength(Double awayAveragePuntLength) {
        this.awayAveragePuntLength = awayAveragePuntLength;
    }

    public Integer getAwayBlockedOpponentPunt() {
        return awayBlockedOpponentPunt;
    }

    public void setAwayBlockedOpponentPunt(Integer awayBlockedOpponentPunt) {
        this.awayBlockedOpponentPunt = awayBlockedOpponentPunt;
    }

    public Integer getAwayPuntReturnTd() {
        return awayPuntReturnTd;
    }

    public void setAwayPuntReturnTd(Integer awayPuntReturnTd) {
        this.awayPuntReturnTd = awayPuntReturnTd;
    }

    public Double getAwayPuntReturnTdPercentage() {
        return awayPuntReturnTdPercentage;
    }

    public void setAwayPuntReturnTdPercentage(Double awayPuntReturnTdPercentage) {
        this.awayPuntReturnTdPercentage = awayPuntReturnTdPercentage;
    }

    public Integer getHomeNumberOfKickoffs() {
        return homeNumberOfKickoffs;
    }

    public void setHomeNumberOfKickoffs(Integer homeNumberOfKickoffs) {
        this.homeNumberOfKickoffs = homeNumberOfKickoffs;
    }

    public Integer getHomeOnsideAttempts() {
        return homeOnsideAttempts;
    }

    public void setHomeOnsideAttempts(Integer homeOnsideAttempts) {
        this.homeOnsideAttempts = homeOnsideAttempts;
    }

    public Integer getHomeOnsideSuccess() {
        return homeOnsideSuccess;
    }

    public void setHomeOnsideSuccess(Integer homeOnsideSuccess) {
        this.homeOnsideSuccess = homeOnsideSuccess;
    }

    public Double getHomeOnsideSuccessPercentage() {
        return homeOnsideSuccessPercentage;
    }

    public void setHomeOnsideSuccessPercentage(Double homeOnsideSuccessPercentage) {
        this.homeOnsideSuccessPercentage = homeOnsideSuccessPercentage;
    }

    public Integer getHomeNormalKickoffAttempts() {
        return homeNormalKickoffAttempts;
    }

    public void setHomeNormalKickoffAttempts(Integer homeNormalKickoffAttempts) {
        this.homeNormalKickoffAttempts = homeNormalKickoffAttempts;
    }

    public Integer getHomeTouchbacks() {
        return homeTouchbacks;
    }

    public void setHomeTouchbacks(Integer homeTouchbacks) {
        this.homeTouchbacks = homeTouchbacks;
    }

    public Double getHomeTouchbackPercentage() {
        return homeTouchbackPercentage;
    }

    public void setHomeTouchbackPercentage(Double homeTouchbackPercentage) {
        this.homeTouchbackPercentage = homeTouchbackPercentage;
    }

    public Integer getHomeKickReturnTd() {
        return homeKickReturnTd;
    }

    public void setHomeKickReturnTd(Integer homeKickReturnTd) {
        this.homeKickReturnTd = homeKickReturnTd;
    }

    public Double getHomeKickReturnTdPercentage() {
        return homeKickReturnTdPercentage;
    }

    public void setHomeKickReturnTdPercentage(Double homeKickReturnTdPercentage) {
        this.homeKickReturnTdPercentage = homeKickReturnTdPercentage;
    }

    public Integer getAwayNumberOfKickoffs() {
        return awayNumberOfKickoffs;
    }

    public void setAwayNumberOfKickoffs(Integer awayNumberOfKickoffs) {
        this.awayNumberOfKickoffs = awayNumberOfKickoffs;
    }

    public Integer getAwayOnsideAttempts() {
        return awayOnsideAttempts;
    }

    public void setAwayOnsideAttempts(Integer awayOnsideAttempts) {
        this.awayOnsideAttempts = awayOnsideAttempts;
    }

    public Integer getAwayOnsideSuccess() {
        return awayOnsideSuccess;
    }

    public void setAwayOnsideSuccess(Integer awayOnsideSuccess) {
        this.awayOnsideSuccess = awayOnsideSuccess;
    }

    public Double getAwayOnsideSuccessPercentage() {
        return awayOnsideSuccessPercentage;
    }

    public void setAwayOnsideSuccessPercentage(Double awayOnsideSuccessPercentage) {
        this.awayOnsideSuccessPercentage = awayOnsideSuccessPercentage;
    }

    public Integer getAwayNormalKickoffAttempts() {
        return awayNormalKickoffAttempts;
    }

    public void setAwayNormalKickoffAttempts(Integer awayNormalKickoffAttempts) {
        this.awayNormalKickoffAttempts = awayNormalKickoffAttempts;
    }

    public Integer getAwayTouchbacks() {
        return awayTouchbacks;
    }

    public void setAwayTouchbacks(Integer awayTouchbacks) {
        this.awayTouchbacks = awayTouchbacks;
    }

    public Double getAwayTouchbackPercentage() {
        return awayTouchbackPercentage;
    }

    public void setAwayTouchbackPercentage(Double awayTouchbackPercentage) {
        this.awayTouchbackPercentage = awayTouchbackPercentage;
    }

    public Integer getAwayKickReturnTd() {
        return awayKickReturnTd;
    }

    public void setAwayKickReturnTd(Integer awayKickReturnTd) {
        this.awayKickReturnTd = awayKickReturnTd;
    }

    public Double getAwayKickReturnTdPercentage() {
        return awayKickReturnTdPercentage;
    }

    public void setAwayKickReturnTdPercentage(Double awayKickReturnTdPercentage) {
        this.awayKickReturnTdPercentage = awayKickReturnTdPercentage;
    }

    public Integer getHomeNumberOfDrives() {
        return homeNumberOfDrives;
    }

    public void setHomeNumberOfDrives(Integer homeNumberOfDrives) {
        this.homeNumberOfDrives = homeNumberOfDrives;
    }

    public Integer getHomeNumberOfTdDrives() {
        return homeNumberOfTdDrives;
    }

    public void setHomeNumberOfTdDrives(Integer homeNumberOfTdDrives) {
        this.homeNumberOfTdDrives = homeNumberOfTdDrives;
    }

    public Double getHomeTdDrivePercentage() {
        return homeTdDrivePercentage;
    }

    public void setHomeTdDrivePercentage(Double homeTdDrivePercentage) {
        this.homeTdDrivePercentage = homeTdDrivePercentage;
    }

    public Integer getHomeNumberOfFgDrives() {
        return homeNumberOfFgDrives;
    }

    public void setHomeNumberOfFgDrives(Integer homeNumberOfFgDrives) {
        this.homeNumberOfFgDrives = homeNumberOfFgDrives;
    }

    public Double getHomeFgDrivePercentage() {
        return homeFgDrivePercentage;
    }

    public void setHomeFgDrivePercentage(Double homeFgDrivePercentage) {
        this.homeFgDrivePercentage = homeFgDrivePercentage;
    }

    public Integer getHomeNumberOfPuntDrives() {
        return homeNumberOfPuntDrives;
    }

    public void setHomeNumberOfPuntDrives(Integer homeNumberOfPuntDrives) {
        this.homeNumberOfPuntDrives = homeNumberOfPuntDrives;
    }

    public Double getHomePuntDrivePercentage() {
        return homePuntDrivePercentage;
    }

    public void setHomePuntDrivePercentage(Double homePuntDrivePercentage) {
        this.homePuntDrivePercentage = homePuntDrivePercentage;
    }

    public Integer getHomeNumberOfTurnoverDrives() {
        return homeNumberOfTurnoverDrives;
    }

    public void setHomeNumberOfTurnoverDrives(Integer homeNumberOfTurnoverDrives) {
        this.homeNumberOfTurnoverDrives = homeNumberOfTurnoverDrives;
    }

    public Double getHomeTurnoverDrivePercentage() {
        return homeTurnoverDrivePercentage;
    }

    public void setHomeTurnoverDrivePercentage(Double homeTurnoverDrivePercentage) {
        this.homeTurnoverDrivePercentage = homeTurnoverDrivePercentage;
    }

    public Integer getAwayNumberOfDrives() {
        return awayNumberOfDrives;
    }

    public void setAwayNumberOfDrives(Integer awayNumberOfDrives) {
        this.awayNumberOfDrives = awayNumberOfDrives;
    }

    public Integer getAwayNumberOfTdDrives() {
        return awayNumberOfTdDrives;
    }

    public void setAwayNumberOfTdDrives(Integer awayNumberOfTdDrives) {
        this.awayNumberOfTdDrives = awayNumberOfTdDrives;
    }

    public Double getAwayTdDrivePercentage() {
        return awayTdDrivePercentage;
    }

    public void setAwayTdDrivePercentage(Double awayTdDrivePercentage) {
        this.awayTdDrivePercentage = awayTdDrivePercentage;
    }

    public Integer getAwayNumberOfFgDrives() {
        return awayNumberOfFgDrives;
    }

    public void setAwayNumberOfFgDrives(Integer awayNumberOfFgDrives) {
        this.awayNumberOfFgDrives = awayNumberOfFgDrives;
    }

    public Double getAwayFgDrivePercentage() {
        return awayFgDrivePercentage;
    }

    public void setAwayFgDrivePercentage(Double awayFgDrivePercentage) {
        this.awayFgDrivePercentage = awayFgDrivePercentage;
    }

    public Integer getAwayNumberOfPuntDrives() {
        return awayNumberOfPuntDrives;
    }

    public void setAwayNumberOfPuntDrives(Integer awayNumberOfPuntDrives) {
        this.awayNumberOfPuntDrives = awayNumberOfPuntDrives;
    }

    public Double getAwayPuntDrivePercentage() {
        return awayPuntDrivePercentage;
    }

    public void setAwayPuntDrivePercentage(Double awayPuntDrivePercentage) {
        this.awayPuntDrivePercentage = awayPuntDrivePercentage;
    }

    public Integer getAwayNumberOfTurnoverDrives() {
        return awayNumberOfTurnoverDrives;
    }

    public void setAwayNumberOfTurnoverDrives(Integer awayNumberOfTurnoverDrives) {
        this.awayNumberOfTurnoverDrives = awayNumberOfTurnoverDrives;
    }

    public Double getAwayTurnoverDrivePercentage() {
        return awayTurnoverDrivePercentage;
    }

    public void setAwayTurnoverDrivePercentage(Double awayTurnoverDrivePercentage) {
        this.awayTurnoverDrivePercentage = awayTurnoverDrivePercentage;
    }

    public String getHomeTimeOfPossession() {
        return homeTimeOfPossession;
    }

    public void setHomeTimeOfPossession(String homeTimeOfPossession) {
        this.homeTimeOfPossession = homeTimeOfPossession;
    }

    public String getAwayTimeOfPossession() {
        return awayTimeOfPossession;
    }

    public void setAwayTimeOfPossession(String awayTimeOfPossession) {
        this.awayTimeOfPossession = awayTimeOfPossession;
    }

    public Integer getQ1HomeScore() {
        return q1HomeScore;
    }

    public void setQ1HomeScore(Integer q1HomeScore) {
        this.q1HomeScore = q1HomeScore;
    }

    public Integer getQ2HomeScore() {
        return q2HomeScore;
    }

    public void setQ2HomeScore(Integer q2HomeScore) {
        this.q2HomeScore = q2HomeScore;
    }

    public Integer getQ3HomeScore() {
        return q3HomeScore;
    }

    public void setQ3HomeScore(Integer q3HomeScore) {
        this.q3HomeScore = q3HomeScore;
    }

    public Integer getQ4HomeScore() {
        return q4HomeScore;
    }

    public void setQ4HomeScore(Integer q4HomeScore) {
        this.q4HomeScore = q4HomeScore;
    }

    public Integer getOtHomeScore() {
        return otHomeScore;
    }

    public void setOtHomeScore(Integer otHomeScore) {
        this.otHomeScore = otHomeScore;
    }

    public Integer getQ1AwayScore() {
        return q1AwayScore;
    }

    public void setQ1AwayScore(Integer q1AwayScore) {
        this.q1AwayScore = q1AwayScore;
    }

    public Integer getQ2AwayScore() {
        return q2AwayScore;
    }

    public void setQ2AwayScore(Integer q2AwayScore) {
        this.q2AwayScore = q2AwayScore;
    }

    public Integer getQ3AwayScore() {
        return q3AwayScore;
    }

    public void setQ3AwayScore(Integer q3AwayScore) {
        this.q3AwayScore = q3AwayScore;
    }

    public Integer getQ4AwayScore() {
        return q4AwayScore;
    }

    public void setQ4AwayScore(Integer q4AwayScore) {
        this.q4AwayScore = q4AwayScore;
    }

    public Integer getOtAwayScore() {
        return otAwayScore;
    }

    public void setOtAwayScore(Integer otAwayScore) {
        this.otAwayScore = otAwayScore;
    }

    public Integer getHomeTouchdowns() {
        return homeTouchdowns;
    }

    public void setHomeTouchdowns(Integer homeTouchdowns) {
        this.homeTouchdowns = homeTouchdowns;
    }

    public Integer getAwayTouchdowns() {
        return awayTouchdowns;
    }

    public void setAwayTouchdowns(Integer awayTouchdowns) {
        this.awayTouchdowns = awayTouchdowns;
    }

    public Boolean getIsBowl() {
        return isBowl;
    }

    public void setIsBowl(Boolean isBowl) {
        this.isBowl = isBowl;
    }

    public Boolean getIsPlayoffs() {
        return isPlayoffs;
    }

    public void setIsPlayoffs(Boolean isPlayoffs) {
        this.isPlayoffs = isPlayoffs;
    }

    public Boolean getIsNationalChampionship() {
        return isNationalChampionship;
    }

    public void setIsNationalChampionship(Boolean isNationalChampionship) {
        this.isNationalChampionship = isNationalChampionship;
    }

    public Boolean getIsConferenceGame() {
        return isConferenceGame;
    }

    public void setIsConferenceGame(Boolean isConferenceGame) {
        this.isConferenceGame = isConferenceGame;
    }

    public Boolean getIsDivisionGame() {
        return isDivisionGame;
    }

    public void setIsDivisionGame(Boolean isDivisionGame) {
        this.isDivisionGame = isDivisionGame;
    }

    public String getScorebug() {
        return scorebug;
    }

    public void setScorebug(String scorebug) {
        this.scorebug = scorebug;
    }

    public String getWinProbabilityPlot() {
        return winProbabilityPlot;
    }

    public void setWinProbabilityPlot(String winProbabilityPlot) {
        this.winProbabilityPlot = winProbabilityPlot;
    }

    public String getScorePlotGraph() {
        return scorePlotGraph;
    }

    public void setScorePlotGraph(String scorePlotGraph) {
        this.scorePlotGraph = scorePlotGraph;
    }

    public Boolean getIsFinal() {
        return isFinal;
    }

    public void setIsFinal(Boolean isFinal) {
        this.isFinal = isFinal;
    }

    public Boolean getStatsUpdated() {
        return statsUpdated;
    }

    public void setStatsUpdated(Boolean statsUpdated) {
        this.statsUpdated = statsUpdated;
    }

    public Double getAverageHomeOffensiveDiff() {
        return averageHomeOffensiveDiff;
    }

    public void setAverageHomeOffensiveDiff(Double averageHomeOffensiveDiff) {
        this.averageHomeOffensiveDiff = averageHomeOffensiveDiff;
    }

    public Double getAverageHomeDefensiveDiff() {
        return averageHomeDefensiveDiff;
    }

    public void setAverageHomeDefensiveDiff(Double averageHomeDefensiveDiff) {
        this.averageHomeDefensiveDiff = averageHomeDefensiveDiff;
    }

    public Double getAverageHomeSpecialteamsDiff() {
        return averageHomeSpecialteamsDiff;
    }

    public void setAverageHomeSpecialteamsDiff(Double averageHomeSpecialteamsDiff) {
        this.averageHomeSpecialteamsDiff = averageHomeSpecialteamsDiff;
    }

    public Double getAverageAwayOffensiveDiff() {
        return averageAwayOffensiveDiff;
    }

    public void setAverageAwayOffensiveDiff(Double averageAwayOffensiveDiff) {
        this.averageAwayOffensiveDiff = averageAwayOffensiveDiff;
    }

    public Double getAverageAwayDefensiveDiff() {
        return averageAwayDefensiveDiff;
    }

    public void setAverageAwayDefensiveDiff(Double averageAwayDefensiveDiff) {
        this.averageAwayDefensiveDiff = averageAwayDefensiveDiff;
    }

    public Double getAverageAwaySpecialteamsDiff() {
        return averageAwaySpecialteamsDiff;
    }

    public void setAverageAwaySpecialteamsDiff(Double averageAwaySpecialteamsDiff) {
        this.averageAwaySpecialteamsDiff = averageAwaySpecialteamsDiff;
    }

    public Double getHomeAverageYardsPerPlay() {
        return homeAverageYardsPerPlay;
    }

    public void setHomeAverageYardsPerPlay(Double homeAverageYardsPerPlay) {
        this.homeAverageYardsPerPlay = homeAverageYardsPerPlay;
    }

    public Double getAwayAverageYardsPerPlay() {
        return awayAverageYardsPerPlay;
    }

    public void setAwayAverageYardsPerPlay(Double awayAverageYardsPerPlay) {
        this.awayAverageYardsPerPlay = awayAverageYardsPerPlay;
    }

    public Integer getHomeThirdDownConversionSuccess() {
        return homeThirdDownConversionSuccess;
    }

    public void setHomeThirdDownConversionSuccess(Integer homeThirdDownConversionSuccess) {
        this.homeThirdDownConversionSuccess = homeThirdDownConversionSuccess;
    }

    public Integer getHomeThirdDownConversionAttempts() {
        return homeThirdDownConversionAttempts;
    }

    public void setHomeThirdDownConversionAttempts(Integer homeThirdDownConversionAttempts) {
        this.homeThirdDownConversionAttempts = homeThirdDownConversionAttempts;
    }

    public Double getHomeThirdDownConversionPercentage() {
        return homeThirdDownConversionPercentage;
    }

    public void setHomeThirdDownConversionPercentage(Double homeThirdDownConversionPercentage) {
        this.homeThirdDownConversionPercentage = homeThirdDownConversionPercentage;
    }

    public Integer getHomeFourthDownConversionSuccess() {
        return homeFourthDownConversionSuccess;
    }

    public void setHomeFourthDownConversionSuccess(Integer homeFourthDownConversionSuccess) {
        this.homeFourthDownConversionSuccess = homeFourthDownConversionSuccess;
    }

    public Integer getHomeFourthDownConversionAttempts() {
        return homeFourthDownConversionAttempts;
    }

    public void setHomeFourthDownConversionAttempts(Integer homeFourthDownConversionAttempts) {
        this.homeFourthDownConversionAttempts = homeFourthDownConversionAttempts;
    }

    public Double getHomeFourthDownConversionPercentage() {
        return homeFourthDownConversionPercentage;
    }

    public void setHomeFourthDownConversionPercentage(Double homeFourthDownConversionPercentage) {
        this.homeFourthDownConversionPercentage = homeFourthDownConversionPercentage;
    }

    public Integer getAwayThirdDownConversionSuccess() {
        return awayThirdDownConversionSuccess;
    }

    public void setAwayThirdDownConversionSuccess(Integer awayThirdDownConversionSuccess) {
        this.awayThirdDownConversionSuccess = awayThirdDownConversionSuccess;
    }

    public Integer getAwayThirdDownConversionAttempts() {
        return awayThirdDownConversionAttempts;
    }

    public void setAwayThirdDownConversionAttempts(Integer awayThirdDownConversionAttempts) {
        this.awayThirdDownConversionAttempts = awayThirdDownConversionAttempts;
    }

    public Double getAwayThirdDownConversionPercentage() {
        return awayThirdDownConversionPercentage;
    }

    public void setAwayThirdDownConversionPercentage(Double awayThirdDownConversionPercentage) {
        this.awayThirdDownConversionPercentage = awayThirdDownConversionPercentage;
    }

    public Integer getAwayFourthDownConversionSuccess() {
        return awayFourthDownConversionSuccess;
    }

    public void setAwayFourthDownConversionSuccess(Integer awayFourthDownConversionSuccess) {
        this.awayFourthDownConversionSuccess = awayFourthDownConversionSuccess;
    }

    public Integer getAwayFourthDownConversionAttempts() {
        return awayFourthDownConversionAttempts;
    }

    public void setAwayFourthDownConversionAttempts(Integer awayFourthDownConversionAttempts) {
        this.awayFourthDownConversionAttempts = awayFourthDownConversionAttempts;
    }

    public Double getAwayFourthDownConversionPercentage() {
        return awayFourthDownConversionPercentage;
    }

    public void setAwayFourthDownConversionPercentage(Double awayFourthDownConversionPercentage) {
        this.awayFourthDownConversionPercentage = awayFourthDownConversionPercentage;
    }

    public Integer getHomeLargestLead() {
        return homeLargestLead;
    }

    public void setHomeLargestLead(Integer homeLargestLead) {
        this.homeLargestLead = homeLargestLead;
    }

    public Integer getAwayLargestLead() {
        return awayLargestLead;
    }

    public void setAwayLargestLead(Integer awayLargestLead) {
        this.awayLargestLead = awayLargestLead;
    }

    public Integer getHomePassTouchdowns() {
        return homePassTouchdowns;
    }

    public void setHomePassTouchdowns(Integer homePassTouchdowns) {
        this.homePassTouchdowns = homePassTouchdowns;
    }

    public Integer getHomeRushTouchdowns() {
        return homeRushTouchdowns;
    }

    public void setHomeRushTouchdowns(Integer homeRushTouchdowns) {
        this.homeRushTouchdowns = homeRushTouchdowns;
    }

    public Integer getAwayPassTouchdowns() {
        return awayPassTouchdowns;
    }

    public void setAwayPassTouchdowns(Integer awayPassTouchdowns) {
        this.awayPassTouchdowns = awayPassTouchdowns;
    }

    public Integer getAwayRushTouchdowns() {
        return awayRushTouchdowns;
    }

    public void setAwayRushTouchdowns(Integer awayRushTouchdowns) {
        this.awayRushTouchdowns = awayRushTouchdowns;
    }

    public Integer getHomeBlockedOpponentPuntTd() {
        return homeBlockedOpponentPuntTd;
    }

    public void setHomeBlockedOpponentPuntTd(Integer homeBlockedOpponentPuntTd) {
        this.homeBlockedOpponentPuntTd = homeBlockedOpponentPuntTd;
    }

    public Integer getAwayBlockedOpponentPuntTd() {
        return awayBlockedOpponentPuntTd;
    }

    public void setAwayBlockedOpponentPuntTd(Integer awayBlockedOpponentPuntTd) {
        this.awayBlockedOpponentPuntTd = awayBlockedOpponentPuntTd;
    }

    public String getHomeRecord() {
        return homeRecord;
    }

    public void setHomeRecord(String homeRecord) {
        this.homeRecord = homeRecord;
    }

    public String getAwayRecord() {
        return awayRecord;
    }

    public void setAwayRecord(String awayRecord) {
        this.awayRecord = awayRecord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameStatsEntity that = (GameStatsEntity) o;
        return Objects.equals(gameId, that.gameId) && Objects.equals(homeTeam, that.homeTeam) && Objects.equals(awayTeam, that.awayTeam) && Objects.equals(homeTeamRank, that.homeTeamRank) && Objects.equals(awayTeamRank, that.awayTeamRank) && Objects.equals(startTime, that.startTime) && Objects.equals(location, that.location) && Objects.equals(tvChannel, that.tvChannel) && Objects.equals(homeCoach, that.homeCoach) && Objects.equals(awayCoach, that.awayCoach) && Objects.equals(homeOffensivePlaybook, that.homeOffensivePlaybook) && Objects.equals(awayOffensivePlaybook, that.awayOffensivePlaybook) && Objects.equals(homeDefensivePlaybook, that.homeDefensivePlaybook) && Objects.equals(awayDefensivePlaybook, that.awayDefensivePlaybook) && Objects.equals(season, that.season) && Objects.equals(subdivision, that.subdivision) && Objects.equals(homeScore, that.homeScore) && Objects.equals(awayScore, that.awayScore) && Objects.equals(homePassAttempts, that.homePassAttempts) && Objects.equals(homePassCompletions, that.homePassCompletions) && Objects.equals(homePassCompletionPercentage, that.homePassCompletionPercentage) && Objects.equals(homePassYards, that.homePassYards) && Objects.equals(awayPassAttempts, that.awayPassAttempts) && Objects.equals(awayPassCompletions, that.awayPassCompletions) && Objects.equals(awayPassCompletionPercentage, that.awayPassCompletionPercentage) && Objects.equals(awayPassYards, that.awayPassYards) && Objects.equals(homeRushAttempts, that.homeRushAttempts) && Objects.equals(homeRush3YardsOrMore, that.homeRush3YardsOrMore) && Objects.equals(homeRushSuccessPercentage, that.homeRushSuccessPercentage) && Objects.equals(homeRushYards, that.homeRushYards) && Objects.equals(awayRushAttempts, that.awayRushAttempts) && Objects.equals(awayRush3YardsOrMore, that.awayRush3YardsOrMore) && Objects.equals(awayRushSuccessPercentage, that.awayRushSuccessPercentage) && Objects.equals(awayRushYards, that.awayRushYards) && Objects.equals(homeTotalYards, that.homeTotalYards) && Objects.equals(awayTotalYards, that.awayTotalYards) && Objects.equals(homeInterceptionsLost, that.homeInterceptionsLost) && Objects.equals(homeFumblesLost, that.homeFumblesLost) && Objects.equals(homeTurnoversLost, that.homeTurnoversLost) && Objects.equals(homeTurnoverTouchdownsLost, that.homeTurnoverTouchdownsLost) && Objects.equals(awayInterceptionsLost, that.awayInterceptionsLost) && Objects.equals(awayHomeFumblesLost, that.awayHomeFumblesLost) && Objects.equals(awayHomeTurnoversLost, that.awayHomeTurnoversLost) && Objects.equals(awayTurnoverTouchdownsLost, that.awayTurnoverTouchdownsLost) && Objects.equals(homeFieldGoalMade, that.homeFieldGoalMade) && Objects.equals(homeFieldGoalAttempts, that.homeFieldGoalAttempts) && Objects.equals(homeFieldGoalPercentage, that.homeFieldGoalPercentage) && Objects.equals(homeLongestFieldGoal, that.homeLongestFieldGoal) && Objects.equals(homeBlockedOpponentFieldGoals, that.homeBlockedOpponentFieldGoals) && Objects.equals(homeFieldGoalTouchdown, that.homeFieldGoalTouchdown) && Objects.equals(awayFieldGoalMade, that.awayFieldGoalMade) && Objects.equals(awayFieldGoalAttempts, that.awayFieldGoalAttempts) && Objects.equals(awayFieldGoalPercentage, that.awayFieldGoalPercentage) && Objects.equals(awayLongestFieldGoal, that.awayLongestFieldGoal) && Objects.equals(awayBlockedOpponentFieldGoals, that.awayBlockedOpponentFieldGoals) && Objects.equals(awayFieldGoalTouchdown, that.awayFieldGoalTouchdown) && Objects.equals(homePuntsAttempted, that.homePuntsAttempted) && Objects.equals(homeLongestPunt, that.homeLongestPunt) && Objects.equals(homeAveragePuntLength, that.homeAveragePuntLength) && Objects.equals(homeBlockedOpponentPunt, that.homeBlockedOpponentPunt) && Objects.equals(homePuntReturnTd, that.homePuntReturnTd) && Objects.equals(homePuntReturnTdPercentage, that.homePuntReturnTdPercentage) && Objects.equals(awayPuntsAttempted, that.awayPuntsAttempted) && Objects.equals(awayLongestPunt, that.awayLongestPunt) && Objects.equals(awayAveragePuntLength, that.awayAveragePuntLength) && Objects.equals(awayBlockedOpponentPunt, that.awayBlockedOpponentPunt) && Objects.equals(awayPuntReturnTd, that.awayPuntReturnTd) && Objects.equals(awayPuntReturnTdPercentage, that.awayPuntReturnTdPercentage) && Objects.equals(homeNumberOfKickoffs, that.homeNumberOfKickoffs) && Objects.equals(homeOnsideAttempts, that.homeOnsideAttempts) && Objects.equals(homeOnsideSuccess, that.homeOnsideSuccess) && Objects.equals(homeOnsideSuccessPercentage, that.homeOnsideSuccessPercentage) && Objects.equals(homeNormalKickoffAttempts, that.homeNormalKickoffAttempts) && Objects.equals(homeTouchbacks, that.homeTouchbacks) && Objects.equals(homeTouchbackPercentage, that.homeTouchbackPercentage) && Objects.equals(homeKickReturnTd, that.homeKickReturnTd) && Objects.equals(homeKickReturnTdPercentage, that.homeKickReturnTdPercentage) && Objects.equals(awayNumberOfKickoffs, that.awayNumberOfKickoffs) && Objects.equals(awayOnsideAttempts, that.awayOnsideAttempts) && Objects.equals(awayOnsideSuccess, that.awayOnsideSuccess) && Objects.equals(awayOnsideSuccessPercentage, that.awayOnsideSuccessPercentage) && Objects.equals(awayNormalKickoffAttempts, that.awayNormalKickoffAttempts) && Objects.equals(awayTouchbacks, that.awayTouchbacks) && Objects.equals(awayTouchbackPercentage, that.awayTouchbackPercentage) && Objects.equals(awayKickReturnTd, that.awayKickReturnTd) && Objects.equals(awayKickReturnTdPercentage, that.awayKickReturnTdPercentage) && Objects.equals(homeNumberOfDrives, that.homeNumberOfDrives) && Objects.equals(homeNumberOfTdDrives, that.homeNumberOfTdDrives) && Objects.equals(homeTdDrivePercentage, that.homeTdDrivePercentage) && Objects.equals(homeNumberOfFgDrives, that.homeNumberOfFgDrives) && Objects.equals(homeFgDrivePercentage, that.homeFgDrivePercentage) && Objects.equals(homeNumberOfPuntDrives, that.homeNumberOfPuntDrives) && Objects.equals(homePuntDrivePercentage, that.homePuntDrivePercentage) && Objects.equals(homeNumberOfTurnoverDrives, that.homeNumberOfTurnoverDrives) && Objects.equals(homeTurnoverDrivePercentage, that.homeTurnoverDrivePercentage) && Objects.equals(awayNumberOfDrives, that.awayNumberOfDrives) && Objects.equals(awayNumberOfTdDrives, that.awayNumberOfTdDrives) && Objects.equals(awayTdDrivePercentage, that.awayTdDrivePercentage) && Objects.equals(awayNumberOfFgDrives, that.awayNumberOfFgDrives) && Objects.equals(awayFgDrivePercentage, that.awayFgDrivePercentage) && Objects.equals(awayNumberOfPuntDrives, that.awayNumberOfPuntDrives) && Objects.equals(awayPuntDrivePercentage, that.awayPuntDrivePercentage) && Objects.equals(awayNumberOfTurnoverDrives, that.awayNumberOfTurnoverDrives) && Objects.equals(awayTurnoverDrivePercentage, that.awayTurnoverDrivePercentage) && Objects.equals(homeTimeOfPossession, that.homeTimeOfPossession) && Objects.equals(awayTimeOfPossession, that.awayTimeOfPossession) && Objects.equals(q1HomeScore, that.q1HomeScore) && Objects.equals(q2HomeScore, that.q2HomeScore) && Objects.equals(q3HomeScore, that.q3HomeScore) && Objects.equals(q4HomeScore, that.q4HomeScore) && Objects.equals(otHomeScore, that.otHomeScore) && Objects.equals(q1AwayScore, that.q1AwayScore) && Objects.equals(q2AwayScore, that.q2AwayScore) && Objects.equals(q3AwayScore, that.q3AwayScore) && Objects.equals(q4AwayScore, that.q4AwayScore) && Objects.equals(otAwayScore, that.otAwayScore) && Objects.equals(homeTouchdowns, that.homeTouchdowns) && Objects.equals(awayTouchdowns, that.awayTouchdowns) && Objects.equals(isBowl, that.isBowl) && Objects.equals(isPlayoffs, that.isPlayoffs) && Objects.equals(isNationalChampionship, that.isNationalChampionship) && Objects.equals(isConferenceGame, that.isConferenceGame) && Objects.equals(isDivisionGame, that.isDivisionGame) && Objects.equals(scorebug, that.scorebug) && Objects.equals(winProbabilityPlot, that.winProbabilityPlot) && Objects.equals(scorePlotGraph, that.scorePlotGraph) && Objects.equals(isFinal, that.isFinal) && Objects.equals(statsUpdated, that.statsUpdated) && Objects.equals(averageHomeOffensiveDiff, that.averageHomeOffensiveDiff) && Objects.equals(averageHomeDefensiveDiff, that.averageHomeDefensiveDiff) && Objects.equals(averageHomeSpecialteamsDiff, that.averageHomeSpecialteamsDiff) && Objects.equals(averageAwayOffensiveDiff, that.averageAwayOffensiveDiff) && Objects.equals(averageAwayDefensiveDiff, that.averageAwayDefensiveDiff) && Objects.equals(averageAwaySpecialteamsDiff, that.averageAwaySpecialteamsDiff) && Objects.equals(homeAverageYardsPerPlay, that.homeAverageYardsPerPlay) && Objects.equals(awayAverageYardsPerPlay, that.awayAverageYardsPerPlay) && Objects.equals(homeThirdDownConversionSuccess, that.homeThirdDownConversionSuccess) && Objects.equals(homeThirdDownConversionAttempts, that.homeThirdDownConversionAttempts) && Objects.equals(homeThirdDownConversionPercentage, that.homeThirdDownConversionPercentage) && Objects.equals(homeFourthDownConversionSuccess, that.homeFourthDownConversionSuccess) && Objects.equals(homeFourthDownConversionAttempts, that.homeFourthDownConversionAttempts) && Objects.equals(homeFourthDownConversionPercentage, that.homeFourthDownConversionPercentage) && Objects.equals(awayThirdDownConversionSuccess, that.awayThirdDownConversionSuccess) && Objects.equals(awayThirdDownConversionAttempts, that.awayThirdDownConversionAttempts) && Objects.equals(awayThirdDownConversionPercentage, that.awayThirdDownConversionPercentage) && Objects.equals(awayFourthDownConversionSuccess, that.awayFourthDownConversionSuccess) && Objects.equals(awayFourthDownConversionAttempts, that.awayFourthDownConversionAttempts) && Objects.equals(awayFourthDownConversionPercentage, that.awayFourthDownConversionPercentage) && Objects.equals(homeLargestLead, that.homeLargestLead) && Objects.equals(awayLargestLead, that.awayLargestLead) && Objects.equals(homePassTouchdowns, that.homePassTouchdowns) && Objects.equals(homeRushTouchdowns, that.homeRushTouchdowns) && Objects.equals(awayPassTouchdowns, that.awayPassTouchdowns) && Objects.equals(awayRushTouchdowns, that.awayRushTouchdowns) && Objects.equals(homeBlockedOpponentPuntTd, that.homeBlockedOpponentPuntTd) && Objects.equals(awayBlockedOpponentPuntTd, that.awayBlockedOpponentPuntTd) && Objects.equals(homeRecord, that.homeRecord) && Objects.equals(awayRecord, that.awayRecord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId, homeTeam, awayTeam, homeTeamRank, awayTeamRank, startTime, location, tvChannel, homeCoach, awayCoach, homeOffensivePlaybook, awayOffensivePlaybook, homeDefensivePlaybook, awayDefensivePlaybook, season, subdivision, homeScore, awayScore, homePassAttempts, homePassCompletions, homePassCompletionPercentage, homePassYards, awayPassAttempts, awayPassCompletions, awayPassCompletionPercentage, awayPassYards, homeRushAttempts, homeRush3YardsOrMore, homeRushSuccessPercentage, homeRushYards, awayRushAttempts, awayRush3YardsOrMore, awayRushSuccessPercentage, awayRushYards, homeTotalYards, awayTotalYards, homeInterceptionsLost, homeFumblesLost, homeTurnoversLost, homeTurnoverTouchdownsLost, awayInterceptionsLost, awayHomeFumblesLost, awayHomeTurnoversLost, awayTurnoverTouchdownsLost, homeFieldGoalMade, homeFieldGoalAttempts, homeFieldGoalPercentage, homeLongestFieldGoal, homeBlockedOpponentFieldGoals, homeFieldGoalTouchdown, awayFieldGoalMade, awayFieldGoalAttempts, awayFieldGoalPercentage, awayLongestFieldGoal, awayBlockedOpponentFieldGoals, awayFieldGoalTouchdown, homePuntsAttempted, homeLongestPunt, homeAveragePuntLength, homeBlockedOpponentPunt, homePuntReturnTd, homePuntReturnTdPercentage, awayPuntsAttempted, awayLongestPunt, awayAveragePuntLength, awayBlockedOpponentPunt, awayPuntReturnTd, awayPuntReturnTdPercentage, homeNumberOfKickoffs, homeOnsideAttempts, homeOnsideSuccess, homeOnsideSuccessPercentage, homeNormalKickoffAttempts, homeTouchbacks, homeTouchbackPercentage, homeKickReturnTd, homeKickReturnTdPercentage, awayNumberOfKickoffs, awayOnsideAttempts, awayOnsideSuccess, awayOnsideSuccessPercentage, awayNormalKickoffAttempts, awayTouchbacks, awayTouchbackPercentage, awayKickReturnTd, awayKickReturnTdPercentage, homeNumberOfDrives, homeNumberOfTdDrives, homeTdDrivePercentage, homeNumberOfFgDrives, homeFgDrivePercentage, homeNumberOfPuntDrives, homePuntDrivePercentage, homeNumberOfTurnoverDrives, homeTurnoverDrivePercentage, awayNumberOfDrives, awayNumberOfTdDrives, awayTdDrivePercentage, awayNumberOfFgDrives, awayFgDrivePercentage, awayNumberOfPuntDrives, awayPuntDrivePercentage, awayNumberOfTurnoverDrives, awayTurnoverDrivePercentage, homeTimeOfPossession, awayTimeOfPossession, q1HomeScore, q2HomeScore, q3HomeScore, q4HomeScore, otHomeScore, q1AwayScore, q2AwayScore, q3AwayScore, q4AwayScore, otAwayScore, homeTouchdowns, awayTouchdowns, isBowl, isPlayoffs, isNationalChampionship, isConferenceGame, isDivisionGame, scorebug, winProbabilityPlot, scorePlotGraph, isFinal, statsUpdated, averageHomeOffensiveDiff, averageHomeDefensiveDiff, averageHomeSpecialteamsDiff, averageAwayOffensiveDiff, averageAwayDefensiveDiff, averageAwaySpecialteamsDiff, homeAverageYardsPerPlay, awayAverageYardsPerPlay, homeThirdDownConversionSuccess, homeThirdDownConversionAttempts, homeThirdDownConversionPercentage, homeFourthDownConversionSuccess, homeFourthDownConversionAttempts, homeFourthDownConversionPercentage, awayThirdDownConversionSuccess, awayThirdDownConversionAttempts, awayThirdDownConversionPercentage, awayFourthDownConversionSuccess, awayFourthDownConversionAttempts, awayFourthDownConversionPercentage, homeLargestLead, awayLargestLead, homePassTouchdowns, homeRushTouchdowns, awayPassTouchdowns, awayRushTouchdowns, homeBlockedOpponentPuntTd, awayBlockedOpponentPuntTd, homeRecord, awayRecord);
    }
}
