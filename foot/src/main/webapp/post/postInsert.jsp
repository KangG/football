<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>




<form action="../PostInsert.do" method="post">
<table border="1" cellpadding="0" cellspacing="0" >
	

	<tr>
		<td bgcolor="orange" >���ð�</td>			<!-- ����� ������ ���������ϰ� �������־� name���� ����  -->
		<td align="left"><input  name="DATETIME" type="date"></textarea></td>
	</tr>
	<tr>
		<td bgcolor="orange" >����ο�</td>
		<td align="left"><input name="PER" type="text"/></td>
	</tr>
	<tr>
		<td bgcolor="orange" >����</td>
		<td align="left"><input name="CONTENT" type="text" cols="40" rows="10"/></td>
	</tr>
	</tr>
	<tr>
		<td bgcolor="orange" >ZIP_CODE</td>
		<td align="left"><input name="ZIP_CODE" type="text"/></td>
	</tr>
	<tr>
		<td bgcolor="orange" >ADDRESS</td>
		<td align="left"><input name="ADDRESS" type="text"/></td>
	</tr>
	<tr>
		<td bgcolor="orange" >ADDRESS_DETAIL</td>
		<td align="left"><input name="ADDRESS_DETAIL" type="text"/></td>
	</tr>

	<tr>
		<td colspan="2" align="center"><input type="submit" value="�� ���" /></td>
		
	</tr>

</table>

</form>







</body>
</html>