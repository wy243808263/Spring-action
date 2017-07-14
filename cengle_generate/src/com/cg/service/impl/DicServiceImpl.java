package com.cg.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.base.service.BaseServiceImpl;
import com.cg.dao.DicDao;
import com.cg.service.DicService;

/**
 * 
 * <br>
 * <b>功能：</b>DicService<br>
 */
@Service("dicService")
public class  DicServiceImpl  extends BaseServiceImpl implements DicService {
  private final static Logger log= Logger.getLogger(DicServiceImpl.class);
	

	@Autowired
    private DicDao dao;

		
	public DicDao getDao() {
		return dao;
	}

	

}
