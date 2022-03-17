package com.fetch;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employee.Employee;
import com.fetch.dao.FetchDao;

/**
 * Servlet implementation class Fetch
 */
@WebServlet("/Fetch")
public class Fetch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String empid = request.getParameter("empid");
		
		FetchDao dao  = new FetchDao();
		ArrayList<Employee> Employees = new ArrayList<>();
		
//		movies.add("Happier");
//		movies.add("You are the reason");
		
		Employees = dao.check(empid);
		if(Employees.size()!=0)
		{
			
//			HttpSession session = request.getSession();
			request.setAttribute("Employees", Employees);
			request.setAttribute("empid", empid);
//			response.sendRedirect("recommendtionResult.jsp");
			 RequestDispatcher rd = request.getRequestDispatcher("results.jsp");
			
			 rd.forward(request, response);
	        
		}
		else
		{
			
			response.sendRedirect("success.jsp");
		}
	}

}
