package com.base.util;


public interface Constant {
	
	String PROJECT_URL = "http://localhost:8080/";
	
	Integer DEFAULT_PAGE_SIZE = 10;
	
	String RESPONSE_OK = "ok";
	String RESPONSE_ERROR = "error";
	
	String KEY_OF_STATUS_CODE = "statusCode";
	String KEY_OF_MESSAGE = "message";
	String KEY_OF_RESULT = "result";
	
	String SOLR_APPS = "apps";
	
	//（0=请求成功，1=服务器内部错误）
	Integer STATUS_CODE_SUCCESS = 0;
	Integer STATUS_CODE_FAILURE  = 1;
	

	
	String SUCCESS_MESSAGE ="成功";
	String FAILURE_MESSAGE ="失败";

	
}
