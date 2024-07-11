<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="jakarta.tags.fmt" prefix="fmt" %>
<c:set var="contextPath" value="<%=request.getContextPath()%>" />

<jsp:include page="../layout/header.jsp">
  <jsp:param value="Signin" name="title"/>
</jsp:include>

<h1 class="title">Sign In</h1>

<form id="signin-form"
      method="post"
      action="${contextPath}/user/signin.do">

  <input type="hidden" name="url" value="${param.url}">

  <div>
    <label for="email">아이디</label>
    <input type="text" name="email" id="email" placeholder="example@example.com">
  </div>
  
  <div>
    <label for="pw">비밀번호</label>
    <input type="password" name="pw" id="pw">
    <div id=""></div>
  </div>
  
  <%-- 아이디 저장 / SNS 로그인 / 아이디비번 찾기 / 로그인하고 돌아갈 페이지 주소창에 구현 --%>
  
  <div>
    <button type="submit">로그인하기</button>
    <button type="button" onclick="history.back()">취소하기</button>
  </div>
      
</form>

<script>

  var emailCheck = false;
  
  const fnEmailCheck = ()=>{
	  
	  const email = document.getElementById('email');
		  
	  $.ajax({
		  type: 'get',
		  url: '${contextPath}/user/sendCode.do',
		  data: 'email=' + email.value,
		  dataType: 'json'
	  }).done(resData => {
		  console.log(resData);
	  }).fail(jqXHR => {
		  console.log(jqXHR);
	  })
	   
	  
  }

  document.getElementById('get-code-btn').addEventListener('click', evt=>{
	  fnEmailCheck();
  })





  /* 이메일인증 / 비밀번호 / 휴대전화 모두 통과해야 서브밋 가능하게 구현 */
  
  
  if('${signupMessage}' !== ''){
    alert('${signupMessage}');
  }

</script>

<%@ include file="../layout/footer.jsp" %>
