package com.cg.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.base.service.BaseServiceImpl;
import com.cg.dao.ResDao;
import com.cg.service.ResService;

/**
 * 
 * <br>
 * <b>功能：</b>ResService<br>
 */
@Service("resService")
public class  ResServiceImpl  extends BaseServiceImpl implements ResService {
  private final static Logger log= Logger.getLogger(ResServiceImpl.class);
	

	@Autowired
    private ResDao dao;

		
	public ResDao getDao() {
		return dao;
	}

	

}
