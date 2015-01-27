/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viewt.tools;

/**
 *
 * @author Elijah
 */
public enum EnumType {
    
    MYSQL{
         @Override
        public String getInfo(){
            return "com.mysql.jdbc.Driver";
        }
    },
    ORACLE{
        @Override
        public String getInfo(){
            return "oracle.jdbc.Driver";
        }
    },
    SQLSERVER{
         @Override
        public String getInfo(){
            return "com.mysql.jdbc.Driver";
        }
    };
    
    public abstract String getInfo();
    public static void main(String [] args){
        for ( EnumType t : values()){
            System.out.println(t.name());
        }
    }
    
}
