package com.base.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.base.util.CommUtil;
import com.base.util.HttpInclude;
import com.base.util.WebUtils;
import com.cg.entity.SysConfig;

public class JModelAndView extends ModelAndView {
	public JModelAndView(String viewName) {
		super.setViewName(viewName);
		super.addObject("session", WebUtils.getHttpSession());
	}

	public JModelAndView(String viewName, SysConfig config, HttpServletRequest request, HttpServletResponse response) {
		String contextPath = request.getContextPath().equals("/") ? "" : request.getContextPath();
		String webPath = CommUtil.getURL(request);
		String port = ":" + CommUtil.null2Int(Integer.valueOf(request.getServerPort()));
		if ((config.getSecondDomainOpen()) && (!CommUtil.generic_domain(request).equals("localhost"))) {
			//webPath = "http://www." + CommUtil.generic_domain(request) + port + contextPath;
			webPath = "http://" + CommUtil.generic_domain(request) + port + contextPath;
		}
		super.setViewName(viewName);
		super.addObject("domainPath", CommUtil.generic_domain(request));
		if ((config.getImageWebServer() != null) && (!config.getImageWebServer().equals(""))) {
			super.addObject("imageWebServer", config.getImageWebServer());
		} else {
			super.addObject("imageWebServer", webPath);
		}
		super.addObject("webPath", webPath);
		super.addObject("config", config);
		//super.addObject("user", SecurityUserHolder.getCurrentUser());
		// super.addObject("httpInclude", new HttpInclude(request, response));
		String query_url = "";
		if ((request.getQueryString() != null) && (!request.getQueryString().equals(""))) {
			query_url = "?" + request.getQueryString();
		}
		super.addObject("current_url", request.getRequestURI() + query_url);
		boolean second_domain_view = false;
		String serverName = request.getServerName().toLowerCase();
		if ((serverName.indexOf("www.") < 0) && (serverName.indexOf(".") >= 0) && (serverName.indexOf(".") != serverName.lastIndexOf(".")) && (config.getSecondDomainOpen())) {
			String secondDomain = serverName.substring(0, serverName.indexOf("."));
			second_domain_view = true;
			super.addObject("secondDomain", secondDomain);
		}
		super.addObject("second_domain_view", Boolean.valueOf(second_domain_view));
		super.addObject("session", WebUtils.getHttpSession());
	}
	
	public JModelAndView(String viewName, int type) {
		if (type == 0) {
			super.setViewName("/WEB-INF/templates/zh_cn/system/" + viewName);
		}
		if (type == 1) {
			super.setViewName("/WEB-INF/templates/zh_cn/view/" + viewName);
		}
		if (type > 1) {
			super.setViewName(viewName);
		}
	}

	public JModelAndView(String viewName, SysConfig config, int type, HttpServletRequest request, HttpServletResponse response) {
		if (config != null && config.getLanguage() != null) {
			if ("zh_cn".equals(config.getLanguage())) {
				if (type == 0) {
					super.setViewName("/WEB-INF/templates/zh_cn/system/" + viewName);
				}
				if (type == 1) {
					super.setViewName("/WEB-INF/templates/zh_cn/view/" + viewName);
				}
				if (type > 1) {
					super.setViewName(viewName);
				}
			} else {
				if (type == 0) {
					super.setViewName("/WEB-INF/templates/" + config.getLanguage() + "/system/" + viewName);
				}
				if (type == 1) {
					super.setViewName("/WEB-INF/templates/" + config.getLanguage() + "/view/" + viewName);
				}
				if (type > 1) {
					super.setViewName(viewName);
				}
			}
		} else {
			super.setViewName(viewName);
		}
		super.addObject("CommUtil", new CommUtil());
		String contextPath = request.getContextPath().equals("/") ? "" : request.getContextPath();
		String webPath = CommUtil.getURL(request);
		String port = ":" + CommUtil.null2Int(Integer.valueOf(request.getServerPort()));
		if ((config.getSecondDomainOpen()) && (!CommUtil.generic_domain(request).equals("localhost"))) {
			//webPath = "http://www." + CommUtil.generic_domain(request) + port + contextPath;
			webPath = "http://" + CommUtil.generic_domain(request) + port + contextPath;
		}
		super.addObject("domainPath", CommUtil.generic_domain(request));
		super.addObject("webPath", webPath);
	    super.addObject("httpInclude", new HttpInclude(request, response));
		if ((config.getImageWebServer() != null) && (!config.getImageWebServer().equals(""))) {
			super.addObject("imageWebServer", config.getImageWebServer());
		} else {
			super.addObject("imageWebServer", webPath);
		}
		if(config.getCombineWebServer()!=null && !config.getCombineWebServer().equals("")){
			super.addObject("combineWebServer", config.getCombineWebServer());
		}
		super.addObject("config", config);
		// super.addObject("user", SecurityUserHolder.getCurrentUser());
		// super.addObject("httpInclude", new HttpInclude(request, response));
		String query_url = "";
		if ((request.getQueryString() != null) && (!request.getQueryString().equals(""))) {
			query_url = "?" + request.getQueryString();
		}
		super.addObject("current_url", request.getRequestURI() + query_url);
		boolean second_domain_view = false;
		String serverName = request.getServerName().toLowerCase();
		if ((serverName.indexOf("www.") < 0) && (serverName.indexOf(".") >= 0) && (serverName.indexOf(".") != serverName.lastIndexOf(".")) && (config.getSecondDomainOpen())) {
			String secondDomain = serverName.substring(0, serverName.indexOf("."));
			second_domain_view = true;
			super.addObject("secondDomain", secondDomain);
		}
		super.addObject("second_domain_view", second_domain_view);
		super.addObject("session", WebUtils.getHttpSession());
	}
}
