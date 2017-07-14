package com.base.util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLFilter {
    
    private static final String regEx_script = "<script[^>]*?>[\\s\\S]*?<\\/script>"; // 定义script的正则表达式
    private static final String regEx_style = "<style[^>]*?>[\\s\\S]*?<\\/style>"; // 定义style的正则表达式
    private static final String regEx_html = "<[^>]+>"; // 定义HTML标签的正则表达式
    
    public static String delHTMLTag(String htmlStr) {
        Pattern p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);
        Matcher m_script = p_script.matcher(htmlStr);
        htmlStr = m_script.replaceAll(""); // 过滤script标签

        Pattern p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);
        Matcher m_style = p_style.matcher(htmlStr);
        htmlStr = m_style.replaceAll(""); // 过滤style标签

        Pattern p_html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
        Matcher m_html = p_html.matcher(htmlStr);
        htmlStr = m_html.replaceAll(""); // 过滤html标签

        return htmlStr.trim(); // 返回文本字符串
    }
    
    public static String CRLF(String htmlStr) {
    	String newString=htmlStr;  
        Pattern CRLF = Pattern.compile("(\r\n|\r|\n|\n\r|\t)");  
        Matcher m = CRLF.matcher(htmlStr);  
        if (m.find()) {  
          newString = m.replaceAll("<br/>");
          newString=newString.replaceAll(" ", "&nbsp;");
        }  
        return newString; 
    }
    public static void main(String[] args) {
    	String a=delHTMLTag("<span style='font-size: 18px;'>一80后夫妻有了个可爱的宝宝，<img src='cc'>老婆每天都很用心的教导孩子叫“爸爸”老公大受感动，认为太太真好，先教孩子叫爸爸，而不是叫妈妈，觉得真幸福。在一个寒冬深夜，孩子哭闹不休</span>");
    	System.out.println(a);
    	
	}
}