package com.cg.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.service.BaseServiceImpl;
import com.cg.dao.SysConfigDao;
import com.cg.entity.SysConfig;
import com.cg.service.SysConfigService;

/**
 * 
 * <br>
 * <b>功能：</b>SysConfigService<br>
 */
@Service("sysConfigService")
public class  SysConfigServiceImpl  extends BaseServiceImpl implements SysConfigService {
  private final static Logger log= Logger.getLogger(SysConfigServiceImpl.class);
	

	@Autowired
    private SysConfigDao dao;

		
	public SysConfigDao getDao() {
		return dao;
	}


	@Override
	public SysConfig getSysConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
