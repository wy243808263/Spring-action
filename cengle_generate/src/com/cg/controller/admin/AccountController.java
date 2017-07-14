package com.cg.controller.admin;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.base.web.BaseController;
import com.base.util.PageUtil;
import com.base.criteria.Criteria;
import com.base.web.JModelAndView;
import com.cg.entity.Account;
 import com.cg.service.AccountService;
/**
 * 
 * <br>
 * <b>功能：</b>AccountController<br>
 *   <br>
 */ 
@Controller
public class AccountController extends BaseController{
	
	private final static Logger log= Logger.getLogger(AccountController.class);
	@Autowired(required=false) 
	private AccountService accountService; 
	
	
	
	/**
	 * 
	 * @param page
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/Account/list") 
	public ModelAndView  list(HttpServletRequest request, HttpServletResponse response) throws Exception{
	    ModelAndView mv =new JModelAndView("url", getSysConfig(), 0, request, response);
	    Criteria criteria=new Criteria();
		List<Account> dataList = accountService.queryByList(criteria);
		PageUtil.savePageList2ModelAndView(dataList, criteria, mv);
		return mv; 
	}
	
	

}
