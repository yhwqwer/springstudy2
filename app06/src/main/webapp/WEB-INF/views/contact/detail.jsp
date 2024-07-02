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

  <form>
    <div>
      <label for="contactNo">연락처번호</label>
      <input type="text" name="contactNo" value="${contact.contactNo}" id="contactNo">
    </div>
    <div>
      <label for="name">이름</label>
      <input type="text" name="name" value="${contact.name}" id="name">
    </div>
    <div>
      <label for="email">이메일</label>
      <input type="text" name="email" value="${contact.email}" id="email">
    </div>
    <div>
      <label for="mobile">모바일</label>
      <input type="text" name="mobile" value="${contact.mobile}" id="mobile">
    </div>
  </form>

</body>
</html>