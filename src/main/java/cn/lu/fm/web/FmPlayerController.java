package cn.lu.fm.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSON;
import io.swagger.annotations.ApiOperation;
import cn.lu.web.mvc.BizException;
import cn.lu.web.mvc.DBException;
import cn.lu.web.mvc.ResponseData;
import cn.lu.web.mvc.ResponseResult;
import cn.lu.web.mvc.SimpleResponseData;
import cn.lu.web.vo.InsertGroup;
import cn.lu.web.vo.UpdateGroup;
import cn.lu.web.base.BaseController;
import cn.lu.web.base.BaseService;

import cn.lu.fm.mapper.FmPlayerMapper;
import cn.lu.fm.service.FmPlayerService;
import cn.lu.fm.vo.FmPlayerDTO;
import cn.lu.fm.vo.FmPlayerVO;
import cn.lu.fm.vo.FmPlayerQueryDTO;
import cn.lu.fm.entity.FmPlayer;
import cn.lu.fm.service.impl.FmPlayerServiceImpl;

/**
 * 接口
 *
 * @author waterlu
 * @date 2020-04-11
 */
@RestController
@RequestMapping(value = "/fmPlayer")
public class FmPlayerController extends BaseController<FmPlayer, FmPlayerDTO, FmPlayerQueryDTO> {

    @Autowired
    private FmPlayerService fmPlayerService;

    /**
     * 获取服务实现类
     *
     * @return
     */
    @Override
    public BaseService<FmPlayer, FmPlayerQueryDTO> getService() {
        return fmPlayerService;
    }

    /**
     * 更新前需要设置主键，底层不知道哪个字段是主键。
     *
     * @param entity
     * @param id
     */
    @Override
    public void setEntityId(FmPlayer entity, Object id) {
        entity.setId((Long)id);
    }

    @Override
    @ApiOperation(value = "创建", response = FmPlayerVO.class, notes = "创建接口描述")
    public ResponseResult create(@RequestBody @Validated({InsertGroup.class}) FmPlayerDTO param) throws BizException {
        return super.create(param);
    }

    @Override
    @ApiOperation(value = "获取详情接口", response = FmPlayerVO.class, notes = "获取详情接口描述")
    public ResponseResult get(@PathVariable Long id) throws BizException {
        return super.get(id);
    }

    @Override
    @ApiOperation(value = "更新接口", response = String.class, notes = "更新接口描述")
    public ResponseResult update(@PathVariable Long id, @RequestBody @Validated({UpdateGroup.class}) FmPlayerDTO param) throws BizException {
        return super.update(id, param);
    }

    @Override
    @ApiOperation(value = "删除接口", response = String.class, notes = "删除接口描述")
    public ResponseResult delete(@PathVariable Long id) throws BizException {
        return super.delete(id);
    }

    /**
     * 将入参对象转换为与数据库对应的实体类对象，默认实现是DTO类和Entity类字段一对一转换，如果不满足要求请覆盖此方法。
     * 此方法在基类的create()方法中调用，如果覆盖了create()方法请忽略此方法。
     *
     * @param param
     * @return
     */
    @Override
    protected FmPlayer paramToEntity(FmPlayerDTO param) {
        String jsonString = JSON.toJSONString(param);
        return JSON.parseObject(jsonString, getEntityType(0));
    }

    /**
     * 封装返回结果，默认直接返回实体类对象。
     * 如果需要进行处理，请将Entity类对象转换为VO对象，并放入ResponseData中返回。
     *
     * @param entity
     * @return
     */
    @Override
    protected ResponseData entityToVo(FmPlayer entity) {
        return new ResponseData(entity);
    }
}