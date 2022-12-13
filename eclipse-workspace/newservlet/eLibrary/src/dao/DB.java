package dao;

import java.sql.*;
public class DB 
{
	public static Connection getConnection()
	{
		
		String url = "jdbc:mysql://localost:3306/demo";
		String uname = "root";
		String passw = "root";
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url,uname,passw);
			
		}
		catch(Exception e )
		{
			e.printStackTrace();
		}
	
	return conn;
	}
}
