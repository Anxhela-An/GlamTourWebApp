package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.LibrarianBean;

public class LibrarianDao 
{
  public static int save(LibrarianBean bean)
  {
	  int status=0;
	  String query = "insert into e_librarian (name,email,password,mobile) values (?,?,?,?)";
	  try {
		  
		  Connection conn = DB.getConnection();
		  PreparedStatement preparedStatement = conn.prepareStatement(query);
		  preparedStatement.setString(1, bean.getName());
		  preparedStatement.setString(2, bean.getEmail());
		  preparedStatement.setString(3, bean.getPassword());
		  preparedStatement.setLong(4, bean.getMobile());
		  
		  status = preparedStatement.executeUpdate();
		  
		  preparedStatement.close();
		  conn.close();
	  }
	  catch(Exception e )
	  {
		  e.printStackTrace();
	  }
	  return status;
  }
  public static int update(LibrarianBean bean)
  {
	  int status = 0;
	  String query = "update e_librarian set name =?,email=?,password=?,mobile=?, where id=?";
	  try {
		   Connection conn = DB.getConnection();
		   PreparedStatement preparedStatement = conn.prepareStatement(query);
		   preparedStatement.setString(1, bean.getName());
		   preparedStatement.setString(2, bean.getEmail());
		   preparedStatement.setString(3, bean.getPassword());
		   preparedStatement.setLong(4, bean.getMobile());
		   preparedStatement.setInt(5, bean.getId());
		   
		   status= preparedStatement.executeUpdate();
		   preparedStatement.close();
		   conn.close();
		   
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return status;
  }
  public static List<LibrarianBean> view(int id)
  {
	  List<LibrarianBean> list = new ArrayList<LibrarianBean>();
	  String sql = "select * from e_librarian where id=?";
	  try {
		  Connection conn = DB.getConnection();
		  PreparedStatement preparedStatement = conn.prepareStatement(sql);
		  ResultSet rs = preparedStatement.executeQuery();
		  if(rs.next())
		  {
			  LibrarianBean bean = new LibrarianBean();
			  bean.setId(rs.getInt("id"));
			  bean.setName(rs.getString("name"));
			  bean.setEmail(rs.getString("email"));
			  bean.setPassword(rs.getString("password"));
			  bean.setMobile(rs.getLong("mobile"));
			  list.add(bean);
			  
		  }
		  preparedStatement.close();
		  conn.close();
	  }
	  catch(Exception e )
	  {
		  e.printStackTrace();
	  }
	  return list;
  }
  public static LibrarianBean viewById(int id)
  {
	  LibrarianBean bean = new LibrarianBean();
	  String sql = "select * from e_librarian where id=?";
	  try
	  {
		  Connection conn = DB.getConnection();
		  PreparedStatement preparedStatement = conn.prepareStatement(sql);
		  preparedStatement.setInt(1, id);
		  ResultSet rs = preparedStatement.executeQuery();
		  if(rs.next())
		  {
			  bean.setId(rs.getInt("id"));
			  bean.setName(rs.getString("name"));
			  bean.setEmail(rs.getString("email"));
			  bean.setPassword(rs.getString("password"));
			  bean.setMobile(rs.getLong("mobile"));
			  
		  }
		  preparedStatement.close();
		  conn.close();
		  
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return bean;
  }
  public static int delete(int id)
  {
	  int status=0;
	  String sql = "delete from e_librarian where id=?";
	  try {
		  Connection conn = DB.getConnection();
		  PreparedStatement preparedStatement = conn.prepareStatement(sql);
		  preparedStatement.setInt(1, id);
		  status = preparedStatement.executeUpdate();
		  preparedStatement.close();
		  conn.close();
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return status;
  }
  public static boolean authenticate (String email,String password)
  {
	  boolean status=false;
	  String sql = "select * from e_librarian where email=? and password =?";
	  try
	  {
		  Connection conn = DB.getConnection();
		  PreparedStatement preparedStatement = conn.prepareStatement(sql);
		  preparedStatement.setString(1, email);
		  preparedStatement.setString(2, password);
		  ResultSet st = preparedStatement.executeQuery();
		  if(st.next())
		  {
			  status=true;
		  }
		  preparedStatement.close();
		  conn.close();
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return status;
  }
}

