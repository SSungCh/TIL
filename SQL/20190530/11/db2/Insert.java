package db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {
		// 1. JDBC Driver Loading..
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Loading Error");
		}
		// 2.Connection 1521 db db
		String id = "db";
		String password = "db";
		String url = "jdbc:oracle:thin:@70.12.50.239:1521:xe";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, password);
		} catch (SQLException e) {
			System.out.println("Connection Error");
			e.printStackTrace();
		}
		
		//3.SQL ����
		String sql = "INSERT INTO T_PRODUCT VALUES (?,?,?,SYSDATE)";
		PreparedStatement pstmt = null;
		      
        

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "P02");
			pstmt.setString(2, "SHIRT");
			pstmt.setDouble(3, 1000.32);
			
			int result = pstmt.executeUpdate();
			System.out.println(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// 4. close
		try {
			pstmt.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	

	}

}
