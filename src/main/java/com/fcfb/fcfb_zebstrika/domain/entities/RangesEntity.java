package com.fcfb.fcfb_zebstrika.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ranges", schema = "fcfb_zebstrika")
public class RangesEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "play_type")
    private String playType;
    @Basic
    @Column(name = "offensive_playbook")
    private String offensivePlaybook;
    @Basic
    @Column(name = "defensive_playbook")
    private String defensivePlaybook;
    @Basic
    @Column(name = "result")
    private String result;
    @Basic
    @Column(name = "play_time")
    private Integer playTime;
    @Basic
    @Column(name = "lower_range")
    private Integer lowerRange;
    @Basic
    @Column(name = "upper_range")
    private Integer upperRange;

    public RangesEntity(String playType, String offensivePlaybook, String defensivePlaybook, String result, Integer playTime, Integer lowerRange, Integer upperRange) {
        this.playType = playType;
        this.offensivePlaybook = offensivePlaybook;
        this.defensivePlaybook = defensivePlaybook;
        this.result = result;
        this.playTime = playTime;
        this.lowerRange = lowerRange;
        this.upperRange = upperRange;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayType() {
        return playType;
    }

    public void setPlayType(String playType) {
        this.playType = playType;
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

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Integer playTime) {
        this.playTime = playTime;
    }

    public Integer getLowerRange() {
        return lowerRange;
    }

    public void setLowerRange(Integer lowerRange) {
        this.lowerRange = lowerRange;
    }

    public Integer getUpperRange() {
        return upperRange;
    }

    public void setUpperRange(Integer upperRange) {
        this.upperRange = upperRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RangesEntity that = (RangesEntity) o;
        return id == that.id && Objects.equals(playType, that.playType) && Objects.equals(offensivePlaybook, that.offensivePlaybook) && Objects.equals(defensivePlaybook, that.defensivePlaybook) && Objects.equals(result, that.result) && Objects.equals(playTime, that.playTime) && Objects.equals(lowerRange, that.lowerRange) && Objects.equals(upperRange, that.upperRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, playType, offensivePlaybook, defensivePlaybook, result, playTime, lowerRange, upperRange);
    }
}
