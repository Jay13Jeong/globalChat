<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="mo.vo.Chat,java.util.ArrayList" %>
<%  
long saveTime = System.currentTimeMillis();
long currTime = 0; 
while( currTime - saveTime < 3000){
%>
<% ArrayList<Chat> list = (ArrayList<Chat>)session.getAttribute("list");
	Boolean chk;
	if(list == null || list.size() < 1){
		chk = false;
	}else{
		chk = true;
	} %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table{
	border:1px solid black;
}
</style>
</head>
<body id="ct">

<h1>비트월드에 오신걸 환영합니다 !</h1>
<hr>

<% if(chk == false){ %>
<form action="/connect" method="post">
<h2>채팅에 사용할 닉네임을 입려해주세요! : &nbsp;<h2> <input type="text" name="userid">
</form >
<% } %>
<% if(chk == true){ %>
<script type="text/javascript">
var bd2 = document.querySelector("body");
var bd = document.getElementById("ct");
var t = document.createElement("table");
t.className = 1111;
var count = 1;

function chatting(){
	console.log("powered chatting function...");
	bd.appendChild(t);
	<% for(Chat c : list){ %>
	console.log("<%= c.toString() %>");
	var tr = document.createElement("tr");
	t.appendChild(tr);
	var td = document.createElement("td");
	td.innerText = '<%= c.getName() %>';
	tr.appendChild(td);
	var td2 = document.createElement("td");
	td2.innerText = '<%= c.getContent() %>';
	tr.appendChild(td2);
	var td3 = document.createElement("td");
	td3.innerText = '<%= c.getTime() %>';
	tr.appendChild(td3);
	<% } %>
}

function delTable(){
	var target = document.getElementById(1111);
	bd.classList.remove(1111);
}

function init(){
//	if(count == 1){
	//	delTable();	
	//	count++;
	//}else{
	//	chatting();
	//	count--;
	//}
}
chatting();
//setInterval(init,2000);

</script>
<% } %>
</body>
</html>
<% } %>