package com.cg.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.base.service.BaseServiceImpl;
import com.cg.dao.InfoClassDao;
import com.cg.service.InfoClassService;

/**
 * 
 * <br>
 * <b>功能：</b>InfoClassService<br>
 */
@Service("infoClassService")
public class  InfoClassServiceImpl  extends BaseServiceImpl implements InfoClassService {
  private final static Logger log= Logger.getLogger(InfoClassServiceImpl.class);
	

	@Autowired
    private InfoClassDao dao;

		
	public InfoClassDao getDao() {
		return dao;
	}

	

}
