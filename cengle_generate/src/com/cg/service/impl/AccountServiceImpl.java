package com.cg.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.base.service.BaseServiceImpl;
import com.cg.dao.AccountDao;
import com.cg.service.AccountService;

/**
 * 
 * <br>
 * <b>功能：</b>AccountService<br>
 */
@Service("accountService")
public class  AccountServiceImpl  extends BaseServiceImpl implements AccountService {
  private final static Logger log= Logger.getLogger(AccountServiceImpl.class);
	

	@Autowired
    private AccountDao dao;

		
	public AccountDao getDao() {
		return dao;
	}

	

}
