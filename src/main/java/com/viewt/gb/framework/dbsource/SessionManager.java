package com.viewt.gb.framework.dbsource;

import java.sql.Connection;

public class SessionManager {
	
	public static ThreadLocal<Connection> conn = new ThreadLocal<Connection>();
	
  
}
