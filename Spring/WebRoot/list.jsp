<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>会员列表</title>
	</head>
	<body>
		<center>
			<a href="UserServlet?cmd=find&id=">添加</a>
			<table border="1" width="100%">
				<thead>
					<tr>
						<th>
							主键
						</th>
						<th>
							会员编号
						</th>
						<th>
							会员姓名
						</th>
						<th>
							会员性别
						</th>
						<th>
							会员年龄
						</th>
						<th>
							会员地址
						</th>
						<th>
							会员身份证
						</th>
						<th>
							完美证号
						</th>
						<th>
							加入日期
						</th>
						<th>
							操作
						</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="user" items="${members}">
						<tr>
							<td>
								${user.id }
							</td>
							<td>
								${user.userNo }
							</td>
							<td>
								${user.userName }
							</td>
							<td>
								${user.sex }
							</td>
							<td>
								${user.age }
							</td>
							<td>
								${user.address }
							</td>
							<td>
								${user.userCard }
							</td>
							<td>
								${user.userID }
							</td>
							<td>
								${user.joinDate }
							</td>
							<td>
								<a href="UserServlet?cmd=find&id=${user.id }">修改</a>
								<a href="UserServlet?cmd=del&id=${user.id }">删除</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</center>
	</body>
</html>