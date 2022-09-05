/***

Casey Kreps

Java Servlet for connecting and inputing data into database

Kreps Final Assignment

August 23, 2022
		
**/

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	String sql = " INSERT INTO employee (empId, empFirst, empLast, empEmail, empPhone)" + " VALUES (?, ?, ?, ?, ?)";
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String id = request.getParameter("id");
		String first = request.getParameter("first");
		String last = request.getParameter("last");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		
		String URL = "jdbc:mysql://localhost:3306/employees";
		String USERNAME = "root";
		String PASSWORD = "passCode";
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		
		//load driver
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		//connect to mysql server
		
		try {
			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			DateBean dBean = new DateBean(); /** import bean **/
			Date dateTime = dBean.getDateTime();
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.setString(2, first);
			pst.setString(3, last);
			pst.setString(4, email);
			pst.setString(5, phone);
			int count = pst.executeUpdate();
			if(count == 0) {
				pw.println("Data not submitted");
				pw.println("<a href= \"http://localhost:8080/Kreps_Final/landing.html\" >Try Again!</a>");
				} else {
					pw.println("Data submitted on " + dateTime);
					pw.println("<br><a href= \"http://localhost:8080/Kreps_Final/landing.html\" >Start again and submit to email!</a>");
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
		e.printStackTrace();
		}

	}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
