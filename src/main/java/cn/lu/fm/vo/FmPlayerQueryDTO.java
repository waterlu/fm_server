package cn.lu.fm.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import cn.lu.web.vo.QueryParam;

import java.lang.Integer;
import io.swagger.annotations.ApiModelProperty;

/**
 * 查询参数对象
 *
 * @author waterlu
 * @date 2020-04-11
 */
@Getter
@Setter
@ToString
public class FmPlayerQueryDTO extends QueryParam {

    /**
     * 
     *
     */
    @ApiModelProperty(value = "", required = false)
    private Integer level;

}