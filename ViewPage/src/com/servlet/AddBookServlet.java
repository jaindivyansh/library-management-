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
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/addbook")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bookName=request.getParameter("Book_name");
		int bookCode=Integer.parseInt(request.getParameter("Book_code"));
		String author=request.getParameter("Author");
                
               
                int price=Integer.parseInt(request.getParameter("Price"));
                int rackNo=Integer.parseInt(request.getParameter("Rack_no"));
                int noOfBooks=Integer.parseInt(request.getParameter("No_of_books"));
         int subjectCode=Integer.parseInt(request.getParameter("Subject_code"));
         Date dateOfArrival=null;
         AddBooks book=new AddBooks(bookName, bookCode, author, dateOfArrival, price, rackNo, noOfBooks, subjectCode);
         
         book.addBook();
         
	}

}
