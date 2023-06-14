package com.newqr;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.zxing.WriterException;

/**
 * Servlet implementation class QRGener
 */
@WebServlet("/QRGener")
public class QrGener extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//QRGen obj=new QRGen();
		HttpSession session=request.getSession();
		String text="http://localhost:8082/Qr/welcome.jsp";
		String name=String.valueOf(session.getAttribute("name"));
		String path="C:/Users/mjose.LAPTOP-NKOFOH4D/eclipse-workspace/Qr/src/main/webapp/QrPhotos/"+name+"";
		int w=300;
		int h=300;
		
		try {
			QrGen q=new QrGen();
			q.generateQRCode(text, path, w, h);
			response.sendRedirect("QrImage.jsp");
		} catch (WriterException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
