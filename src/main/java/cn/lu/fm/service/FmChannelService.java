package cn.lu.fm.service;

import cn.lu.web.base.BaseService;
import cn.lu.fm.entity.FmChannel;
import cn.lu.fm.service.impl.FmChannelServiceImpl;
import cn.lu.fm.mapper.FmChannelMapper;
import cn.lu.fm.service.FmChannelService;
import cn.lu.fm.vo.FmChannelDTO;
import cn.lu.fm.vo.FmChannelQueryDTO;
import cn.lu.fm.vo.FmChannelVO;

/**
 * 服务接口类
 *
 * @author waterlu
 * @date 2020-05-05
 */
public interface FmChannelService extends BaseService<FmChannel, FmChannelQueryDTO> {

}