package com.base.service;

import java.util.List;

import com.base.criteria.Criteria;
import com.base.dao.BaseDao;

public interface  BaseService{
	
	public abstract BaseDao getDao();

	
	public <T> void add(T t)  throws Exception;
	
	public <T> void update(T t)  throws Exception;
	
	
	public <T> void updateBySelective(T t);
	
	public void delete(Object... ids) throws Exception;
	
	public int queryByCount(Criteria criteria)throws Exception;
	
	public <T> List<T> queryByList(Criteria criteria) throws Exception;

	public <T> T queryById(Object id) throws Exception;



}
