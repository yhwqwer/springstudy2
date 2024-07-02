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

 <div>
   <a href="${contextPath}/write.do">작성하러GOGO</a>
 </div>

 <c:if test="${empty contactList}"> 
  <div>등록된 연락처가 없습니다.</div>
 </c:if>
 
 <c:if test="${not empty contactList}">
  <c:forEach items="${contactList}" var="contact">
    <div>이름 : <a href="${contextPath}/detail.do?contactNo=${contact.contactNo}">${contact.name}</a></div> 
    <div>이메일 : ${contact.email}</div>
    <div>모바일 : ${contact.mobile}</div>
    <hr>
  </c:forEach>
 </c:if> 
 
</body>
</html>