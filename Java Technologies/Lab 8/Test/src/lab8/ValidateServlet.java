package lab8;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection con;
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("uname");
		String pass = req.getParameter("upass");	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sem 4 jt","root","");
			PreparedStatement stmt;
			stmt = con.prepareStatement("SELECT * FROM stud_reg_info WHERE username = ? AND password = ?");
			stmt.setString(1, name);
			stmt.setString(2, pass);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				RequestDispatcher rd = req.getRequestDispatcher("WelcomeServlet");
				rd.forward(req, resp);
			}else {
				out.print("Sorry UserName or Password Error!");  
				RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
				rd.include(req, resp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
