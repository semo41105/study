<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>

<%@ page import="com.my.dao.MyBoardDao" %>
<%@ page import="com.my.dto.MyBoardDto" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	MyBoardDao dao = new MyBoardDao();
	List<MyBoardDto> list = dao.selectAll();
%>

<body onload="console.log('mylist 페이지 실행');">
	<h1>LIST PAGE</h1>
	
	<table border="1" >
		<col width="50px">
		<col width="100px">
		<col width="200px">
		<col width="100px">
		<tr>
			<th>NO</th>
			<th>NAME</th>
			<th>TITLE</th>
			<th>DATE</th>
			<th>update</th>
			<th>delete</th>
		</tr>
<%
	for(int i=0; i<list.size(); i++){
%>		
		<tr>
			<td><%=list.get(i).getMyno() %></td>
			<!-- '='는 표현식. html화면에 표현하겠다는 의미 -->
			<td><%=list.get(i).getMyname() %></td>
			<td><a href="selectone.jsp?myno=<%=list.get(i).getMyno()%>"><%=list.get(i).getMytitle() %></a></td>
			<td><%=list.get(i).getMydate() %></td>
			<td><a href="myupdate.jsp?myno=<%=list.get(i).getMyno()%>">수정</a></td>
			<td><a href="mydelete.jsp?myno=<%=list.get(i).getMyno()%>">삭제</a></td>
		</tr>
<%
	}
%>	
	<tr>
		<td colspan="6" align="right">
			<button onclick="location.href='myinsert.jsp'">글쓰기</button>
		</td>
	
	</tr>
	
	
	
	</table>























</body>
</html>