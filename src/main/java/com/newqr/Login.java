package com.newqr;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String name=request.getParameter("name");
			String password=request.getParameter("password");
			HttpSession session=request.getSession();
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qr", "root", "707709@");
		    Statement st=con.createStatement();
		    ResultSet rs=st.executeQuery("select * from qrdetails where name='"+name+"' and password='"+password+"'");
		    if(rs.next()) {
		    	session.setAttribute("name",rs.getString("name"));
		    	session.setAttribute("phone",rs.getString("phone"));
		    	session.setAttribute("email",rs.getString("email"));
		    	session.setAttribute("insta",rs.getString("insta"));
		    	session.setAttribute("snap",rs.getString("snap"));
		    	session.setAttribute("address",rs.getString("address"));
		    	session.setAttribute("linkedin",rs.getString("linkedin"));
		    	session.setAttribute("filepath",rs.getString("filepath"));
		    	//System.out.print(rs.getString("filepath"));
		    	rs.close();
		    	st.close();
		    	con.close();
		    	
		    	response.sendRedirect("welcome.jsp");
		    }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}


}