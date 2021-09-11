package com.servletjsp.controller.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servletjsp.model.UserModel;

@WebServlet(urlPatterns = {"/trang-chu"}) // CÃ³ thá»ƒ cÃ³ nhiá»�u url
public class HomeController extends HttpServlet  {
	private static final long serialVersionUID = 8933354549475736032L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
		//  /decorators/web.jsp
		rd.forward(request, response);
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
}
