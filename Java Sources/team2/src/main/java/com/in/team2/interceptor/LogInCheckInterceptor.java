package com.in.team2.interceptor;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.method.HandlerMethod;
import com.in.team2.controller.annotation.LogInCheck;

public class LogInCheckInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	throws Exception {	
		
		request.getSession().setMaxInactiveInterval(30*60);
		/*System.out.println("Session 유효시간: "+request.getSession().getMaxInactiveInterval());*/
		
		if(handler.getClass()==org.springframework.web.socket.sockjs.support.SockJsHttpRequestHandler.class){
			return true;
		}
		
		//@NoCheckLogin 어노테이션이 컨트롤러에 사용되었는지 체크함
		LogInCheck usingAuth = ((HandlerMethod) handler).getMethodAnnotation(LogInCheck.class);
			
	        
	    if(usingAuth != null) {
	    //TODO 로그인 체크
	    	if(request.getSession()==null ||request.getSession().getAttribute("userId")==null||request.getSession().getAttribute("userId").equals("")){ 
	    		response.sendRedirect("/jsp/logIn/p_logIn.jsp?logInError="+URLEncoder.encode("ログイン後、ご利用できます。","UTF-8"));	
	    		return false; 
	        }
	    }
	       
	    else {}
		return true;	 
	}
}
