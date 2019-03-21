<%@page import="com.in.team2.vo.MsgVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>

<script src='/jquery/jquery-3.2.1.js'></script>

<script>

	var pageNum=1;
	
	


	
	
	$(function(){
		
		$(document).ready(function(){
			
			alert('${errorMsg}');
		})
		
		
		
		$('#createBtn').click(function(){
			
			if($('#receiverId').val()==''){
				alert('受信の方のIDを入力してください。');
			}
			
			else if($('#msgTitle').val()==''){
				alert('タイトルを入力してください。');
			}
			
			else if($('#msgTitle').val().length>30){
				alert('タイトルは３０文字まで可能です。');
			}
			
			else if($('#msgContent').val()==''){
				alert('内容を入力してください。');
			}
			
			else if($('#msgContent').val().length>1000){
				alert('内容は１０００文字まで入力可能です。');
			}
			
			else{
				$('#createMsg').submit();
			}
			
		})
	})
	
	
</script>
<script type="text/javascript">
 window.history.forward();
 function noBack(){window.history.forward();}
</script>

<body onload="noBack();" onpageshow="if(event.persisted) noBack();" onunload="">

<div>
	<div id='menuDiv'>	
		<jsp:include page="/jsp/menubar/menubar.jsp"></jsp:include>
	</div>	
	<div id='chat'>			
		<jsp:include page="/jsp/chat/chat.jsp"></jsp:include>
	</div>
	
	
	
	
	
	
	
	<div id='content'>
		
		
		
		
		
		<div>
			<button id='showRMsgList'>受信箱</button>
			<button id='showSMsgList'>送信箱</button>
		</div><br>
		
		<script>
		$('#showRMsgList').click(function(){
			if(confirm('受信箱へ移動しますか。入力内容が消えます！')){
				document.location.href='/action/Msg_showRMsgList';
			}
		})
		
		
		$('#showSMsgList').click(function(){
			if(confirm('送信箱へ移動しますか。入力内容が消えます！')){
				document.location.href='/action/Msg_showSMsgList';
			}
		})
		</script>
			
			
			
			
			
			
		
		<div>
			<form id='createMsg' action='/action/Msg_createMsg' method='post'>
			受信人:<input type='text' id= 'receiverId' name='receiverId' value='${msg.receiverId }' maxlength="20">	<br>
			タイトル:<input type='text' id='msgTitle' name='msgTitle' maxlength="30" value='${msg.msgTitle}'><br>
			内容:<br>
			
			<textarea name='msgContent' id='msgContent' maxlength="1000" style='width: 98%;height: 60vh; resize: none;' onkeyup="countLetters(this)" onload="countLetters(this)">${msg.msgContent}</textarea>
			<div style='display: table; width: 100%'>
				<div style='display: table-row; width: 100%;'>
					<div style='display: table-cell; width: 50%;'>
						<a id='numOfLetters'></a>
					</div>
					<div style='display: table-cell; width: 50%;' align="right">
						<button type='button' id='createBtn'> 送信</button>
					</div>
				</div>				
			</div>
			</form>
		</div>		
	</div>
		<!-- content div ends-->
		
	
	<script>
	function countLetters(textArea){
		var length=textArea.value.length;
		var numOfLetters = document.getElementById('numOfLetters');
		numOfLetters.innerHTML=String(length)+"文字";
	}
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