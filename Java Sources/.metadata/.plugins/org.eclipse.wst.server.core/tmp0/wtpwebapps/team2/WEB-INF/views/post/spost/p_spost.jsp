<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.in.team2.vo.PostVO"%>
<%@page import="com.in.team2.vo.UserVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<script src='/jquery/jquery-3.2.1.js'></script>
<style>
.postBoard {border-collapse: collapse;}
.postBoard tr{cursor:pointer;}
.postBoard tr:HOVER {background-color: gray;}
.tableHead td{border: 1px solid black;width: 10%;}
</style>
<body>




<div>
	<div id='menuDiv'>	
		<jsp:include page="/jsp/menubar/menubar.jsp"></jsp:include>
	</div>	
	<div id='chat'>			
		<jsp:include page="/jsp/chat/chat.jsp"></jsp:include>
	</div>
		
	
	
	
	
	
	
	
	<div id='content'>
		<div style='border-bottom-color: silver; border-bottom-style: solid; border-bottom-width: 1px; margin-top: 2vh; margin-left: 2%;'>
								
			<select style="height: 3vh;">
				<option value="category">상품 카테고리</option>
				<option value="item_name">상품명</option>
				<option value="title">게시물 제목</option>
				<option value="content">게시물 내용</option>
				<option value="userId">작성자</option>
				<option value="titleAndContent">제목+내용</option>
			</select>
				
			<input type="text" style="height: 3vh; width: 30%;" placeholder="検索キーワードを入力">
			<button id = 'searchBtn' type="button" >検索</button>
		<%if(session.getAttribute("userId")!=null){%>	
			<button type="button" onclick="document.location.href='/jsp/post/s_post/l_spost_create.jsp'">販売登録</button>
			<button type="button" style=' width:10%; min-width:150px; ' onclick="document.location.href='/action/S_post_showMySellList'">マイポスト</button>
		 <%} %>
			
		</div>
			
		<div>
			<h1>This is selling items page</h1>
			
			
		
			<form class="postList">
			<input name='postNum' type="hidden" id='postNum'>	
				<table class='postBoard' style="width: 80%; margin-left: 10%">
					<thead>
						<tr class='tableHead'>
							<td align="center" style='width: 8% '>登録番号</td>
							<td align="center" style='width: 20% '>写真</td>
							<td align="center" style='width: 10% '>製造社</td>
							<td align="center" style='width: 10% '>商品名</td>
							<td align="center" style='width: 5% '>等級</td>
							<td align="center" style='width: 27% '>タイトル</td>
							<td align="center" style='width: 10% '>作成者</td>
							<td align="center" style='width: 10% '>登録日</td>				
						</tr>
					</thead>
				
					<tbody>
	
	
	<%
		List<PostVO> postList = (List)request.getAttribute("postList");
		
			if(postList.size()>0){
				for(int i=0;i<postList.size();i++){
					PostVO post = postList.get(i);
	%>
		<tr onclick="getPost(this)" id ='<%=post.getPostNum() %>'>
			<td align="center" id='postNum'><%=post.getPostNum() %></td>
			
			<td align="center" id='postPhoto'> <img src="<%="/"+post.getPostPhoto() %>" style='width: 100%;height: 10vh'> </td>
			<td align="center" id='itemCategory'><%=post.getItemCategory()%></td>
			<td align="center" id='itemName'><%=post.getItemName()%></td>
			<td align="center" id='itemClass'><%=post.getItemClass()%></td>
			<td align="center" id='postTitle'><%=post.getPostTitle() %></td>
			<td align="center" id='userId'><%=post.getUserId()%></td>
			<td align="center" id='regDate'><%=post.getRegDate()%></td>	
		</tr>	
			
				<%} %>
			<%} %>		
					</tbody>
				
				</table>
		</form>	
	
<script >
		
			var postNum = -1;
				function getPost(data){
					postNum=data.id;
					document.location.href='/action/S_post_showDetail?postNum='+postNum;
				}
</script>
		
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