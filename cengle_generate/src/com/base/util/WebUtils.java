package com.base.util;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;



public class WebUtils {
    
	/**
	 * 设置Session attribute
	 * @param request
	 * @param key
	 * @param value
	 */
	public static void setSessionAttribute(String key, Object value) {
		getHttpSession().setAttribute(key, value);
	}
	/**
	 * 取值
	 * @param key
	 */
	public static Object getSessionValue(String key) {
		return getHttpSession().getAttribute(key);
	}
	
	/**
	 * 获取HttpServletRequest
	 * @return
	 */
	public static HttpServletRequest getHttpServletRequest(){
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		return request;
	}
	

	/**
	 * 获取HttpSession
	 * @return
	 */
	public static HttpSession getHttpSession(){
		return getHttpServletRequest().getSession();
	}
	
	public static ServletContext getServletContext(){
		return getHttpServletRequest().getSession().getServletContext();
	}
	
	  public static String getWebProjectRootPath()
	  {
	    String path = getServletContext().getRealPath("/").replace("\\", "/") + "/";
	    return path;
	  }
	
	 /**
     * 添加cookie
     * @param response
     * @param name cookie的名称
     * @param value cookie的值
     * @param maxAge cookie存放的时间(以秒为单位,假如存放三天,即3*24*60*60; 如果值为0,cookie将随浏览器关闭而清除)
     */
    public static void addCookie(HttpServletResponse response, String name, String value, int maxAge) {        
        Cookie cookie = new Cookie(name, value);
        cookie.setPath("/");
        if (maxAge>0) cookie.setMaxAge(maxAge);
        response.addCookie(cookie);
    }
	
	
	
    /**
     * 获取cookie的值
     * @param request
     * @param name cookie的名称
     * @return
     */
    public static String getCookieByName(String name) {
    	Map<String, Cookie> cookieMap = readCookieMap();
        if(cookieMap.containsKey(name)){
            Cookie cookie = (Cookie)cookieMap.get(name);
            return cookie.getValue();
        }else{
            return null;
        }
    }
    
    /**
     * 读取Cookie返回MAP
     * @return
     */
    protected static Map<String, Cookie> readCookieMap() {
        Map<String, Cookie> cookieMap = new HashMap<String, Cookie>();
        Cookie[] cookies = getHttpServletRequest().getCookies();
        if (null != cookies) {
            for (int i = 0; i < cookies.length; i++) {
                cookieMap.put(cookies[i].getName(), cookies[i]);
            }
        }
        return cookieMap;
    }
	
	/**
	 * 组织十个元素以-分隔
	 */
	public static String buildViewHistoryValue(String cookieName, Integer currentProductId){
		//1.如果当前浏览的id已经在浏览历史里了,我们要把移到最前面
		//2.如果浏览历史里已经达到了10个元素了,我们需要把最选进入的元素删除
		String cookieValue=	getCookieByName(cookieName);
			LinkedList<Integer> oids=new LinkedList<Integer>();
			if(cookieValue!=null&&!"".equals(cookieValue)){
				String[] ids=cookieValue.split("-");
				for(String id:ids){
					oids.offer(new Integer(Integer.parseInt(id)));
				}
				if(oids.contains(currentProductId)) oids.remove(currentProductId);
				if(oids.size()>=5) oids.poll();
			}
			oids.offer(currentProductId);
			StringBuffer out = new StringBuffer();
			for(Integer id : oids){
				out.append(id).append('-');
			}
			out.deleteCharAt(out.length()-1);
			return out.toString();
		}
	
	/**
	 * 获取cookieName对应的cookie value值 ，以数组形式返回
	 * @param cookieName
	 * @return
	 */
	public static Integer[] getViewHistoryValue(String cookieName){
		//历史记录
		String cookieValue=getCookieByName(cookieName);
		 Integer[] nids=null;
		if(cookieValue!=null && !"".equals(cookieValue.trim()))
		{
		  String[] oids=cookieValue.split("-");
		   nids=new Integer[oids.length];
		  for(int i=0;i<nids.length;i++){
			  nids[i]=new Integer(oids[i].trim());
		  }
	   }
		return nids;
	}
	
}
