package net.goodrain.samples;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)  
	throws ServletException, IOException {  
	// doPost(request, response);  
	}  
	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	throws ServletException, IOException {  
		request.setCharacterEncoding("UTF-8");  
		String username=request.getParameter("username");  
		session.setAttribute("uname", username);  
		response.sendRedirect( request.getContextPath() + "/index2.jsp");
	} 
}
