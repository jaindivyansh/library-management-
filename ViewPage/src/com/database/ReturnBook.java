package com.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connection.DbConnection;

public class ReturnBook {
	int idNo;
	String bookName;
	Date returnDate;
	int subjectCode;
	
	public ReturnBook() {
		super();
	}
	public ReturnBook(int idNo, String bookName, Date returnDate) {
		super();
		this.idNo = idNo;
		this.bookName = bookName;
		this.returnDate = returnDate;
		
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
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
public void returnBook(int subjectCode) {
		
		try {
			
			Connection con = DbConnection.getConnect();
			
			
			String DB_GETNO="select noofBooks from inventry where subjectCode=?";
			
			
			PreparedStatement ps= con.prepareStatement(DB_GETNO);
			ps.setInt(1, subjectCode);;
			ResultSet set = ps.executeQuery();
		
		}
