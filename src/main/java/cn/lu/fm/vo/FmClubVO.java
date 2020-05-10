package cn.lu.fm.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import cn.lu.web.vo.ResultVO;
import java.lang.Long;
import java.util.Date;
import java.lang.String;
import java.lang.Integer;
import io.swagger.annotations.ApiModelProperty;

/**
 * 返回值对象
 *
 * @author waterlu
 * @date 2020-04-11
 */
@Getter
@Setter
@ToString
public class FmClubVO extends ResultVO {

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private Long id;

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private String shortName;

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private String clubName;

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private String level;

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private Integer deleteFlag;

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private Date updateTime;


}