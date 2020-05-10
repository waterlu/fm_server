package cn.lu.fm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.lu.web.base.BaseServiceImpl;
import cn.lu.web.mapper.CrudMapper;

import cn.lu.fm.entity.FmChannel;
import cn.lu.fm.service.impl.FmChannelServiceImpl;
import cn.lu.fm.mapper.FmChannelMapper;
import cn.lu.fm.service.FmChannelService;
import cn.lu.fm.vo.FmChannelDTO;
import cn.lu.fm.vo.FmChannelQueryDTO;
import cn.lu.fm.vo.FmChannelVO;

/**
 * 服务实现类
 *
 * @author waterlu
 * @date 2020-05-05
 */
@Service
public class FmChannelServiceImpl extends BaseServiceImpl<FmChannel, FmChannelQueryDTO> implements FmChannelService {

    @Autowired
    private FmChannelMapper fmChannelMapper;

    @Override
    public CrudMapper<FmChannel> getMapper() {
        return fmChannelMapper;
    }
}