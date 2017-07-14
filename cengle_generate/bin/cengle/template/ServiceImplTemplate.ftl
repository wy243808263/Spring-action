package ${bussPackage}.service.impl#if($!entityPackage).${entityPackage}#end;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.base.service.BaseServiceImpl;
import ${bussPackage}.dao#if($!entityPackage).${entityPackage}#end.${className}Dao;
import ${bussPackage}.service#if($!entityPackage).${entityPackage}#end.${className}Service;

/**
 * 
 * <br>
 * <b>功能：</b>${className}Service<br>
 */
@Service("$!{lowerName}Service")
public class  ${className}ServiceImpl  extends BaseServiceImpl implements ${className}Service {
  private final static Logger log= Logger.getLogger(${className}ServiceImpl.class);
	

	@Autowired
    private ${className}Dao dao;

		
	public ${className}Dao getDao() {
		return dao;
	}

	

}
