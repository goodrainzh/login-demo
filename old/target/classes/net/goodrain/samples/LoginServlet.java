package net.goodrain.samples;

public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();
		session.setAttribute("username",username);
		session.setAttribute("password",password);
		response.sendRedirect( request.getContextPath() + "/index2.jsp");
	}
}
