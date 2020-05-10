package cn.lu.fm.service;

import cn.lu.web.base.BaseService;
import cn.lu.fm.mapper.FmPlayerMapper;
import cn.lu.fm.service.FmPlayerService;
import cn.lu.fm.vo.FmPlayerDTO;
import cn.lu.fm.vo.FmPlayerVO;
import cn.lu.fm.vo.FmPlayerQueryDTO;
import cn.lu.fm.entity.FmPlayer;
import cn.lu.fm.service.impl.FmPlayerServiceImpl;

/**
 * 服务接口类
 *
 * @author waterlu
 * @date 2020-04-11
 */
public interface FmPlayerService extends BaseService<FmPlayer, FmPlayerQueryDTO> {

}