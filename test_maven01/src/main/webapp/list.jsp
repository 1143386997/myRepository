<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/index_work.css" type="text/css">
</head>
<body>
	<center>
		销售商品
		<form action="queryDianpu" method="post">
			<c:forEach items="${showList }" var="shows">
				<input type="checkbox" name="sname" value="${shows.sname }">${shows.sname }&nbsp;&nbsp;
			</c:forEach><br/>
			商铺名称:<input type="text" value="${dianpu.dname }" name="dname">
			<input type="submit" value="查询">
			<input type="button" value="新增" onclick="location.href='add.jsp'">
		</form>
		<table border="1">
			<tr>
				<td> <input type="checkbox">  </td>
				<td>编号</td>
				<td>店铺名称</td>
				<td>创建日期</td>
				<td>销售商品</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${dianpuList.list }" var="dianpus">
				<tr>
					<td> <input type="checkbox" value="${dianpus.did }"> </td>
					<td>${dianpus.did }</td>
					<td> ${dianpus.dname }</td>
					<td> <fmt:formatDate value="${dianpus.createtime }" pattern="yyyy-MM-dd"/> </td>
					<td>
						<c:forEach items="${dianpus.shows }" var="shows">
							${shows.sname }
						</c:forEach>
					</td>
					<td><input type="button" value="详情"></td>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="6"> 
					  <a  href="${pageContext.request.contextPath }/queryDianpu?page=${dianpuList.startRow}&size=${dianpuList.pageSize}">首页</a> 
					 <a href="${pageContext.request.contextPath }/queryDianpu?page=${dianpuList.prePage}&size=${dianpuList.pageSize}">上一页</a> 
					 <a href="${pageContext.request.contextPath }/queryDianpu?page=${dianpuList.nextPage}&size=${dianpuList.pageSize}">下一页</a>
					 <a href="${pageContext.request.contextPath }/queryDianpu?page=${dianpuList.pages}&size=${dianpuList.pageSize}">尾页</a> 
				 	<div style="float: right">
				 		显示${dianpuList.pageNum}到${dianpuList.pages},共${dianpuList.pages}页
				 	</div>
				 </td>
				<a href="www.baidu.com" target="blank">百度</a>
			</tr>
		</table>
	</center>
</body>
</html>