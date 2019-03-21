<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script src='/jquery/jquery-3.2.1.js'></script>

<!-- 상품상세이름 스크립트 혁연이 컴퓨터를 서버로 목록을 가져옴-->
<script>


$(function(){
	$(document).ready(function(){
		$('#itemName').empty();
		if($('#itemCategory').val()=="카테고리 선택"){			
			
		}
		
		else{
			$.ajax({
				url:'/action/returnItemName?itemCategory='+$("#itemCategory").val(),
				
				dataType:'xml',
				success: function(data){
					var itemNames = $($(data).find('result')).find('item');
					var itemName=null;
					for(i=0;i<itemNames.length;i++){
						itemName=itemNames[i];
						$('#itemName').append("<option>"+($(itemName).text()).trim()+"</option>");
					}
					
					
					
				},
				error: function(e){
					console.log("ERROR! "+e.message)
				}
			})
		}
	})
	
	
	
	$('#itemCategory').change(function(){
		$('#itemName').empty();
		if($('#itemCategory').val()=="카테고리 선택"){			
			
		}
		
		else{
			$.ajax({
				/* ip주소 확인 */
				url:'/action/returnItemName?itemCategory='+$("#itemCategory").val(),
				
				dataType:'xml',
				success: function(data){
					var itemNames = $($(data).find('result')).find('item');
					var itemName=null;
					for(i=0;i<itemNames.length;i++){
						itemName=itemNames[i];
						$('#itemName').append("<option>"+($(itemName).text()).trim()+"</option>");
					}
					
					
					
				},
				error: function(e){
					console.log("ERROR! "+e.message)
				}
			})
		}
	})	
	
	
	$('#itemName').change(function(){
		if($('#itemName').val()!=null){
		}
	})
	
})



</script>


<body>

<div>
	<div id='menuDiv'>	
		<jsp:include page="/jsp/menubar/menubar.jsp"></jsp:include>
	</div>	
	<div id='chat'>			
		<jsp:include page="/jsp/chat/chat.jsp"></jsp:include>
	</div>
		
		
		
		
		
		
		
		
		
		
	
	
	<div id='content'>
		<form method = 'post' enctype="multipart/form-data">
			<div style='height:40vh; width: 90%; margin-top: 5vh; margin-left: 5%;'>
			<!-- 제목 div 시작 -->
				<div style='height:5vh; width: 90.2%; border: 1px solid black;'>
					<input name = 'postTitle' type='text' style='width: 99.5%; height: 4vh;' placeholder="제목을 입력하세요">		
				</div>
			<!-- 제목 div end-->
				
<!-- photo div start-->
	<div style='height:40vh; width: 60%; border: 1px solid black; float: left'>				
	
	<input type="file" class="postPhotoFile" id="postPhotoFile" name='fileName'>
	<input type='hidden' name='postPhoto' id='postPhoto'>
    
	<script>
    	$('#postPhotoFile').change(function(){
    		$('#postPhoto').val($('#postPhotoFile').val());    		
    	})
    </script>
				
				
	</div>
<!-- photo div end-->
				
				<!-- informatoin div start-->
					<div style='height:40vh; width: 30%; border: 1px solid black; float: left'>
					<!-- 카테고리 -->
						<select name='itemCategory' id='itemCategory' style='width:99%; height: 5vh;'>
							<option selected="selected">카테고리 선택</option>
							<option>SAMSUNG</option>
							<option>APPLE</option>
							<option>LG</option>
						</select>
					<!-- 상품상세이름 -->
						<select name='itemName' id='itemName' style='width:99%; height: 5vh;'>
						</select>
						
					
						<input name='itemCurPrice' type="text" placeholder='현재가' style='width:99%; height: 5vh;'><br>
						
					<!-- 상품상태 -->
						<select name='itemClass'style='width:99%; height: 5vh;'>
							<option value="A">A</option>
							<option value="B">B</option>
							<option value="C">C</option>
						</select>
						
						<input name='itemIncrease' id ='itemIncrease' type='hidden' value="1000" style='width:99%; height: 5vh;'><br>
						<input name='userId' id = 'userId' type="hidden"  value="<%=session.getAttribute("userId") %>" style='width:99%; height: 5vh;'><br>
					
					</div>			
				<!-- informatoin div ends-->
			</div>
			
			<!-- post Content div start-->
			<div style='width: 81.5%; margin-top: 5vh; margin-left: 5%;'>		
				<p>게시물 내용</p>
				<textarea name= 'postContent' placeholder='상세설명을 적어주세요' style="width: 99.3%; height: 20vh; resize: none;"></textarea>
				<div style='width: 99.5%' align="center">
					<button type="submit" formaction="/action/S_post_createPost">등록</button>
					<button type="button" onclick="document.location.href='/action/S_post_showList'">목록으로 돌아가기</button>
				</div>
			</div>
			
			
			
			
			
			<!-- post Content div end-->
		
		</form>
	</div>
	<!-- content div ends-->
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	<div id='commercial' align="center">		
		<jsp:include page="/jsp/ad/ad.jsp"></jsp:include>
	</div>				
	<div id='footer' align="center">		
		<jsp:include page="/jsp/footer/footer.jsp"></jsp:include>
	</div>
	
</div>
</body>
</html>