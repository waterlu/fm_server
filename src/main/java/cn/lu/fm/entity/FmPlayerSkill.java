package cn.lu.fm.entity;

import cn.lu.web.base.BaseEntity;
import javax.persistence.*;

@Table(name = "`fm_player_skill`")
public class FmPlayerSkill extends BaseEntity {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "`player_id`")
    private Long playerId;

    @Column(name = "`skill_id`")
    private Long skillId;

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
     * @return player_id
     */
    public Long getPlayerId() {
        return playerId;
    }

    /**
     * @param playerId
     */
    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    /**
     * @return skill_id
     */
    public Long getSkillId() {
        return skillId;
    }

    /**
     * @param skillId
     */
    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }
}