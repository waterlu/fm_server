package cn.lu.fm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.lu.web.base.BaseServiceImpl;
import cn.lu.web.mapper.CrudMapper;

import cn.lu.fm.vo.FmPlayerSkillVO;
import cn.lu.fm.entity.FmPlayerSkill;
import cn.lu.fm.vo.FmPlayerSkillDTO;
import cn.lu.fm.mapper.FmPlayerSkillMapper;
import cn.lu.fm.vo.FmPlayerSkillQueryDTO;
import cn.lu.fm.service.impl.FmPlayerSkillServiceImpl;
import cn.lu.fm.service.FmPlayerSkillService;

/**
 * 服务实现类
 *
 * @author waterlu
 * @date 2020-05-05
 */
@Service
public class FmPlayerSkillServiceImpl extends BaseServiceImpl<FmPlayerSkill, FmPlayerSkillQueryDTO> implements FmPlayerSkillService {

    @Autowired
    private FmPlayerSkillMapper fmPlayerSkillMapper;

    @Override
    public CrudMapper<FmPlayerSkill> getMapper() {
        return fmPlayerSkillMapper;
    }
}