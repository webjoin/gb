package com.viewt.gb.framework.util;

/**
 * @author Elijah
 * @date 2013/06/12
 */
public class StringUtils {
	
	/**先为字符串去掉空格 再判断是否为空字符
	 * @param str /^*$/
	 * @return
	 */
	public static boolean isBlank(String str){
		if(null == str)
			return false;

		if(!"".equals(str.trim()))
			return false;
		
		if("".equals(str.trim()))
			return true;
		
		return false;
	}
	/**判断是否不为空字符
	 * @param str
	 * @return
	 */
	public static boolean isNotBlank(String str){
		return !isBlank(str);
	}

}
