import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDb {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection con;
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sem 4 jt","root","");
			Statement stmt;
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from stud_reg_info");
			System.out.println("Firstname\tLastname\tBranch\t\tusername\tpassword");
			while(rs.next()) {
				System.out.println(rs.getString(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getString(4) + "\t" + rs.getString(5));
			}
			rs.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
