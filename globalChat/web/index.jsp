<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="mo.vo.Chat,java.util.ArrayList" %>
<% ArrayList<Chat> list = (ArrayList<Chat>)session.getAttribute("list"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% if(list == null || list.size() < 1){ %>
<h1>디비에서 데이터 불러오기 실패...</h1>
<form action="/connect" method="post">
닉네임을 입려해주세요! : &nbsb; <input type="text" name="userid">
</form>
<% }else{ %>
<table>
<% for(Chat c : list){ %>
<tr>
<td><%= c.getName() %></td>
<td><%= c.getContent() %></td>
<td><%= c.getTime() %></td>
</tr>
<% } %>
</table>
<% } %>
</body>
</html>