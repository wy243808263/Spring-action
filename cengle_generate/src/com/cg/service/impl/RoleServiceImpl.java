package com.cg.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.base.service.BaseServiceImpl;
import com.cg.dao.RoleDao;
import com.cg.service.RoleService;

/**
 * 
 * <br>
 * <b>功能：</b>RoleService<br>
 */
@Service("roleService")
public class  RoleServiceImpl  extends BaseServiceImpl implements RoleService {
  private final static Logger log= Logger.getLogger(RoleServiceImpl.class);
	

	@Autowired
    private RoleDao dao;

		
	public RoleDao getDao() {
		return dao;
	}

	

}
