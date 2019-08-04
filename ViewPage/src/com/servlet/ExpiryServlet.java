package com.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExpiryServlet
 */
@WebServlet("/expiry")
public class ExpiryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id_no=Integer.parseInt(request.getParameter("id_no"));
		String Book_code=request.getParameter("Book_code");
                int Issue_date=Integer.parseInt(request.getParameter("Issue_date"));
		int expiry_date=Integer.parseInt(request.getParameter("expiry_date"));
	}

}
