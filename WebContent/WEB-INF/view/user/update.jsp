<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户</title>
</head>
<body>
<form action="<%=path %>/user/updateUser.html" method="post">
	<table>
		<tr>
			<td>用户名</td>
			<td><input type="text" name="username" value="${user.username}"></td>
		</tr>
		<tr>
			<td>密码</td>
			<td><input type="text" name="password" value="${user.password}"></td>
		</tr>
		<tr>
			<td>昵称</td>
			<td><input type="text" name="nickname" value="${user.nickname}"></td>
		</tr>
		<tr>
			<td>真实姓名</td>
			<td><input type="text" name="realname" value="${user.realname}"></td>
		</tr>
		<tr>
			<td>性别</td>
			<td><input type="text" name="sex" value="${user.sex}"></td>
		</tr>
		<tr>
			<td>年龄</td>
			<td><input type="text" name="age" value="${user.age}"></td>
		</tr>
		<tr>
			<td>电话号码</td>
			<td><input type="text" name="phoneno" value="${user.phoneno}"></td>
		</tr>
		<tr>
			<td>住址</td>
			<td><input type="text" name="address" value="${user.address}"></td>
		</tr>
		<tr>
			<td>身份证号</td>
			<td><input type="text" name="cardid" value="${user.cardid}"></td>
		</tr>
		<tr>
			<td>电子邮箱</td>
			<td><input type="text" name="email" value="${user.email}"></td>
		</tr>
		<tr>
			<td><button type="submit" name="id" value="${user.id}">提交</button></td>
		</tr>
	</table>
</form>
</body>
</html>