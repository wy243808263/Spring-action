package com.cg.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.base.service.BaseServiceImpl;
import com.cg.dao.DicTypeDao;
import com.cg.service.DicTypeService;

/**
 * 
 * <br>
 * <b>功能：</b>DicTypeService<br>
 */
@Service("dicTypeService")
public class  DicTypeServiceImpl  extends BaseServiceImpl implements DicTypeService {
  private final static Logger log= Logger.getLogger(DicTypeServiceImpl.class);
	

	@Autowired
    private DicTypeDao dao;

		
	public DicTypeDao getDao() {
		return dao;
	}

	

}
