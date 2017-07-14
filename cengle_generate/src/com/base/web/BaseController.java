package com.base.web;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.base.util.Constant;
import com.cg.entity.SysConfig;
import com.cg.service.SysConfigService;



public class BaseController {
	
	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	// Servrice start
	@Autowired(required=false) //自动注入，不需要生成set方法了，required=false表示没有实现类，也不会报错。
	protected SysConfigService sysConfigService; 
	
	/**
	 * 响应成功
	 * @param resultMap
	 * @param appSearchContent
	 */
	protected void responseOk(Map<String, Object> resultMap,Object obj){
		resultMap.put(Constant.KEY_OF_STATUS_CODE, Constant.STATUS_CODE_SUCCESS);
		resultMap.put(Constant.KEY_OF_MESSAGE, Constant.RESPONSE_OK);
		resultMap.put(Constant.KEY_OF_RESULT, obj);
	}
	
	/**
	 * 响应错误
	 * @param resultMap
	 * @param appSearchContent
	 * @param e
	 */
	protected void responseError(Map<String, Object> resultMap,Object obj,Exception e){
		resultMap.put(Constant.KEY_OF_STATUS_CODE, Constant.STATUS_CODE_FAILURE);
		resultMap.put(Constant.KEY_OF_MESSAGE, Constant.RESPONSE_ERROR);
		resultMap.put(Constant.KEY_OF_RESULT, obj);
		logger.error(e.getMessage(), e);
	}
	/**
	 * 得到系统配置
	 * @return
	 */
	protected SysConfig getSysConfig(){
		return  sysConfigService.getSysConfig();
	};
}
