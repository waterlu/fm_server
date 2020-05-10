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
 * @date 2020-05-05
 */
@Getter
@Setter
@ToString
public class FmChannelDTO extends ParamDTO {

    /**
     * 
     *
     */
    @Size(max = 255)
    @ApiModelProperty(value = "", required = false)
    private String channelName;

}