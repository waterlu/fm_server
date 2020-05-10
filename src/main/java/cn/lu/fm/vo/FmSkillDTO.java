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
public class FmSkillDTO extends ParamDTO {

    /**
     * 
     *
     */
    @Size(max = 10)
    @ApiModelProperty(value = "", required = false)
    private String skillName;

    /**
     * 
     *
     */
    @Size(max = 10)
    @ApiModelProperty(value = "", required = false)
    private String shortName;

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private Integer skillType;

}