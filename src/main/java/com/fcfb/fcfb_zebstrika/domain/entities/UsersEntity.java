package com.fcfb.fcfb_zebstrika.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users", schema = "fcfb_zebstrika", catalog = "")
public class UsersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "coach_name")
    private String coachName;
    @Basic
    @Column(name = "defensive_playbook")
    private String defensivePlaybook;
    @Basic
    @Column(name = "discord_tag")
    private String discordTag;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "losses")
    private Integer losses;
    @Basic
    @Column(name = "offensive_playbook")
    private String offensivePlaybook;
    @Basic
    @Column(name = "password")
    private String password;
    @Basic
    @Column(name = "position")
    private String position;
    @Basic
    @Column(name = "reddit_username")
    private String redditUsername;
    @Basic
    @Column(name = "role")
    private String role;
    @Basic
    @Column(name = "salt")
    private String salt;
    @Basic
    @Column(name = "team")
    private String team;
    @Basic
    @Column(name = "win_percentage")
    private Double winPercentage;
    @Basic
    @Column(name = "wins")
    private Integer wins;
    @Basic
    @Column(name = "approved")
    private byte approved;
    @Basic
    @Column(name = "team_choice_one")
    private String teamChoiceOne;
    @Basic
    @Column(name = "team_choice_three")
    private String teamChoiceThree;
    @Basic
    @Column(name = "team_choice_two")
    private String teamChoiceTwo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getDefensivePlaybook() {
        return defensivePlaybook;
    }

    public void setDefensivePlaybook(String defensivePlaybook) {
        this.defensivePlaybook = defensivePlaybook;
    }

    public String getDiscordTag() {
        return discordTag;
    }

    public void setDiscordTag(String discordTag) {
        this.discordTag = discordTag;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public String getOffensivePlaybook() {
        return offensivePlaybook;
    }

    public void setOffensivePlaybook(String offensivePlaybook) {
        this.offensivePlaybook = offensivePlaybook;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRedditUsername() {
        return redditUsername;
    }

    public void setRedditUsername(String redditUsername) {
        this.redditUsername = redditUsername;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Double getWinPercentage() {
        return winPercentage;
    }

    public void setWinPercentage(Double winPercentage) {
        this.winPercentage = winPercentage;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public byte getApproved() {
        return approved;
    }

    public void setApproved(byte approved) {
        this.approved = approved;
    }

    public String getTeamChoiceOne() {
        return teamChoiceOne;
    }

    public void setTeamChoiceOne(String teamChoiceOne) {
        this.teamChoiceOne = teamChoiceOne;
    }

    public String getTeamChoiceThree() {
        return teamChoiceThree;
    }

    public void setTeamChoiceThree(String teamChoiceThree) {
        this.teamChoiceThree = teamChoiceThree;
    }

    public String getTeamChoiceTwo() {
        return teamChoiceTwo;
    }

    public void setTeamChoiceTwo(String teamChoiceTwo) {
        this.teamChoiceTwo = teamChoiceTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return id == that.id && approved == that.approved && Objects.equals(coachName, that.coachName) && Objects.equals(defensivePlaybook, that.defensivePlaybook) && Objects.equals(discordTag, that.discordTag) && Objects.equals(email, that.email) && Objects.equals(losses, that.losses) && Objects.equals(offensivePlaybook, that.offensivePlaybook) && Objects.equals(password, that.password) && Objects.equals(position, that.position) && Objects.equals(redditUsername, that.redditUsername) && Objects.equals(role, that.role) && Objects.equals(salt, that.salt) && Objects.equals(team, that.team) && Objects.equals(winPercentage, that.winPercentage) && Objects.equals(wins, that.wins) && Objects.equals(teamChoiceOne, that.teamChoiceOne) && Objects.equals(teamChoiceThree, that.teamChoiceThree) && Objects.equals(teamChoiceTwo, that.teamChoiceTwo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, coachName, defensivePlaybook, discordTag, email, losses, offensivePlaybook, password, position, redditUsername, role, salt, team, winPercentage, wins, approved, teamChoiceOne, teamChoiceThree, teamChoiceTwo);
    }
}
