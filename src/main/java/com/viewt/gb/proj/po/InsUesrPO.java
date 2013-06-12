package com.viewt.gb.proj.po;

import java.sql.Timestamp;

import com.viewt.gb.framework.po.ViewtPO;

@ViewtPO
public class InsUesrPO {
	
	private long id ;
	private String userId;
	private Timestamp expireDate;
	private Timestamp effeictiveDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Timestamp getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Timestamp expireDate) {
		this.expireDate = expireDate;
	}
	public Timestamp getEffeictiveDate() {
		return effeictiveDate;
	}
	public void setEffeictiveDate(Timestamp effeictiveDate) {
		this.effeictiveDate = effeictiveDate;
	}
	
}
