<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>현재시간</title>
</head>
<body>
<% String now = (String)request.getAttribute("now"); %>
	<h1>현재 시간은 <%=now %>입니다.</h1>

</body>
</html>