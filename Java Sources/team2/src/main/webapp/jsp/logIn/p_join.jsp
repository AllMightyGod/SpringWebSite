﻿
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>

<script src="/jquery/jquery-3.2.1.js"></script>
<script src="http://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
<script src="/jquery/jquery_validate_additionalREX.js"></script>



<script>
	var idDuplicated = false;
	var emailDuplicated = false;
</script>


<c:if test="${!empty param.joinError}">

<script>
$(function(){
	$(window).ready(function(){
		alert('${param.joinError}');
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
			<div style='margin-top: 30vh;'>
		 	<form method="post" action="/action/User_join" id='joinForm'>	 
				<div style="display: table; width: 40%;">
					<div style="display: table-row; ">
						<div style="display: table-cell; ">
						ID : 
</div>
	 					<div style="display: table-cell;">	 				
						 	<input type="text" name="userId" id='userId' style="width: 60%; height: 2vh;" >
						 	<button type='button' id='idDuplicatedCheck'>重複検査 </button><br>
						 	<span id='idDuplicatedCheckResult'>重複検査 してください！</span>
						</div>
					</div>
					<div style="display: table-row;">
						<div style="display: table-cell;">
							暗証番号 : 
						</div>
						<div style="display: table-cell;">
						 	<input type='password' id="userPw" name="userPw" style="width: 99.8%; height: 2vh;">	 	
						</div>
					</div>	
					<div style="display: table-row;">
						<div style="display: table-cell;">
							暗証番号確認: 
						</div>
						<div style="display: table-cell;">
						 	<input type='password' id="confirmPw" name="confirmPw" style="width: 99.8%; height: 2vh;">	 	
						</div>
					</div>
					
					<div style="display: table-row;">
						<div style="display: table-cell;">
							お名前 : 
						</div>
						<div style="display: table-cell;">
							 <input type='text' name="userName" style="width: 99.8%; height: 2vh;">	 
						</div>
					</div>
					<div style="display: table-row;">
						<div style="display: table-cell;">
							メール : 
						</div>
						<div style="display: table-cell;">
						 	<input type="text" name="userEmail" id='userEmail' style="width: 60%; height: 2vh;">	
						 	<button type='button' id='emailDuplicatedCheck'>重複検査 </button> <br>
						 	<span id='emailDuplicatedCheckResult'>重複検査 してください！</span>
						</div>
					</div>
					<div style="display: table-row;">
						<div style="display: table-cell;">
							連絡先 : 
						</div>
						<div style="display: table-cell;">
						 	<input type="text" name="userPhone" style="width: 99.8%; height: 2vh;">		 
						</div> 
					</div>								
			</div>			
			
			<div align="center">
			 	<input type='button' id='joinBtn' value="加入" style='margin-top:2vh;height:3vh;'>		 
			</div>	
		 	</form>		 
		</div>
			</div>			
	</div>	
			
			
			
			
	<script>
	$(function() {
	    $('#joinForm').validate({
	        debug: false,
	        onfocusout: false,
	        rules: {
	        	userId: {
	                 required: true,
	                 rangelength: [4, 20],
	                 idRex: true 
	             }, userPw: {
	                 required: true,
	                 rangelength: [6, 20],
	                 pwRex:true
	             }, confirmPw: {
	                 required: true,
	                 rangelength: [6, 20],
	                 equalTo: '#userPw'
	             }, userName: {
	                 required: true,
	                 rangelength: [2, 20],
	                 nameRex: true
	             }, userEmail: {
	                 required: true,
	                 emailRex: true,
	                 rangelength: [6, 30],
	             }, userPhone: {
	            	 required: true,
	            	 rangelength: [6, 20],
	            	 phoneRex: true
	             }
	        }, messages: {
	        	userId: {
	                 required: "IDを入力してください。",
	                 rangelength: "IDは４文字から２０文字まで可能です。",
	                 idRex:'IDは大文字・小文字の英文、数字、ハングルが可能です。'
	             }, userPw: {
	                 required: "暗証番号を入力してください。",
	                 rangelength: "暗証番号は６文字から２０文字まで可能です。",
	                 pwRex: '暗証番号は大文字・小文字の英文、数字、ハングル、特殊文字!@#$%^&が可能です。'
	             }, confirmPw: {
	                 required: "暗証番号を確認してください。",
	                 rangelength: "暗証番号は６文字から２０文字まで可能です。",
	                 equalTo: '暗証番号一致しません。確認してください。'
	             }, userName: {
	                 required: "お名前を入力してください。",
	                 rangelength: "お名前は２文字から２０文字まで可能です。",
	                 nameRex:'暗証番号は大文字・小文字の英文、数字、ハングルが可能です。'
	             }, userEmail: {
	                 required: "メールを入力してください。",
	                 emailRex: "正しい形式ではございません。",
	                 maxlength: "メールは６文字から３０文字まで可能です。"
	             }, userPhone: {
	            	 required: "連絡先を入力してください。",
	            	 rangelength: "６文字から２０文字まで可能です。",
	            	 phoneRex: "数字のみ入力してください。"
	             } 	
	        	
	           
	        }, errorPlacement: function(error, element) {
	        	 error.insertAfter(element);	        	
	        }
	    });
	    
	    
	    //아이디, 이메일 중복 확인 했는지//
	    $('#joinBtn').click(function(){	    	
	    	if(idDuplicated==true & emailDuplicated==true){
	    		$('#joinForm').submit();
	    	}
	    	else if(idDuplicated==false){
	    		alert('ID重複検査してください！');
	    	}
	    	else if(emailDuplicated==false){
	    		alert('メール重複検査してください！');
	    	}
	    })
	    
	    
	    
	    //아이디, 이메일 변화 시 중복확인 초기화//
	    $('#userId').change(function() {
	    	idDuplicated=false;
	    	$('#idDuplicatedCheckResult').text('重複検査してください！');
	    })
	    
	    $('#userEmail').change(function(){
	    	emailDuplicated=false;
	    	$('#emailDuplicatedCheckResult').text('重複検査してください！');
	    })
	    
	    
	    
	    $('#idDuplicatedCheck').click(function(){
	    	var userId=$('#userId').val();
	    	if(userId.match(/^[A-Za-z0-9ㄱ-ㅎ|ㅏ-ㅣ|가-힣]{4,20}$/)){
	    		$.ajax({
		    		url:'/action/User_idDuplicatedCheck',
		    		type:'post',
		    		data: {userId:userId},
		    		dataType:'xml',
		    		success:function(data){
		    			var result = $(data).find('result').text().trim();
		    			result=Number(result);
		    			console.log($(data).find('result').text().trim());
		    			if(result==0){
		    				idDuplicated=true;
		    				$('#idDuplicatedCheckResult').text('使用可能');
		    				alert('使用可能なIDです。');
		    			}
		    			else if(result==1){
		    				alert('すでに使用中でございます。他のIDを入力してください。');
		    			}
		    			else{
		    				console.log('WTF!!!!');
		    			}
		    		},
		    		error:function(e){
		    			console.log(e.message);
		    		}
		    	})
	    	}
	    	else{
	    		alert('正しい形式ではございません。');
	    	}
	    	
	    })
	    
	    
	    
	    $('#emailDuplicatedCheck').click(function(){
	    	var userEmail=$('#userEmail').val();
	    	if(userEmail.match(/^[0-9a-zA-Z][_0-9a-zA-Z-]*@[_0-9a-zA-Z-]+(\.[_0-9a-zA-Z-]+)$/)){
	    		
	    		if(userEmail.length>=6&userEmail.length<=30){
	    			$.ajax({
			    		url:'/action/User_emailDuplicatedCheck',
			    		type:'post',
			    		data: {userEmail:userEmail},
			    		dataType:'xml',
			    		success:function(data){
			    			var result = $(data).find('result').text().trim();
			    			result=Number(result);
			    			console.log($(data).find('result').text().trim());
			    			if(result==0){
			    				emailDuplicated=true;
			    				$('#emailDuplicatedCheckResult').text('使用可能');
			    				alert('使用可能なメールです。');
			    			}
			    			else if(result==1){
			    				alert('すでに使用中でございます。他のメールを入力してください。');
			    			}
			    			else{
			    				console.log('WTF!!!!');
			    			}
			    		},
			    		error:function(e){
			    			console.log(e.message);
			    		}
			    	})
	    		}
	    		else{
	    			alert('メールは６文字から３０文字まで可能です。');
	    		}	    		
	    	}
	    	else{
	    		alert('正しい形式ではございません。');
	    	}
	    	
	    })
	    
	});
	
	
	</script>
	
	<div id='commercial' align="center">		
		<jsp:include page="/jsp/ad/ad.jsp"></jsp:include>
	</div>				
	<div id='footer' align="center">		
		<jsp:include page="/jsp/footer/footer.jsp"></jsp:include>
	</div>	
	
		
	
	
	
</div>

</body>
</html>