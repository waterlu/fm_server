package cn.lu.fm.service;

import cn.lu.web.base.BaseService;
import cn.lu.fm.vo.FmSkillVO;
import cn.lu.fm.service.FmSkillService;
import cn.lu.fm.vo.FmSkillDTO;
import cn.lu.fm.service.impl.FmSkillServiceImpl;
import cn.lu.fm.mapper.FmSkillMapper;
import cn.lu.fm.vo.FmSkillQueryDTO;
import cn.lu.fm.entity.FmSkill;

/**
 * 服务接口类
 *
 * @author waterlu
 * @date 2020-04-11
 */
public interface FmSkillService extends BaseService<FmSkill, FmSkillQueryDTO> {

}