package com.amdocs.training.DBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	private static Connection con = null;
	private DBUtils() {
	};
	public static Connection getConnection(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// tablespace;
			String Url="jdbc:mysql://localhost:3306/tablespace";
			String Username="root";
			String Password="12345";
		    con=DriverManager.getConnection(Url, Username, Password);
		    return con;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
