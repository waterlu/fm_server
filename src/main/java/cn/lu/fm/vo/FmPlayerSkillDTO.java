package cn.lu.fm.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import cn.lu.web.vo.ParamDTO;
import cn.lu.web.vo.InsertGroup;
import cn.lu.web.vo.UpdateGroup;

import java.lang.Long;
import io.swagger.annotations.ApiModelProperty;

/**
 * 参数对象
 *
 * @author waterlu
 * @date 2020-05-05
 */
@Getter
@Setter
@ToString
public class FmPlayerSkillDTO extends ParamDTO {

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private Long playerId;

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private Long skillId;

}