package com.register;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		
		LoginDao dao= new LoginDao();
		
		if(dao.verifyEmail(email) && dao.adduser(user,pass,email)) {
			HttpSession session=request.getSession();
			session.setAttribute("username",user);
			response.sendRedirect("welcome.jsp");
		}
		else {
			response.sendRedirect("register.jsp");
		}
	}

}
