package com.emothion.arraylist.mytools;

import java.util.List;

/**
 * @ClassName: com.emothion.arraylist.mytools.ArrayListUtils.java
 * @Description: 数组类型工具类
 * <table border=1>
 * <tr><th>时间</th><th>修改内容</th></tr>
 * <tr><td>2016年11月25日</td><td>开发</td></tr>
 * </table>
 * @version: v1.0.0
 * @author: emothion
 * @date: 2016年11月25日 下午8:25:09
 */
public class ArrayListUtils {

	/**
	 * @Function: com.emothion.arraylist.mytools.ArrayListUtils::isEmpty
	 * @param args
	 * @return
	 * @Description: 1、判断List为空 
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016年11月25日 下午8:26:44
	 */
	public static boolean isEmpty(List<Object> args){
		return args == null || args.size() == 0;
	}
	
	/**
	 * @Function: com.emothion.arraylist.mytools.ArrayListUtils::isNotEmpty
	 * @param args
	 * @return
	 * @Description: 2、判断List不为空
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016年11月25日 下午8:30:04
	 */
	public static boolean isNotEmpty(List<Object> args) {
		return !isEmpty(args);
	}
	
	/**
	 * @Function: com.emothion.arraylist.mytools.ArrayListUtils::isEmpty
	 * @param args
	 * @return
	 * @Description: 3、字符数组判空
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016年11月25日 下午8:34:18
	 */
	public static boolean isEmpty(String[] args){
		return args == null || args.length == 0;
	}
	
	/**
	 * @Function: com.emothion.arraylist.mytools.ArrayListUtils::isNotEmpty
	 * @param args
	 * @return
	 * @Description: 4、判断字符数组不为空
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016年11月25日 下午8:35:28
	 */
	public static boolean isNotEmpty(String[] args) {
		return !isEmpty(args);
	}
	
	/**
	 * @Function: com.emothion.arraylist.mytools.ArrayListUtils::isEmpty
	 * @param args
	 * @return
	 * @Description: 5、超类数组判空
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016年11月25日 下午8:36:06
	 */
	public static boolean isEmpty(Object[] args){
		return args == null || args.length == 0;
	}
	
	/**
	 * @Function: com.emothion.arraylist.mytools.ArrayListUtils::isNotEmpty
	 * @param args
	 * @return
	 * @Description: 6、判断超类数组不为空
	 * @version: v1.0.0
	 * @author: emothion
	 * @date: 2016年11月25日 下午8:37:04
	 */
	public static boolean isNotEmpty(Object[] args){
		return !isEmpty(args);
	}
	
}
