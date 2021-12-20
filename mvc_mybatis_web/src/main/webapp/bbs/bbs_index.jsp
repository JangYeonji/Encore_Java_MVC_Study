<%@ page 	language="java" 
					contentType="text/html; charset=EUC-KR"
    				pageEncoding="EUC-KR"%>


<!DOCTYPE html > 
<html>
<head>
<meta charset="EUC-KR">
<title>게시판</title>
	
	<script type="text/javascript">
	</script>
	
</head>
<body>
	<table align=center border=0 width=100%>
	<tr>
		<td align=left >
			page
		</td>
		<td align="right" >
			<form id="searchFmt" method="post" action="">
				<select id="condition" name="condition">
					<option value="subject">제목</option>
					<option value="content">내용</option>
				</select>
				<input type="text" name="keyword" id="keyword" size="30">
				<input type="submit" value="검색" id="searchBtn">
			</form>
		</td>
	</tr>
	</table>
	<%-- ////////////////// --%>
	<table align=center width="100%" border=0 cellspacing=0 cellpadding=3>

	<tr align=center bgcolor=#D0D0D0 height=120%>
	<td width="15%"> 번 호 </td><td width="15%"> 이 름 </td><td width="35%"> 제 목</td><td width="20%"> 날 짜 </td><td width="15%">조회수</td>
	</tr>
	
		<tr> 
			<td align=center>ooo</td>
			<td align=center>ooo</td>
			<td><a href="">ooo</a></td>
			<td align=center>ooo</td>
			<td align=center>ooo</td>
		</tr>
	
	
	<tr>
		<td align="right" colspan="5"> 
			<a href="" >[글쓰기]</a> <a href="">[처음으로]</a> 
		</td>
	</tr>
	
	<%-- /////////////////////////////////////////// --%>
		

</table>


</body>
</html>




