<%@ page 	language="java" 
					contentType="text/html; charset=utf-8"
    				pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
body,td {
	font-size: 9pt
}
</style>
	
	<script type="text/javascript">

	</script>

</head>

<body>
	

	<table align=center width=70% border=0 cellspacing=3 cellpadding=0>
		<tr>
			<td align=left><font color=brown>${loginUser.name }</font>님의 로그인 정보입니다.</td>
			<td align=right>조회수 ${bbs.viewcnt }</td>
		<tr>
			<td colspan=2>
				<table border=0 cellpadding=3 cellspacing=0 width=100%>
					<tr align=right>
					<tr align=center>
						<td bgcolor=#dddddd width=10%>작성자</td>
						<td align=center bgcolor=#ffffe8><a href="mailto:">${bbs.writer }</a>
						</td>
						
					<tr align=center>
						<td bgcolor=#dddddd>제 목</td>
						<td bgcolor=#ffffe8 colspan=3>${bbs.subject }</td>
					<tr>
						<td colspan=4><br>${bbs.content }<br></td>
					<tr>
						<td colspan=4 align=right>${bbs.regdate }
						</td>
					</tr>
				</table>
			</td>
		<tr>
			<td align=center colspan=2>
				<hr size=1> 
				<c:if test="${loginUser.name == bbs.writer }">
				[ <a href="list.encore">목 록</a> | 
				  <a href="update.encore?seq=${bbs.seq}">수 정</a> | 
				  <a href="">답 변</a> | 
				  <a href="delete.encore?seq=${bbs.seq}">삭 제</a> ]<br>
				</c:if>
				<c:if test="${loginUser.name != bbs.writer }">
				[ <a href="list.encore">목 록</a> ] 
				</c:if>
			</td>
		</tr>
	</table>
	<br/><br/>
	
		
</body>

</html>








