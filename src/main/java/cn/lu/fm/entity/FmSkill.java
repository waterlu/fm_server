package cn.lu.fm.entity;

import cn.lu.web.base.BaseEntity;
import javax.persistence.*;

@Table(name = "`fm_skill`")
public class FmSkill extends BaseEntity {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "`skill_name`")
    private String skillName;

    @Column(name = "`short_name`")
    private String shortName;

    @Column(name = "`skill_type`")
    private Integer skillType;

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
     * @return skill_name
     */
    public String getSkillName() {
        return skillName;
    }

    /**
     * @param skillName
     */
    public void setSkillName(String skillName) {
        this.skillName = skillName;
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
     * @return skill_type
     */
    public Integer getSkillType() {
        return skillType;
    }

    /**
     * @param skillType
     */
    public void setSkillType(Integer skillType) {
        this.skillType = skillType;
    }
}