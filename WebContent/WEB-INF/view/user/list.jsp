<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body>

<table border="1" align="center">
	<tr>
		<td>编号</td>
		<td>用户id</td>
		<td>用户名</td>
		<td>密码</td>
		<td>昵称</td>
		<td>真实姓名</td>
		<td>性别</td>
		<td>年龄</td>
		<td>电话号码</td>
		<td>住址</td>
		<td>身份证号</td>
		<td>电子邮箱</td>
		<td>修改</td>
		<td>删除</td>
	</tr>
	<c:forEach items="${list}" var="a" varStatus="b">
	<tr>
		<td><a>${b.count}</a></td>
		<td><a>${a.id}</a></td>
		<td>${a.username}</td>
		<td>${a.password}</td>
		<td>${a.nickname}</td>
		<td>${a.realname}</td>
		<td>${a.sex}</td>
		<td>${a.age}</td>
		<td>${a.phoneno}</td>
		<td>${a.address}</td>
		<td>${a.cardid}</td>
		<td>${a.email}</td>
		<td><a href="<%=path %>/user/update.html?id=${a.id}">修改</a></td>
		<td><a href="<%=path %>/user/delete.html?id=${a.id}">删除</a></td>
	</tr>
	</c:forEach>
	<tr>
		<td align="center"><a href="<%=path %>/add.htm">注册</a></td>
	</tr>
</table>
</body>
</html>