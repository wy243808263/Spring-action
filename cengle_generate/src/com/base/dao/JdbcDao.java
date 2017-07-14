package com.base.dao;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class JdbcDao {
	protected final Log logger = LogFactory.getLog(getClass());
	
	private SimpleJdbcCall procCaller;

	public JdbcDao(DataSource dataSource) {
		this.procCaller =  new SimpleJdbcCall(dataSource);
	}
	
	
	public void callProcedure(String name) {
		procCaller.withProcedureName(name);
		procCaller.execute();
	}
	
}
