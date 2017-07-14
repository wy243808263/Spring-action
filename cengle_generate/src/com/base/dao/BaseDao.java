package com.base.dao;

import java.util.List;

import com.base.criteria.Criteria;

public interface BaseDao {

	
	public <T> void add(T t);
	
	
	public <T> void update(T t);
	
	public <T> void updateBySelective(T t); 	
	
	public void delete(Object id);
	

	public int queryByCount(Criteria criteria);
	
	public <T> List<T> queryByList(Criteria criteria);
	
	
	public <T> T queryById(Object id);
}
