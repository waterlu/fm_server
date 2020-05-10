package cn.lu.fm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.lu.web.base.BaseServiceImpl;
import cn.lu.web.mapper.CrudMapper;

import cn.lu.fm.vo.FmSkillVO;
import cn.lu.fm.service.FmSkillService;
import cn.lu.fm.vo.FmSkillDTO;
import cn.lu.fm.service.impl.FmSkillServiceImpl;
import cn.lu.fm.mapper.FmSkillMapper;
import cn.lu.fm.vo.FmSkillQueryDTO;
import cn.lu.fm.entity.FmSkill;

/**
 * 服务实现类
 *
 * @author waterlu
 * @date 2020-04-11
 */
@Service
public class FmSkillServiceImpl extends BaseServiceImpl<FmSkill, FmSkillQueryDTO> implements FmSkillService {

    @Autowired
    private FmSkillMapper fmSkillMapper;

    @Override
    public CrudMapper<FmSkill> getMapper() {
        return fmSkillMapper;
    }
}