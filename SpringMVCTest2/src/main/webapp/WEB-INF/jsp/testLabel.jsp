<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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