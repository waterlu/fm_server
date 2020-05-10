package cn.lu.fm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.lu.web.base.BaseServiceImpl;
import cn.lu.web.mapper.CrudMapper;

import cn.lu.fm.entity.FmClub;
import cn.lu.fm.service.impl.FmClubServiceImpl;
import cn.lu.fm.mapper.FmClubMapper;
import cn.lu.fm.vo.FmClubQueryDTO;
import cn.lu.fm.vo.FmClubVO;
import cn.lu.fm.vo.FmClubDTO;
import cn.lu.fm.service.FmClubService;

/**
 * 服务实现类
 *
 * @author waterlu
 * @date 2020-04-11
 */
@Service
public class FmClubServiceImpl extends BaseServiceImpl<FmClub, FmClubQueryDTO> implements FmClubService {

    @Autowired
    private FmClubMapper fmClubMapper;

    @Override
    public CrudMapper<FmClub> getMapper() {
        return fmClubMapper;
    }
}