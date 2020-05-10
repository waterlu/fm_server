package cn.lu.fm.entity;

import cn.lu.web.base.BaseEntity;
import javax.persistence.*;

@Table(name = "`fm_channel`")
public class FmChannel extends BaseEntity {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    @Column(name = "`channel_name`")
    private String channelName;

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
     * @return channel_name
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * @param channelName
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
}