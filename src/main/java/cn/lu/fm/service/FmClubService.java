package cn.lu.fm.service;

import cn.lu.web.base.BaseService;
import cn.lu.fm.entity.FmClub;
import cn.lu.fm.service.impl.FmClubServiceImpl;
import cn.lu.fm.mapper.FmClubMapper;
import cn.lu.fm.vo.FmClubQueryDTO;
import cn.lu.fm.vo.FmClubVO;
import cn.lu.fm.vo.FmClubDTO;
import cn.lu.fm.service.FmClubService;

/**
 * 服务接口类
 *
 * @author waterlu
 * @date 2020-04-11
 */
public interface FmClubService extends BaseService<FmClub, FmClubQueryDTO> {

}