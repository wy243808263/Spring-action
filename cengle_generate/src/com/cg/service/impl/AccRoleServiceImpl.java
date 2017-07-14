package com.cg.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.base.service.BaseServiceImpl;
import com.cg.dao.AccRoleDao;
import com.cg.service.AccRoleService;

/**
 * 
 * <br>
 * <b>功能：</b>AccRoleService<br>
 */
@Service("accRoleService")
public class  AccRoleServiceImpl  extends BaseServiceImpl implements AccRoleService {
  private final static Logger log= Logger.getLogger(AccRoleServiceImpl.class);
	

	@Autowired
    private AccRoleDao dao;

		
	public AccRoleDao getDao() {
		return dao;
	}

	

}
