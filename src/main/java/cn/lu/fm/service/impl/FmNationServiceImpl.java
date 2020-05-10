package cn.lu.fm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.lu.web.base.BaseServiceImpl;
import cn.lu.web.mapper.CrudMapper;

import cn.lu.fm.entity.FmNation;
import cn.lu.fm.vo.FmNationDTO;
import cn.lu.fm.service.FmNationService;
import cn.lu.fm.vo.FmNationVO;
import cn.lu.fm.service.impl.FmNationServiceImpl;
import cn.lu.fm.vo.FmNationQueryDTO;
import cn.lu.fm.mapper.FmNationMapper;

/**
 * 服务实现类
 *
 * @author waterlu
 * @date 2020-05-05
 */
@Service
public class FmNationServiceImpl extends BaseServiceImpl<FmNation, FmNationQueryDTO> implements FmNationService {

    @Autowired
    private FmNationMapper fmNationMapper;

    @Override
    public CrudMapper<FmNation> getMapper() {
        return fmNationMapper;
    }
}