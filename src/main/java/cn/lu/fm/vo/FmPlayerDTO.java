package cn.lu.fm.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import cn.lu.web.vo.ParamDTO;
import cn.lu.web.vo.InsertGroup;
import cn.lu.web.vo.UpdateGroup;

import javax.validation.constraints.Size;
import java.lang.String;
import java.lang.Integer;
import io.swagger.annotations.ApiModelProperty;

/**
 * 参数对象
 *
 * @author waterlu
 * @date 2020-04-11
 */
@Getter
@Setter
@ToString
public class FmPlayerDTO extends ParamDTO {

    /**
     * 
     *
     */
    @Size(max = 20)
    @ApiModelProperty(value = "", required = false)
    private String playerName;

    /**
     * 
     *
     */
    @Size(max = 20)
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
    @Size(max = 10)
    @ApiModelProperty(value = "", required = false)
    private String nationality;

    /**
     * 
     *
     */
    @Size(max = 10)
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
    @Size(max = 0)
    @ApiModelProperty(value = "", required = false)
    private String resource;

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private Integer price;

}