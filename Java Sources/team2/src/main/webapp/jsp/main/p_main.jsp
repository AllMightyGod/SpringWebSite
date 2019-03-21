<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<script src='/jquery/jquery-3.2.1.js'></script>

<body>

<div>
	<div id='menuDiv'>	
		<jsp:include page="/jsp/menubar/menubar.jsp"></jsp:include>
	</div>	
	<div id='chat'>			
		<jsp:include page="/jsp/chat/chat.jsp"></jsp:include>
	</div>
		
	
	
	
	
	
	
	
	<div id='content'>			
		<div>
			<h1>お知らせ！</h1>
						
			<div style='margin-left: 100px;'>
			<ul>
				<ins>販売掲示板</ins>				
				<li>販売掲示板の検索、ペイジング機能はまだ準備中です！申し訳ございません!
					<img src='/resources/img/banner/banner_main_sorry1.jpg' style="width: 600px;height: 300px; display:block;">
				</li>
				<li>販売掲示板にご登録してから１時間後、販売品の入札が終わります。
					入札が終わると販売の方、購買の方にお知らせのメールをお届けしますが、１０分ほどの差がある可能背があります。
					<img src='/resources/img/banner/banner_onehour.png' style="width: 400px;height: 400px; display: block;">
				</li>
			</ul>
			
			
			<ul>
				<ins>購買掲示板・Q/A掲示板</ins>				
				<li>デザインがまだです!申し訳ございません（2）!
					<img src='/resources/img/banner/banner_main_sorry2.jpg' style="width: 600px;height: 300px; display:block;">
				</li>
			</ul>	
				
			</div>
			<!-- <h1>수정 및 확인 사항</h1>
			<ul>
				<ins>구매 게시판</ins>				
				<li>구매 게시판 쪽 DB 정보 변경 시 USER_ID 확인 조건 추가</li>
				<li>왜 새로 만든 VO에 static 변수가 들어가는지?</li>			
			</ul>
			
			<ul><ins>판매 게시판</ins>			
				<li>판매 게시판 view 단 spost 폴더 밑으로 넣었으니 주의할 것</li>
				<li>판매 게시판 쪽 입찰하기, 입찰 취소,답글 달기는 로그인한 유저에 한해서 할 것</li>
				<li>판매 게시판 쪽 특수문자 처리하기</li>
				<li>판매 게시판 만료되면 SELL_POST 디테일을 찾는 게 아니라 입찰자 명단 보여줄 것</li>
				<li>판매 게시판 입찰 등록, 입찰 취소는 만료 기한이 지나면 하지 못하도록 막아놓을 것</li>
				<li>판매 게시판 쪽 에러 발생 시 롤백하기</li>
				<li>입찰 만료 시간은 등록시간+1시간, 판매 게시물 삭제 시간은 만료시간+1 시간으로 변경</li>				
			</ul> -->
		</div>
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