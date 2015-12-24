<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<jsp:include page="/WEB-INF/jsp/admin/include/head.jsp"/>
	<title>로그인 페이지</title>
</head>
<body>
	<form action="/login.do" method="post">
		<table border="0">
			<thead></thead>
			<tbody>
				<tr>
					<td>ID</td>
					<td>
						<input type="text" name="id" id="id"/>
					</td>
				</tr>
				<tr>
					<td>PASSWORD</td>
					<td>
						<input type="password" name="password" id="password"/>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<input type="submit" value="로그인"/>
					</td>
				</tr>
			</tbody>
			<tfoot></tfoot>
		</table>
	</form>
<script type="text/javascript">
	$(window).load(function() {
		alert($('#id').val()); // test
	});
</script>
</body>
</html>