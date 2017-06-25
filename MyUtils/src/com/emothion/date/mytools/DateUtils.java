package com.emothion.date.mytools;

import java.sql.Timestamp;

/**
 * @ClassName: com.emothion.date.mytools.DateUtils.java
 * @Description: 时间工具类
 * <table border=1>
 * <tr><th>时间</th><th>修改内容</th></tr>
 * <tr><td>2016年11月24日</td><td>开发内容：1、2、3</td></tr>
 * </table>
 * @version: v1.0.0
 * @author: emothion
 * @date: 2016年11月24日 下午9:46:45
 */
public class DateUtils {
	
	/**
	 * @Function: com.emothion.date.mytools.DateUtils::getParamMonthLastDay
	 * @param year
	 * @param month
	 * @return
	 * @Description: 获取该月最后一天
	 * <table border=1>
	 * <tr><th>时间</th><th>修改内容</th></tr>
	 * <tr><td>2016年11月24日</td><td>开发</td></tr>
	 * </table>
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016年11月24日 下午9:48:07
	 */
	public static String getParamMonthLastDay(int year, int month) {
		StringBuilder retDate = new StringBuilder(String.valueOf(year));
		retDate.append("-").append(month).append("-");
		if (month == 2) {
			if (judgeBissextile(year)) {
				return retDate.append("29").toString();
			} else {
				return retDate.append("28").toString();
			}
		} else {
			if (((month <= 7 && month >= 1) && month % 2 != 0) || ((month >= 8 && month <= 12) && month % 2 == 0)) {
				return retDate.append("31").toString();
			} else {
				return retDate.append("30").toString();
			}
		}
	}

	/**
	 * @Function: com.emothion.date.mytools.DateUtils::judgeBissextile
	 * @param year
	 * @return
	 * @Description: 判断是否是闰年
	 * <table border=1>
	 * <tr><th>时间</th><th>修改内容</th></tr>
	 * <tr><td>2016年11月24日</td><td>开发</td></tr>
	 * </table>
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016年11月24日 下午9:52:57
	 */
	public static boolean judgeBissextile(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		}
		return false;
	}
	
	/**
	 * @Function: com.emothion.date.mytools.DateUtils::getDefaultSysTime
	 * @return
	 * @Description: 获取系统当前时间
	 * <table border=1>
	 * <tr><th>时间</th><th>修改内容</th></tr>
	 * <tr><td>2016年11月24日</td><td>开发</td></tr>
	 * </table>
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016年11月24日 下午9:56:31
	 */
	public static Timestamp getDefaultSysTime() {
		return new Timestamp(System.currentTimeMillis());
	}
}
