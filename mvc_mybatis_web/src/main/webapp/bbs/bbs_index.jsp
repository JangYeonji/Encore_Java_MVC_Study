<%@ page 	language="java" 
					contentType="text/html; charset=EUC-KR"
    				pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html > 
<html>
<head>
<meta charset="EUC-KR">
<title>�Խ���</title>
	
	<script type="text/javascript">
	</script>
	
</head>
<body>
	<table align=center border=0 width=100%>
	<tr>
		<td align=left >
			
		</td>
		<td align="right" >
			<form id="searchFmt">
				<select id="condition" name="condition">
					<option value="subject">����</option>
					<option value="content">����</option>
				</select>
				<input type="text" name="keyword" id="keyword" size="30">
				<input type="button" value="�˻�" id="searchBtn">   <!-- submit�� post, button�� script -->
			</form>
		</td>
	</tr>
	</table>
	<%-- ////////////////// --%>
	<table align=center width="100%" border=0 cellspacing=0 cellpadding=3>

	<tr align=center bgcolor=#D0D0D0 height=120%>
	<td width="15%"> �� ȣ </td><td width="15%"> �� �� </td><td width="35%"> �� ��</td><td width="20%"> �� ¥ </td><td width="15%">��ȸ��</td>
	</tr>
	<tbody id="tbody">
	<c:forEach var="bbs" items="${ boards }" >
		<tr> 
			<td align=center>${bbs.seq}</td>
			<td align=center>${ bbs.writer }</td>
			<td align=center><a href="read.encore?seq=${bbs.seq}">${ bbs.subject }</a></td>
			<td align=center>${bbs.regdate }</td>
			<td align=center>${bbs.viewcnt }</td>
		</tr>
	</c:forEach>
	</tbody>
	<tr>
		<td align="right" colspan="5"> 
			<a href="postForm.encore" >[�۾���]</a> 
			<a href="../index.encore">[ó������]</a> 
		</td>
	</tr>
	
	<%-- /////////////////////////////////////////// --%>
		

</table>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script type="text/javascript">
	$(document).ready(function(){
		$("#searchBtn").click(function(){
			condition = $("#condition").val()
			keyword = $("#keyword").val()
			$.ajax({
				url : "../search.ajax",
				type : "post",
				data : {condition:$("#condition").val(), keyword:$("#keyword").val()},
				dataType : "json",
				success : function(data){
					//alert(data);
					$("#tbody").empty();
					trs = ""
					$.each(data, function(idx, obj){
						trs += "<tr>"
						trs += "<td align=center>"+obj.seq+"</td>"
						trs += "<td align=center>"+obj.writer+"</td>"
						trs += "<td align=center><a href='read.encore?seq="+obj.seq+"'>"+obj.subject+"</a></td>"
						trs += "<td align=center>"+obj.regdate+"</td>"
						trs += "<td align=center>"+obj.viewcnt+"</td>"
						trs += "</tr>"
					})
					//alert(trs);
					$("#tbody").html(trs);
				}
			})
		});
	})
	</script>

</body>
</html>




