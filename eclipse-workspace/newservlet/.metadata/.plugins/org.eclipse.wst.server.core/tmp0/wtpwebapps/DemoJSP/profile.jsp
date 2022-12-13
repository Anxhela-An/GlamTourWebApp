<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
 Class.forName("com.mysql.jdbc.Driver");
 String url = "jdbc:mysql://localhost:3306/demo";
 String username = "root";
 String password = "root";
 String sql = "select * from student where rollno =103";
 Connection conn = DriverManager.getConnection(url,username,password);
 
 Statement stmt = conn.createStatement();
 ResultSet rs = stmt.executeQuery(sql);
 rs.next();

%>

Rollno :  <%=rs.getString(1) %> <br>
Marks  :  <%=rs.getString(2) %> <br>
Name   :  <%=rs.getString(3) %>
</body>
</html>