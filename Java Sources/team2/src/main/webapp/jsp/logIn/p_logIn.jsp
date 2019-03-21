<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script src='/jquery/jquery-3.2.1.js'></script>



<c:if test='${!empty param.logInError}'>
	<script>
	$(function(){
		$(document).ready(function(){
			alert('${param.logInError}');
		})
	})
	</script>
</c:if>



<body>




<div>
	<div id='menuDiv'>	
		<jsp:include page="/jsp/menubar/menubar.jsp"></jsp:include>
	</div>	
	<div id='chat'>			
		<jsp:include page="/jsp/chat/chat.jsp"></jsp:include>
	</div>

		
		
			
	<div id='content'>
		<div style='width: 99.8%; height: 50vh;' align='center'>
		
			<form method="post" action="/action/User_logIn.action" >
				<div style='margin-left: 35%; margin-top: 30vh;'>	
					<div style="display: table; width: 40%; float: left; ">
						<div style="display: table-row; height: 3vh ">
							<div style="display: table-cell; ">
								ID:
							</div>
							<div style="display: table-cell;">
								<input type='text' id="userId" name="userId" style="width: 99.8%; height: 3vh;">
							</div>
						</div>
					<div style="display: table-row; height: 3vh ">
						<div style="display: table-cell;">
							暗証番号:
						</div>
						<div style="display: table-cell;">
							<input type="password" id="userPw" name="userPw" style="width: 99.8%; height: 3vh;">
						</div>
					</div>				
				</div>			
				
				<div style="float: left; margin-left: 2%; margin-top: 1vh;" align="center">
				<button type="submit" style="width: 100px;">ログイン</button>
				</div>
			</div>
			</form>
		
			<br><br><br>
			<div style="margin-left: 2%;" align="center">
				<button type="button" onclick="document.location.href='/jsp/user/info/l_fid.jsp'" >IDを探す</button>
				<button type="button" onclick="document.location.href='/jsp/user/info/l_fpw.jsp'" style='min-width: 150px;'>暗証番号を探す</button>
			</div>	
		</div>
	</div>	
			

	
	<div id='commercial' align="center">		
		<jsp:include page="/jsp/ad/ad.jsp"></jsp:include>
	</div>				
	<div id='footer' align="center">		
		<jsp:include page="/jsp/footer/footer.jsp"></jsp:include>
	</div>	
		
	
	
	




	
</div>

</body>
</html>