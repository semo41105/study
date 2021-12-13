<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:forward page="mylist.jsp"></jsp:forward>
	<!-- 수업은 항상 인덱스부터 시작 -->
	<!-- webcontent가 최상위 폴더라서 제일 먼저 시작된다 -->
	<!-- jsp:forward : page 속성에 적어둔 곳으로 이동하는 jsp액션 태그
	(링크로 이동한 게 아니라서 주소는 안 바뀐다. 서버가 mylist를 갖고 있다고 보여주는 것임) -->
</body>
</html>