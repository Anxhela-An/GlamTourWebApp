package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import src.model.Employee;

public class EmployeeDao 
{
	public int registerEmployee(Employee em) throws ClassNotFoundException
	{
		String INSERT_EM = "INSERT INTO employee "+
	    "(id,firstName,lastName,username,password,address,contact) VALUES"+
		"(?,?,?,?,?,?,?);";
		String url = "jdbc:mysql://localhost:3306/demo";
		String uname = "root";
		String pass = "root";
	
	int result = 0;
	Class.forName("com.mysql.jdbc.Driver");
	try(Connection conn = DriverManager.getConnection(url,uname,pass);
		PreparedStatement preparedStatement = conn.prepareStatement(INSERT_EM))
	{
		preparedStatement.setInt(1, 1);
		preparedStatement.setString(2, em.getFirstName());
		preparedStatement.setString(3,em.getLastName() );
		preparedStatement.setString(4, em.getUsername());
		preparedStatement.setString(5, em.getPassword());
		preparedStatement.setString(6, em.getAddress());
		preparedStatement.setString(7, em.getContact());
		System.out.println(preparedStatement);
		result = preparedStatement.executeUpdate();
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			return result;
	}
 
}
