package com.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.DbConnection;

public class Issue {
	
	int idNo;
	String bookName;
	Date issueDate;
	Date dueDate;
	int subjectCode;
	
	public Issue() {
		super();
	}
	
	public Issue(int idNo, String bookName, Date issueDate, Date dueDate) {
		super();
		this.idNo = idNo;
		this.bookName = bookName;
		this.issueDate = issueDate;
		this.dueDate = dueDate;
	}

	public int getIdNo() {
		return idNo;
	}

	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	
	public void issue(int subjectCode) {
		
		try {
			
			Connection con = DbConnection.getConnect();
			
			
			String DB_GETNO="select noofBooks from inventry where subjectCode=?";
			
			
			PreparedStatement ps= con.prepareStatement(DB_GETNO);
			ps.setInt(1, subjectCode);;
			ResultSet set = ps.executeQuery();
			int noOfBooks = 0;
			while(set.next()) {
				
				
			}
			if(noOfBooks>0) {
				
				//Issueing Book & updating Issue Table
				String SQL_ISSUE="insert into issue values(?,?,?,?)";
				ps= con.prepareStatement(SQL_ISSUE);
				ps.setInt(1, idNo);
				ps.setString(2, bookName);
				ps.setDate(3, issueDate);
				ps.setDate(4, dueDate);
				int result=ps.executeUpdate();
				noOfBooks--;
				
				
				
				//Updating Inventry
				String SQL_DEDUCT="update inventry set noOfBooks=? where subjectCode=?";
				ps= con.prepareStatement(SQL_DEDUCT);
				ps.setInt(1, noOfBooks);
				ps.setInt(2, subjectCode);
				ps.executeUpdate();
				
				if(result>0) {
					System.out.println("Book Issued Details are");
					System.out.println(idNo +bookName +issueDate +dueDate);
						
				}
				
			}
			
			else
				System.out.println("Entered Book IS Out Of Stock");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
