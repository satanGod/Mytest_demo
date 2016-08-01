package com.satan.http;

/**
 * 
 * @Description 通过http协议获得用户真实ip地址工具类
 * @TypeName UserIpUtils
 * @time 2016年6月8日 上午10:08:39
 * @author jiangxu
 */
public class UserIpUtils {
	
//	public static String getIpAddress(HttpServletRequest request) { 
//	    String ip = request.getHeader("x-forwarded-for"); 
//	    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
//	      ip = request.getHeader("Proxy-Client-IP"); 
//	    } 
//	    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
//	      ip = request.getHeader("WL-Proxy-Client-IP"); 
//	    } 
//	    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
//	      ip = request.getHeader("HTTP_CLIENT_IP"); 
//	    } 
//	    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
//	      ip = request.getHeader("HTTP_X_FORWARDED_FOR"); 
//	    } 
//	    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
//	      ip = request.getRemoteAddr(); 
//	    } 
//	    return ip; 
//	  } 
//	
//	public static Enumeration<String> getRequestHeaderNames(HttpServletRequest request){
//		return request.getHeaderNames();
//	}
}
