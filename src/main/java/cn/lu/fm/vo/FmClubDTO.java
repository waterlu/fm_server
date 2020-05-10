package cn.lu.fm.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import cn.lu.web.vo.ParamDTO;
import cn.lu.web.vo.InsertGroup;
import cn.lu.web.vo.UpdateGroup;

import javax.validation.constraints.Size;
import java.lang.String;
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
public class FmClubDTO extends ParamDTO {

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
    @Size(max = 20)
    @ApiModelProperty(value = "", required = false)
    private String clubName;

    /**
     * 
     *
     */
    @Size(max = 2)
    @ApiModelProperty(value = "", required = false)
    private String level;

}