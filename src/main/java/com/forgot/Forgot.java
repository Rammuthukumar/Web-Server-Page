package com.forgot;

import java.awt.Window;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;


@WebServlet("/Forgot")
public class Forgot extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String user=request.getParameter("user");
		String reset=request.getParameter("reset");
		String confirm=request.getParameter("confirm");
		
		LoginDao dao= new LoginDao();
		
		PrintWriter out=response.getWriter();
		
		if(!dao.verifyEmail(email)) {
			if(reset.equals(confirm)) {
				dao.resetPass(reset, email);
				HttpSession session=request.getSession();
				session.setAttribute("username",user);
				response.sendRedirect("welcome.jsp");
			}
			else {
				out.println("Password doesnt match");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				response.sendRedirect("forget.jsp");
			}
		}
		else out.println("eamil doesnt exist");
	}

	
}
