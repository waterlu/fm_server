package cn.lu.fm.entity;

import cn.lu.web.base.BaseEntity;
import javax.persistence.*;

@Table(name = "`fm_player`")
public class FmPlayer extends BaseEntity {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "`player_name`")
    private String playerName;

    @Column(name = "`nick_name`")
    private String nickName;

    @Column(name = "`level`")
    private Integer level;

    @Column(name = "`nationality`")
    private String nationality;

    @Column(name = "`position`")
    private String position;

    @Column(name = "`ability`")
    private Integer ability;

    @Column(name = "`addition`")
    private Integer addition;

    @Column(name = "`train`")
    private Integer train;

    @Column(name = "`resource`")
    private String resource;

    @Column(name = "`price`")
    private Integer price;

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
     * @return player_name
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @return nick_name
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * @param nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * @return nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * @return position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return ability
     */
    public Integer getAbility() {
        return ability;
    }

    /**
     * @param ability
     */
    public void setAbility(Integer ability) {
        this.ability = ability;
    }

    /**
     * @return addition
     */
    public Integer getAddition() {
        return addition;
    }

    /**
     * @param addition
     */
    public void setAddition(Integer addition) {
        this.addition = addition;
    }

    /**
     * @return train
     */
    public Integer getTrain() {
        return train;
    }

    /**
     * @param train
     */
    public void setTrain(Integer train) {
        this.train = train;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    /**
     * @param resource
     */
    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }
}