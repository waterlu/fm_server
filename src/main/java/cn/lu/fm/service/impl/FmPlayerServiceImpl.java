package cn.lu.fm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.lu.web.base.BaseServiceImpl;
import cn.lu.web.mapper.CrudMapper;

import cn.lu.fm.mapper.FmPlayerMapper;
import cn.lu.fm.service.FmPlayerService;
import cn.lu.fm.vo.FmPlayerDTO;
import cn.lu.fm.vo.FmPlayerVO;
import cn.lu.fm.vo.FmPlayerQueryDTO;
import cn.lu.fm.entity.FmPlayer;
import cn.lu.fm.service.impl.FmPlayerServiceImpl;

/**
 * 服务实现类
 *
 * @author waterlu
 * @date 2020-04-11
 */
@Service
public class FmPlayerServiceImpl extends BaseServiceImpl<FmPlayer, FmPlayerQueryDTO> implements FmPlayerService {

    @Autowired
    private FmPlayerMapper fmPlayerMapper;

    @Override
    public CrudMapper<FmPlayer> getMapper() {
        return fmPlayerMapper;
    }
}