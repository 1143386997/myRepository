<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/index_work.css" type="text/css">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">
	$(function(){
		$.ajax({
			url:"${pageContext.request.contextPath}/show",
			dataType:"json",
			data:"post",
			success:function(data){
				for(var i in data){
					$("#sellshow").append("<input value="+data[i].sid+" type='checkbox' name='sids'>"+data[i].sname+"")
				}
			}
		})
	})
</script>
</head>
<body>
	<center>
		新增店铺<br/>
		<form action="add" method="post">
			<table>
				<tr>
					<td>编号</td>
					<td>
						<input type="text" name="did">
					</td>
				</tr>
				<tr>
					<td>店铺名称</td>
					<td>
						<input type="text" name="dname">
					</td>
				</tr>
				<tr>
					<td>创建时间</td>
					<td>
						<input type="date" name="createtime">
					</td>
				</tr>
				<tr>
					<td>销售商品</td>
					<td id="sellshow">
						
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="保存">
						<input type="button" value="关闭">
					</td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>