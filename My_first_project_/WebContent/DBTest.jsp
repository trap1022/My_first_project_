<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	Connection conn=null;
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/Covid?CharacterEncording=UTF-8&serverTimezone=UTC&useSSL=false";
	Boolean connect=false;
	try{
		Class.forName(driver);
		conn = DriverManager.getConnection(url,"root","admin");
		connect=true;
		conn.close();
		System.out.println(conn.toString());
	}catch(Exception e){
		connect=false;
		e.printStackTrace();
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
if(connect==true)
	out.println("DB연결 성공");
else
	out.println("DB연결 실패");
%>
</body>
</html>