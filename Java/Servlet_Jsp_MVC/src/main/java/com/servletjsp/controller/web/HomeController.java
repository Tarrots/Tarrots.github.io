package com.servletjsp.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servletjsp.service.impl.ICategoryService;
import com.servletjsp.service.impl.INewsService;

@WebServlet(urlPatterns = {"/trang-chu"}) // Có nhiều url
public class HomeController extends HttpServlet  {
	@Inject
	private ICategoryService categoryS;
	/* Ngắn gọn hơn cách bình thường!
	   Tiết kiệm data
	   Java Servlet Weld: https://zetcode.com/articles/javaservletweld/
	*/
	@Inject
	private INewsService newsS;
	private static final long serialVersionUID = 8933354549475736032L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("categories", categoryS.findAll());
		RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
}
