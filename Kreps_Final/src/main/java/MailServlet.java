/***
Casey Kreps

Mail Handler Servlet

Kreps Final Assignment

August 25, 2022
 ***/

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import javax.mail.MessagingException;

@WebServlet(name="MailServlet", urlPatterns = {"/MailServlet"})
public class MailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		
		String toEmail = request.getParameter("email1");
				//"servlettest12@gmail.com";

		
		try {
			JavaMailUtil.send(toEmail);
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("<b>Mail Sent Successfully</b><br>");
		out.println("<a href= \"http://localhost:8080/Kreps_Final/landing.html\" >Restart!</a>");
			
		}
				
				
				
	}



