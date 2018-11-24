<%@ page language="java" import = "java.util.*" import = "java.net.*" import = "java.sql.*" contentType="text/html; charset=gb2312" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询</title>
</head>

<body>

	<form action="servlets/DealWithServlet" method="post">
		        请输入图书信息的模糊资料：<input type="text" name="bookname"><br>
		     
		   <input type="submit" value="查询" name="login">
	</form>
</body>
</html>
