package cn.lu.fm.mapper;

import cn.lu.fm.entity.FmChannel;
import cn.lu.web.mapper.CrudMapper;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.special.InsertListMapper;

@Repository
public interface FmChannelMapper extends CrudMapper<FmChannel>, InsertListMapper<FmChannel> {
}