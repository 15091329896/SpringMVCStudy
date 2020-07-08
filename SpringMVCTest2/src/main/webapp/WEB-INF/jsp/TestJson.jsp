<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>json交互测试</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
//请求json响应json
function requestJson(){
    $.ajax({
        type:"post",
        url:"${pageContext.request.contextPath }/index708/requestJson",
        contentType:"application/json;charset=utf-8",
        data:'{"name":"测试商品","price":99.9}',
        success:function(data){
            alert(data);
        }
    });
}

//请求key/value响应json
function responseJson(){
    $.ajax({
        type:"post",
        url:"${pageContext.request.contextPath }/index708/responseJson",
        contentType:"application/json;charset=utf-8",
        data:'name=手机&price=99.9',/*不需要指定contentType，因为默认就是key/value类型*/
        success:function(data){
            alert(data);
        }
    });
}

</script>
</head>
<body>
    <input type="button" onclick="requestJson()" value="请求json响应json" />
    <input type="button" onclick="responseJson()" value="请求key/value响应json" />
</body>
</html>
