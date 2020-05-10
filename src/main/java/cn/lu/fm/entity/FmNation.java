package cn.lu.fm.entity;

import cn.lu.web.base.BaseEntity;
import javax.persistence.*;

@Table(name = "`fm_nation`")
public class FmNation extends BaseEntity {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "`nation_name`")
    private String nationName;

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
     * @return nation_name
     */
    public String getNationName() {
        return nationName;
    }

    /**
     * @param nationName
     */
    public void setNationName(String nationName) {
        this.nationName = nationName;
    }
}