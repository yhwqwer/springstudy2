<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<%@ taglib uri="jakarta.tags.fmt" prefix="fmt"%>
<c:set var="contextPath" value="<%=request.getContextPath()%>"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
</head>
<body>

<form action="${contextPath}/add.do" method="post">
  <div><input type="text" name="name" placeholder="이름 입력"></div>
  <div><input type="text" name="email" placeholder="이메일 입력"></div>
  <div><input type="text" name="mobile" placeholder="모바일 입력"></div>
  <div><button type="submit">작성완료</button></div>
</form>

</body>
</html>