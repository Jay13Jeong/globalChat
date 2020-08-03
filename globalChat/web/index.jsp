<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="mo.vo.Chat,java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% ArrayList<Chat> list = (ArrayList<Chat>)(request.getAttribute("list")); %>
<table>
<% for(Chat c : list){ %>
<tr>
<td><%= c.getName() %></td>
<td><%= c.getContent() %></td>
<td><%= c.getTime() %></td>
</tr>
<% } %>
</table>

</body>
</html>