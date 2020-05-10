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
public class FmPlayerVO extends ResultVO {

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
    private String playerName;

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private String nickName;

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private Integer level;

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private String nationality;

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private String position;

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private Integer ability;

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private Integer addition;

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private Integer train;

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private String resource;

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private Integer price;

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