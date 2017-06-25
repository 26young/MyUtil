package com.emothion.string.mytools;

/**
 * @ClassName: com.emothion.String.mytools.StringUtils.java
 * @Description: 字符串工具类
 * <table border=1>
 * <tr><th>时间</th><th>修改内容</th></tr>
 * <tr><td>2016年11月24日</td><td>开发</td></tr>
 * </table>
 * @version: v1.0.0
 * @author: emothion
 * @date: 2016年11月24日 下午9:58:22
 */
public class StringUtils {

	/**
	 * @Function: com.emothion.String.mytools.StringUtils::isEmpty
	 * @param str
	 * @return
	 * @Description: 1、判断是否为空(StringUtil.isEmpty("  ") = false;)
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016年11月25日 下午4:47:05
	 */
	public static boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}
	
	/**
	 * @Function: com.emothion.String.mytools.StringUtils::isBlank
	 * @param str
	 * @return
	 * @Description: 2、判断是否为空且为空白(StringUtil.isEmpty("  ") = true;)
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016年11月25日 下午4:49:59
	 */
	public static boolean isBlank(String str) {
		return str == null || str.trim().length() == 0;
	}
	
	/**
	 * @Function: com.emothion.String.mytools.StringUtils::isNotEmpty
	 * @param str
	 * @return
	 * @Description: 3、判断字符串不为空
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016年11月25日 下午4:52:11
	 */
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}
	
	/**
	 * @Function: com.emothion.String.mytools.StringUtils::isNotBlank
	 * @param str
	 * @return
	 * @Description: 4、判断字符串不为空且不为空白
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016年11月25日 下午4:53:40
	 */
	public static boolean isNotBlank(String str) {
		return !isBlank(str);
	}

	public static String upFirstChar(String str) {
		String upStr = str.toUpperCase();
		return upStr.substring(0, 1)+str.substring(1);
	}
}
