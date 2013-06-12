package com.viewt.gb.framework.util;

/**
 * @author Elijah
 * @date 2013/06/12
 */
public class StringUtils {
	
	/**��Ϊ�ַ���ȥ���ո� ���ж��Ƿ�Ϊ���ַ�
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
	/**�ж��Ƿ�Ϊ���ַ�
	 * @param str
	 * @return
	 */
	public static boolean isNotBlank(String str){
		return !isBlank(str);
	}

}
