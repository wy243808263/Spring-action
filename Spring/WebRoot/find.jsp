<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>修改会员信息</title>
	</head>
	<body>
		<center>
			<form action="UserServlet" method="post">
				<table>
					<tr>
						<td>
							会员编号
						</td>
						<td>
							<input type="text" name="userNo" id="userNo" value="${member.userNo}" />
							<input type="hidden" name="id" id="id" value="${member.id}" />
							<input type="hidden" name="cmd" value="update" />
						</td>
					</tr>
					<tr>
						<td>
							会员姓名
						</td>
						<td>
							<input type="text" name="userName" id="userName" value="${member.userName}" />
						</td>
					</tr>
					<tr>
						<td>
							会员性别
						</td>
						<td>
							<c:if test="${empty member}">
								<input type="radio" name="sex" value="男"/>男
								<input type="radio" name="sex" value="女"/>女
							</c:if>
							<c:if test="${not empty member}">
								<c:if test="${member.sex == '男'}">
									<input type="radio" name="sex" value="男" checked="checked"/>男
									<input type="radio" name="sex" value="女"/>女
								</c:if>
								<c:if test="${member.sex eq '女'}">
									<input type="radio" name="sex" value="男" />男
									<input type="radio" name="sex" value="女" checked="checked"/>女
								</c:if>
							</c:if>
						</td>
					</tr>
					<tr>
						<td>
							会员年龄
						</td>
						<td>
							<input type="text" name="age" id="age" value="${member.age}" />
						</td>
					</tr>
					<tr>
						<td>
							会员地址
						</td>
						<td>
							<input type="text" name="address" id="address" value="${member.address}" />
						</td>
					</tr>
					<tr>
						<td>
							会员身份证
						</td>
						<td>
							<input type="text" name="userCard" id="userCard" value="${member.userCard}" />
						</td>
					</tr>
					<tr>
						<td>
							完美证号
						</td>
						<td>
							<input type="text" name="userID" id="userID" value="${member.userID}" />
						</td>
					</tr>
					<tr>
						<td>
							加入日期
						</td>
						<td>
							<input type="text" name="joinDate" id="joinDate" value="${member.joinDate}" />
						</td>
					</tr>
					<tr>
						<td>
							电话号码
						</td>
						<td>
							<input type="text" name="telePhone" id="telePhone" value="${member.telePhone}" />
						</td>
					</tr>
					<tr>
						<td>
							<input type="submit" value="提交" />
						</td>
					</tr>
				</table>
			</form>
		</center>
	</body>
</html>