package com.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.DbConnection;

public class AddBooks {
	//static int jBook,cBook,pBook;
	private String bookName;
	private int bookCode;
	private String author;
	private Date dateOfArrival;
	private int price;
	private int rackNo;
	private int noOfBooks;
	private int subjectCode;
	
	public AddBooks(){

		
	}
	
	public AddBooks(String bookName, int bookCode, String author, Date dateOfArrival, int price, int rackNo,
			int noOfBooks, int subjectCode) {
		super();
		this.bookName = bookName;
		this.bookCode = bookCode;
		this.author = author;
		this.dateOfArrival = dateOfArrival;
		this.price = price;
		this.rackNo = rackNo;
		this.noOfBooks = noOfBooks;
		this.subjectCode = subjectCode;
	}

	
	public String getBookName() {
		return bookName;
	}

	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	
	public int getBookCode() {
		return bookCode;
	}

	
	public void setBookCode(int bookCode) {
		this.bookCode = bookCode;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Date getDateOfArrival() {
		return dateOfArrival;
	}


	public void setDateOfArrival(Date dateOfArrival) {
		this.dateOfArrival = dateOfArrival;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getRackNo() {
		return rackNo;
	}


	public void setRackNo(int rackNo) {
		this.rackNo = rackNo;
	}


	public int getNoOfBooks() {
		return noOfBooks;
	}


	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}


	public int getSubjectCode() {
		return subjectCode;
	}


	public void setSubjectCode(int subjectCode) {
		this.subjectCode = subjectCode;
	}
	
	
	public void addBook() {
		Connection con= DbConnection.getConnect();
		
		String SQL_ADD="insert into Books values(?,?,?,?,?,?,?,?)";
		String DB_GETNO="select noofBooks from inventry where subjectCode=?";
		
		
		try {
			
			PreparedStatement ps= con.prepareStatement(DB_GETNO);
			ps.setInt(1, subjectCode);;
			ResultSet set = ps.executeQuery();
			int oldnoOfBooks = 0;
			while(set.next()) {
			oldnoOfBooks=set.getInt(2);
				
			}
			oldnoOfBooks=oldnoOfBooks+noOfBooks;
			
			ps = con.prepareStatement(SQL_ADD);
			
			ps.setString(1, bookName);
			ps.setInt(2, bookCode);
			ps.setString(3, author);
			ps.setDate(4, dateOfArrival);
			ps.setInt(5, price);
			ps.setInt(6, rackNo);
			ps.setInt(7, noOfBooks);
			ps.setInt(7, subjectCode);
			
			int result=ps.executeUpdate();
			
			//Updating Inventry
			String SQL_DEDUCT="update inventry set noOfBooks=? where subjectCode=?";
			ps= con.prepareStatement(SQL_DEDUCT);
			ps.setInt(1, noOfBooks);
			ps.setInt(2, subjectCode);
			ps.executeUpdate();
			
			con.close();
			if(result>0) {
				System.out.println("Book Added To library");
				 {
					
				}
			}
			else
				System.out.println("This Book cant Be add");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
