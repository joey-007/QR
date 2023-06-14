package com.newqr;

import java.io.*;
import java.io.InputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@MultipartConfig
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String Pn=request.getParameter("phone");
		String email=request.getParameter("email");
		String insta=request.getParameter("instagram");
		String snap=request.getParameter("snapchat");
		String address=request.getParameter("address");
		String linkedin=request.getParameter("linkedin");
		String password=request.getParameter("password");
		String fileName="";
		try {
		 Part filePart = request.getPart("photo");
	     fileName = filePart.getSubmittedFileName();
	     String uploadPath="C:/Users/mjose.LAPTOP-NKOFOH4D/eclipse-workspace/Qr/src/main/webapp/images/"+fileName;
	     System.out.print(uploadPath);
	     FileOutputStream fos=new FileOutputStream(uploadPath);
	     InputStream is=filePart.getInputStream();
	     
	     byte[] data=new byte[is.available()];
	     is.read(data);
	     fos.write(data);
	     fos.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	        
        
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qr", "root", "707709@");
	    PreparedStatement fetchStmt = con.prepareStatement("select * from qrdetails where name = ?");
	    fetchStmt.setString(1, name);
	    ResultSet rs = fetchStmt.executeQuery();
	    	if(!rs.next()) {
	    		PreparedStatement ps = con.prepareStatement("insert into qrdetails values(?,?,?,?,?,?,?,?,?)");
	    	    ps.setString(1, name);
	    	    ps.setString(2,Pn);
	    	    ps.setString(3,email);
	    	    ps.setString(4,insta);
	    	    ps.setString(5,snap);
	    	    ps.setString(6,address);
	    	    ps.setString(7,linkedin);
	    	    ps.setString(9, password);
	    	    ps.setString(8,fileName);
	    	    ps.executeUpdate();
	    	    ps.close();
	    	    rs.close();
	    	    fetchStmt.close();
	    	    con.close();
	    	    response.sendRedirect("index.jsp");
	    	}
        }
	    
	    
	    
	    
		
		catch(Exception e) {
			e.printStackTrace();
		}
        
		}
		
	}


