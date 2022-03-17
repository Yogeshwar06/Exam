package com.login.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginDao
 */
@WebServlet("/LoginDao")
public class LoginDao extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String sql = "select * from yogeshwarpatil_111915143_detail where employee_id_number=? and pass=?";
	String url = "jdbc:mysql://localhost:3306/login";
	String username = "root";
	String password = "root";
	public boolean check(String uname, String pass)
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			ResultSet rs = st.executeQuery();
			if(rs.next())
			{
				return true;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		return false;
}
}
