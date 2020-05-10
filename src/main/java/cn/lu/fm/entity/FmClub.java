package cn.lu.fm.entity;

import cn.lu.web.base.BaseEntity;
import javax.persistence.*;

@Table(name = "`fm_club`")
public class FmClub extends BaseEntity {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "`short_name`")
    private String shortName;

    @Column(name = "`club_name`")
    private String clubName;

    @Column(name = "`level`")
    private String level;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return short_name
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * @param shortName
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    /**
     * @return club_name
     */
    public String getClubName() {
        return clubName;
    }

    /**
     * @param clubName
     */
    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(String level) {
        this.level = level;
    }
}