package com.signup.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupDao
 */
@WebServlet("/SignupDao")
public class SignupDao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void pushToDB(String ename,String pass,String fname,String lname,String dob,String contact)
	{
		
		String sql = "insert into yogeshwarpatil_111915143_detail values('"+ename+"','"+pass+"','"+fname+"','"+lname+"','"+dob+"','"+contact+"')";
		String url = "jdbc:mysql://localhost:3306/login";
		String username = "root";
		String password = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			
			int rs = st.executeUpdate();
		
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
