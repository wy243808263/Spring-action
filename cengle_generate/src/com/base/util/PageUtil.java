package com.base.util;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.base.criteria.Criteria;


public class PageUtil {

	public static String showPageStaticHtml(String url, int currentPage, int pages) {
		String s = "";
		if (pages > 0) {
			if (currentPage >= 1) {
				s = s + "<a href='" + url + "_1.htm'>首页</a> ";
				if (currentPage > 1) {
					s = s + "<a href='" + url + "_" + (currentPage - 1) + ".htm'>上一页</a> ";
				}
			}
			int beginPage = currentPage - 3 < 1 ? 1 : currentPage - 3;
			if (beginPage <= pages) {
				s = s + "　";
				int i = beginPage;
				for (int j = 0; (i <= pages) && (j < 6); j++) {
					if (i == currentPage) {
						s = s + "<a class='this' href='" + url + "_" + i + ".htm'>" + i + "</a> ";
					} else {
						s = s + "<a href='" + url + "_" + i + ".htm'>" + i + "</a> ";
					}
					i++;
				}
				s = s + "　";
			}
			if (currentPage <= pages) {
				if (currentPage < pages) {
					s = s + "<a href='" + url + "_" + (currentPage + 1) + ".htm'>下一页</a> ";
				}
				s = s + "<a href='" + url + "_" + pages + ".htm'>末页</a> ";
			}
		}
		return s;
	}

	public static String showPageHtml(String url, String params, int currentPage, int pages) {
		String s = "";
		if (pages > 1) {
			if (currentPage >= 1) {
				s = s + "<a href='" + url + "?currentPage=1" + params + "'>首页</a> ";
				if (currentPage > 1) {
					s = s + "<a href='" + url + "?currentPage=" + (currentPage - 1) + params + "'>上一页</a> ";
				}
			}
			int beginPage = currentPage - 3 < 1 ? 1 : currentPage - 3;
			if (beginPage <= pages) {
				s = s + " ";
				int i = beginPage;
				for (int j = 0; (i <= pages) && (j < 6); j++) {
					if (i == currentPage) {
						s = s + "<a class='this' href='" + url + "?currentPage=" + i + params + "'>" + i + "</a> ";
					} else {
						s = s + "<a href='" + url + "?currentPage=" + i + params + "'>" + i + "</a> ";
					}
					i++;
				}
				s = s + " ";
			}
			if (currentPage <= pages) {
				if (currentPage < pages) {
					s = s + "<a href='" + url + "?currentPage=" + (currentPage + 1) + params + "'>下一页</a> ";
				}
				s = s + "<a href='" + url + "?currentPage=" + pages + params + "'>末页</a> ";
			}
		}
		return s;
	}

	public static String showPageFormHtml(int currentPage, int pages) {
		String s = "";
		if (pages > 1) {
			if (currentPage >= 1) {
				s = s + "<a href='javascript:void(0);' onclick='return gotoPage(1)'>首页</a> ";
				if (currentPage > 1) {
					s = s + "<a href='javascript:void(0);' onclick='return gotoPage(" + (currentPage - 1) + ")'>上一页</a> ";
				}
			}
			int beginPage = currentPage - 3 < 1 ? 1 : currentPage - 3;
			if (beginPage <= pages) {
				s = s + "　";
				int i = beginPage;
				for (int j = 0; (i <= pages) && (j < 6); j++) {
					if (i == currentPage) {
						s = s + "<a class='this' href='javascript:void(0);' onclick='return gotoPage(" + i + ")'>" + i + "</a> ";
					} else {
						s =

						s + "<a href='javascript:void(0);' onclick='return gotoPage(" + i + ")'>" + i + "</a> ";
					}
					i++;
				}
				s = s + "　";
			}
			if (currentPage <= pages) {
				if (currentPage < pages) {
					s = s + "<a href='javascript:void(0);' onclick='return gotoPage(" + (currentPage + 1) + ")'>下一页</a> ";
				}
				s = s + "<a href='javascript:void(0);' onclick='return gotoPage(" + pages + ")'>末页</a> ";
			}
		}
		return s;
	}

	public static String showPageAjaxHtml(String url, String params, int currentPage, int pages) {
		String s = "";
		if (pages > 1) {
			String address = url + "?1=1" + params;
			if (currentPage >= 1) {
				s = s + "<a href='javascript:void(0);' onclick='return ajaxPage(\"" + address + "\",1,this)'>首页</a> ";
				s = s + "<a href='javascript:void(0);' onclick='return ajaxPage(\"" + address + "\"," + (currentPage - 1) + ",this)'>上一页</a> ";
			}
			int beginPage = currentPage - 3 < 1 ? 1 : currentPage - 3;
			if (beginPage <= pages) {
				s = s + " ";
				int i = beginPage;
				for (int j = 0; (i <= pages) && (j < 6); j++) {
					if (i == currentPage) {
						s =

						s + "<a class='this' href='javascript:void(0);' onclick='return ajaxPage(\"" + address + "\"," + i + ",this)'>" + i + "</a> ";
					} else {
						s =

						s + "<a href='javascript:void(0);' onclick='return ajaxPage(\"" + address + "\"," + i + ",this)'>" + i + "</a> ";
					}
					i++;
				}
				s = s + " ";
			}
			if (currentPage <= pages) {
				s =

				s + "<a href='javascript:void(0);' onclick='return ajaxPage(\"" + address + "\"," + (currentPage + 1) + ",this)'>下一页</a> ";
				s = s + "<a href='javascript:void(0);' onclick='return ajaxPage(\"" + address + "\"," + pages + ",this)'>末页</a> ";
			}
		}
		return s;
	}

	public static void savePageList2ModelAndView(String url, String staticURL, String params, List dataList, Criteria criteria, ModelAndView mv) {
		if (dataList != null) {
			mv.addObject("objs", dataList);
			mv.addObject("totalPage", criteria.getTotalPage());
			mv.addObject("pageSize", criteria.getPageSize());
			mv.addObject("rows", criteria.getTotalCount());
			mv.addObject("currentPage", criteria.getCurrentPage());
			mv.addObject("gotoPageHTML", showPageHtml(url, params, criteria.getCurrentPage(), criteria.getTotalPage()));
			mv.addObject("gotoPageFormHTML", showPageFormHtml(criteria.getCurrentPage(), criteria.getTotalPage()));
			mv.addObject("gotoPageStaticHTML", showPageStaticHtml(staticURL, criteria.getCurrentPage(), criteria.getTotalPage()));
			mv.addObject("gotoPageAjaxHTML", showPageAjaxHtml(url, params, criteria.getCurrentPage(), criteria.getTotalPage()));
		}
	}

	
	public static void savePageList2ModelAndView(List dataList, Criteria criteria, ModelAndView mv) {
		savePageList2ModelAndView("", "", "", dataList, criteria, mv);
	}

}
