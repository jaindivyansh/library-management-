package com.database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.connection.DbConnection;

public class Members {
	static int count=1;
	private int id;
	private String name;
	private String Address;
	private Date dateofIssue;
	private Date dateofExpiry;
	private String status;

	public Members() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Members(int id, String name, String address, Date dateofIssue, Date dateofExpiry, String status) {
		super();
		this.id = count;
		this.name = name;
		Address = address;
		this.dateofIssue = dateofIssue;
		this.dateofExpiry = dateofExpiry;
		this.status = status;
	}

	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getAddress() {
		return Address;
	}

	
	public void setAddress(String address) {
		Address = address;
	}

	
	public Date getDateofIssue() {
		return dateofIssue;
	}

	
	public void setDateofIssue(Date dateofIssue) {
		this.dateofIssue = dateofIssue;
	}

	
	public Date getDateofExpiry() {
		return dateofExpiry;
	}

	
	public void setDateofExpiry(Date dateofExpiry) {
		this.dateofExpiry = dateofExpiry;
	}

	
	public String getStatus() {
		return status;
	}

	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public int addMember() {
		
		Connection con = DbConnection.getConnect();
		
		String DB_ADD = "insert into members values(?,?,?,?,?,?)";
		String DB_FETCH="select noOfBooks From inventry where id=?";
		PreparedStatement ps;
		int s=0;
		try {
			ps=con.prepareStatement(DB_FETCH);
			ps.executeQuery();
			
			ps = con.prepareStatement(DB_ADD);
			ps.setInt(1,id);
			ps.setString(2, name);
			ps.setString(3, Address);
			ps.setDate(4, dateofIssue);
			ps.setDate(5, dateofExpiry);
			
			s=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(s>0) {
			count++;
			return id;
		}
		else return 0;
	}
	
}
