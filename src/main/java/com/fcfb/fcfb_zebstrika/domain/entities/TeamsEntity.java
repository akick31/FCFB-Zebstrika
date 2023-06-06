package com.fcfb.fcfb_zebstrika.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "teams", schema = "fcfb_zebstrika", catalog = "")
public class TeamsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "logo")
    private String logo;
    @Basic
    @Column(name = "coach")
    private String coach;
    @Basic
    @Column(name = "coaches_poll_ranking")
    private Integer coachesPollRanking;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "playoff_committee_ranking")
    private Integer playoffCommitteeRanking;
    @Basic
    @Column(name = "primary_color")
    private String primaryColor;
    @Basic
    @Column(name = "secondary_color")
    private String secondaryColor;
    @Basic
    @Column(name = "subdivision")
    private String subdivision;
    @Basic
    @Column(name = "offensive_playbook")
    private String offensivePlaybook;
    @Basic
    @Column(name = "defensive_playbook")
    private String defensivePlaybook;
    @Basic
    @Column(name = "conference")
    private String conference;
    @Basic
    @Column(name = "current_wins")
    private Integer currentWins;
    @Basic
    @Column(name = "current_losses")
    private Integer currentLosses;
    @Basic
    @Column(name = "overall_wins")
    private Integer overallWins;
    @Basic
    @Column(name = "overall_losses")
    private Integer overallLosses;
    @Basic
    @Column(name = "current_conference_wins")
    private Integer currentConferenceWins;
    @Basic
    @Column(name = "current_conference_losses")
    private Integer currentConferenceLosses;
    @Basic
    @Column(name = "overall_conference_wins")
    private Integer overallConferenceWins;
    @Basic
    @Column(name = "overall_conference_losses")
    private Integer overallConferenceLosses;

    public TeamsEntity(String logo, String coach, Integer coachesPollRanking, String name,
                       Integer playoffCommitteeRanking, String primaryColor, String secondaryColor, String subdivision,
                       String offensivePlaybook, String defensivePlaybook, String conference, Integer currentWins,
                       Integer currentLosses, Integer overallWins, Integer overallLosses, Integer currentConferenceWins,
                       Integer currentConferenceLosses, Integer overallConferenceWins,
                       Integer overallConferenceLosses) {
        this.logo = logo;
        this.coach = coach;
        this.coachesPollRanking = coachesPollRanking;
        this.name = name;
        this.playoffCommitteeRanking = playoffCommitteeRanking;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.subdivision = subdivision;
        this.offensivePlaybook = offensivePlaybook;
        this.defensivePlaybook = defensivePlaybook;
        this.conference = conference;
        this.currentWins = currentWins;
        this.currentLosses = currentLosses;
        this.overallWins = overallWins;
        this.overallLosses = overallLosses;
        this.currentConferenceWins = currentConferenceWins;
        this.currentConferenceLosses = currentConferenceLosses;
        this.overallConferenceWins = overallConferenceWins;
        this.overallConferenceLosses = overallConferenceLosses;
    }

    public TeamsEntity() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public Integer getCoachesPollRanking() {
        return coachesPollRanking;
    }

    public void setCoachesPollRanking(Integer coachesPollRanking) {
        this.coachesPollRanking = coachesPollRanking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlayoffCommitteeRanking() {
        return playoffCommitteeRanking;
    }

    public void setPlayoffCommitteeRanking(Integer playoffCommitteeRanking) {
        this.playoffCommitteeRanking = playoffCommitteeRanking;
    }

    public String getPrimaryColor() {
        return primaryColor;
    }

    public void setPrimaryColor(String primaryColor) {
        this.primaryColor = primaryColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public String getOffensivePlaybook() {
        return offensivePlaybook;
    }

    public void setOffensivePlaybook(String offensivePlaybook) {
        this.offensivePlaybook = offensivePlaybook;
    }

    public String getDefensivePlaybook() {
        return defensivePlaybook;
    }

    public void setDefensivePlaybook(String defensivePlaybook) {
        this.defensivePlaybook = defensivePlaybook;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public Integer getCurrentWins() {
        return currentWins;
    }

    public void setCurrentWins(Integer currentWins) {
        this.currentWins = currentWins;
    }

    public Integer getCurrentLosses() {
        return currentLosses;
    }

    public void setCurrentLosses(Integer currentLosses) {
        this.currentLosses = currentLosses;
    }

    public Integer getOverallWins() {
        return overallWins;
    }

    public void setOverallWins(Integer overallWins) {
        this.overallWins = overallWins;
    }

    public Integer getOverallLosses() {
        return overallLosses;
    }

    public void setOverallLosses(Integer overallLosses) {
        this.overallLosses = overallLosses;
    }

    public Integer getCurrentConferenceWins() {
        return currentConferenceWins;
    }

    public void setCurrentConferenceWins(Integer currentConferenceWins) {
        this.currentConferenceWins = currentConferenceWins;
    }

    public Integer getCurrentConferenceLosses() {
        return currentConferenceLosses;
    }

    public void setCurrentConferenceLosses(Integer currentConferenceLosses) {
        this.currentConferenceLosses = currentConferenceLosses;
    }

    public Integer getOverallConferenceWins() {
        return overallConferenceWins;
    }

    public void setOverallConferenceWins(Integer overallConferenceWins) {
        this.overallConferenceWins = overallConferenceWins;
    }

    public Integer getOverallConferenceLosses() {
        return overallConferenceLosses;
    }

    public void setOverallConferenceLosses(Integer overallConferenceLosses) {
        this.overallConferenceLosses = overallConferenceLosses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamsEntity that = (TeamsEntity) o;
        return id == that.id && Objects.equals(logo, that.logo) && Objects.equals(coach, that.coach) && Objects.equals(coachesPollRanking, that.coachesPollRanking) && Objects.equals(name, that.name) && Objects.equals(playoffCommitteeRanking, that.playoffCommitteeRanking) && Objects.equals(primaryColor, that.primaryColor) && Objects.equals(secondaryColor, that.secondaryColor) && Objects.equals(subdivision, that.subdivision) && Objects.equals(offensivePlaybook, that.offensivePlaybook) && Objects.equals(defensivePlaybook, that.defensivePlaybook) && Objects.equals(conference, that.conference) && Objects.equals(currentWins, that.currentWins) && Objects.equals(currentLosses, that.currentLosses) && Objects.equals(overallWins, that.overallWins) && Objects.equals(overallLosses, that.overallLosses) && Objects.equals(currentConferenceWins, that.currentConferenceWins) && Objects.equals(currentConferenceLosses, that.currentConferenceLosses) && Objects.equals(overallConferenceWins, that.overallConferenceWins) && Objects.equals(overallConferenceLosses, that.overallConferenceLosses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, logo, coach, coachesPollRanking, name, playoffCommitteeRanking, primaryColor, secondaryColor, subdivision, offensivePlaybook, defensivePlaybook, conference, currentWins, currentLosses, overallWins, overallLosses, currentConferenceWins, currentConferenceLosses, overallConferenceWins, overallConferenceLosses);
    }
}
