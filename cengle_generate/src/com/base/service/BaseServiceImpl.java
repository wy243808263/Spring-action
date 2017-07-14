package com.base.service;

import java.util.List;

import com.base.criteria.Criteria;
import com.base.dao.BaseDao;

public abstract class BaseServiceImpl implements BaseService{
	
	public abstract BaseDao getDao();

	
	public <T> void add(T t)  throws Exception{
	    getDao().add(t);
	}
	
	public <T> void update(T t)  throws Exception{
		getDao().update(t);
	}
	
	
	public <T> void updateBySelective(T t){
		getDao().updateBySelective(t);
	}
	
	public void delete(Object... ids) throws Exception{
		if(ids == null || ids.length < 1){
			return;
		}
		for(Object id : ids ){
			getDao().delete(id);
		}
	}
	
	public int queryByCount(Criteria criteria)throws Exception{
		return getDao().queryByCount(criteria);
	}
	
	public <T> List<T> queryByList(Criteria criteria) throws Exception{
		criteria.setTotalCount(queryByCount(criteria));
		return getDao().queryByList(criteria);
	}

	public <T> T queryById(Object id) throws Exception{
		return getDao().queryById(id);
	}
}
