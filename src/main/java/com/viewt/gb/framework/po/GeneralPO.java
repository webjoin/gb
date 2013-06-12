package com.viewt.gb.framework.po;

import java.io.Serializable;

/**
 * @author Elijah
 * @description 为每个po 来继承使用 提供唯一的ID 
 */
public class GeneralPO  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long id;

	public long getId() {
		return id;
	}
}
