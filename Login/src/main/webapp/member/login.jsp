<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�α���</title>
</head>
<body>
<% String error = request.getParameter("error");
if(error != null){
%>
<div>���̵� �� ��й�ȣ�� Ʋ�Ƚ��ϴ�.</div>
<%} %>
	<form method= "post" >
		���̵�<input type = "text" name ="mid"/><br/>
		��й�ȣ<input type ="password" name = "mpw"><br/>
		�ڵ��α���<input type ="checkbox" name = "auto"><br/>
		<input type ="submit" value="�α���"/>
	
	</form>
</body>
</html>