package cn.lu.fm.service;

import cn.lu.web.base.BaseService;
import cn.lu.fm.entity.FmNation;
import cn.lu.fm.vo.FmNationDTO;
import cn.lu.fm.service.FmNationService;
import cn.lu.fm.vo.FmNationVO;
import cn.lu.fm.service.impl.FmNationServiceImpl;
import cn.lu.fm.vo.FmNationQueryDTO;
import cn.lu.fm.mapper.FmNationMapper;

/**
 * 服务接口类
 *
 * @author waterlu
 * @date 2020-05-05
 */
public interface FmNationService extends BaseService<FmNation, FmNationQueryDTO> {

}