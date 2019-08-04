package com.servlet;
import com.database.*;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddMemberServlet
 */
@WebServlet("/addmember")
public class AddMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String statusofms=request.getParameter("statusofms");
		String typeofms=request.getParameter("typeofms");
		int ammount=Integer.parseInt(request.getParameter("statusofms"));
	
		Members m=new Members(0, name, address, null, null, "Member");
        
        int id=m.addMember();
        
        if(id>0)
        {
        	request.setAttribute("id", id);
        RequestDispatcher rd=request.getRequestDispatcher("Id.jsp");
     	rd.forward(request, response);

        }
	
	}
			
}
