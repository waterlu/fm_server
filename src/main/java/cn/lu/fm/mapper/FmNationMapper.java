package cn.lu.fm.mapper;

import cn.lu.fm.entity.FmNation;
import cn.lu.web.mapper.CrudMapper;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.special.InsertListMapper;

@Repository
public interface FmNationMapper extends CrudMapper<FmNation>, InsertListMapper<FmNation> {
}