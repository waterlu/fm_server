package cn.lu.fm.mapper;

import cn.lu.fm.entity.FmSkill;
import cn.lu.web.mapper.CrudMapper;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.special.InsertListMapper;

@Repository
public interface FmSkillMapper extends CrudMapper<FmSkill>, InsertListMapper<FmSkill> {
}