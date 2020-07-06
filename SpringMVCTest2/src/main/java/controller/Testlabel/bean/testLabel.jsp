<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>这是这个测试功能对应当的JSP标签，运行时放在 /WEB-INF/jsp 目录下即可</title>
</head>
<body>
	<%-- <form action="${pageContext.request.contextPath }/index706/action" method="post">
		username:<input type="text" name="username" /> password:<input
			type="password" name="password" /> <input type="submit" value="GO" />
	</form> --%>

	<form:form modelAttribute="user"
		action="${pageContext.request.contextPath }/index706/action"
		method="post">
 username:<form:input path="username" />
 password:<form:password path="password" />
		<input type="submit" value="GO" />
	</form:form>

</body>
</html>