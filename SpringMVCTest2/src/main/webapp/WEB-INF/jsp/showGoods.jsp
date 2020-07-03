<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示商品信息</title>
</head>
<body>
	显示商品信息
	<br/>
	<br/>
	    您创建的商品信息如下：
    <!-- 使用EL表达式取出model中的goods信息 -->
	    商品名称为:${goods.goodsname }
	    商品价格为:${goods.goodsprice }
	    商品名称为:${goods.goodsnumber }
</body>
</html>







