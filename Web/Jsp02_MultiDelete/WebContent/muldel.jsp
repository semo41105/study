<%@page import="com.multi.dao.MDBoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	String[] seq = request.getParameterValues("chk");
	//여러 개의 파라미터값을 꺼내오는데 밸류 값도 여러개니까 한번에 꺼내오는 방식
	
	MDBoardDao dao = new MDBoardDao();
	int res = dao.multiDelete(seq);
	
	if(res == seq.length){
%>
	<script type="text/javascript">
		alert("체크된 글들을 삭제 성공하였습니다.");
		location.href="boardlist.jsp";
	</script>
<%
	}else{
%>
	<script type="text/javascript">
		alert("체크된 글들을 삭제 실패하였습니다.");
		location.href="boardlist.jsp";
	</script>
<%
	}
%>










</body>
</html>