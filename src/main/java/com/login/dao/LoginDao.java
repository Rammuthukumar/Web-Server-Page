package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	
	String url="jdbc:mysql://localhost:3306/webpage";
	String user="root";
	String passw="ramsnth@18";
	
	final String check="select * from loginserver where username=? and password=?";
	final String add="insert into loginserver (username,password,email)values(?,?,?)";
	final String verifyemail="select * from loginserver where email=?";
	final String resetpsw="update loginserver set password=? where email=?";
	
	public boolean check(String uname, String pass) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, passw);
			PreparedStatement pst=con.prepareStatement(check);
			pst.setString(1, uname);
			pst.setString(2, pass);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) return true;	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean adduser(String uname,String pass,String email) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection(url,user,passw);
			PreparedStatement pst=con.prepareStatement(add);
			pst.setString(1, uname);
			pst.setString(2, pass);
			pst.setString(3, email);
			int val=pst.executeUpdate();
			if(val==1) return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean verifyEmail(String email) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,passw);
			PreparedStatement pst=con.prepareStatement(verifyemail);
			pst.setString(1, email);
			ResultSet rs=pst.executeQuery();
			if(!rs.next()) return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void resetPass(String reset,String email) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,passw);
			PreparedStatement pst=con.prepareStatement(resetpsw);
			pst.setString(1, reset);
			pst.setString(2, email);
			pst.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
