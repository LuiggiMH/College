package com.cybertools.college.cbdd;


import java.sql.*;

public class CBDD {
	
    private static Connection conn;
    
    private CBDD() {
    	
    }
    
    static {
        String url = "jdbc:mysql://localhost/college?useSSL=false";
        String user = "root";
        String password = "1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public static Connection getConnection(){
        return conn;
    }

}
