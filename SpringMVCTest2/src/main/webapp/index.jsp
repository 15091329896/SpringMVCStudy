<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	没注册的用户，请
	<a href="${pageContext.request.contextPath }/user703/register"> 注册</a>！
	<br /> 已注册的用户，去
	<a href="${pageContext.request.contextPath }/user703/login"> 登录</a>！
	<br />
	<br />
	<%-- <a href="${pageContext.request.contextPath }/index702/login7022"> 测试重定向 </a><br />
	<a href="${pageContext.request.contextPath }/index702/isLogin7023"> 测试转发</a> --%>

	<a href="${pageContext.request.contextPath }/admin703/add"> 测试新增 </a>
	<br />
	<a href="${pageContext.request.contextPath }/admin703/delete"> 测试删除
	</a>

	<br />
	<br />
	<form action="${pageContext.request.contextPath}/type/converter"
		method="post">
		请输入商品信息（格式为: apple,10.58,200）: <input type="text" name="goods" /><br>
		<input type="submit" value="提交" />
	</form>

	<br />
	<a href="${pageContext.request.contextPath }/user704/input"> 测试日期类型的格式化
	</a>
	
</body>
</html>