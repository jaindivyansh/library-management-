package com.servlet;
import com.database.*;
import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IssueServlet
 */
@WebServlet("/issue")
public class IssueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int idNo=Integer.parseInt(request.getParameter("idNo"));
		String bookName=request.getParameter("BookName");
                
		Date issueDate=null;
		Date dueDate=null;
		
		Issue I=new Issue(idNo, bookName, issueDate, dueDate);
		
	}

}
