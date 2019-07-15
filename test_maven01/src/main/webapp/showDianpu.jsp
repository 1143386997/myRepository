<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>展示</h1>
		<table border="1">
			<tr>
				<td>编号:</td>
				<td>${dianpu.did }</td>
			</tr>
			<tr>
				<td>店铺名称</td>
				<td>${dianpu.dname }</td>
			</tr>
			<tr>
				<td>创建时间</td>
				<td>${dianpu.createtime }</td>
			</tr>
			<tr>
				<td>销售商品</td>
				<td>
					<c:forEach items="${dianpu.shows }" var="show">
						${show.sname }
					</c:forEach>
				</td>
			</tr>
		</table>
	</center>
</body>
</html>