/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viewt.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elijah
 */
public class DBHelper {
    
    public static Logger logger = Logger.getLogger(DBHelper.class.getName());
    static String DB_TYPE = "";
    private static Connection conn = null ;
    
    public static Connection getTestConn(String driver,String url,String user,String pass){
        
        try {
            Class.forName(driver);
            return conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
            logger.log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
        return null ;
     }
    
    public static Connection getConnection(){
        return conn ;
    }
    public static void main(String[] args){
        getTestConn("com.mysql.jdbc.Driver", "mysql:jdbc://127.0.0.1:3306/ucc", "root", "123456");
    }
    
    
}
