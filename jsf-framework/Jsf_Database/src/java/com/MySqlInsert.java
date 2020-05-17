
package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MySqlInsert {
	public static void main(String[] args) {
		Connection con;
		// Statement pss;
		PreparedStatement ps;
		try {
			Class.forName("com.mysql.jdbc.odbc");
			con = DriverManager.getConnection("\"jdbc:mysql://localhost:3306/db_name\",\"id\",\"pw\"");
			// String sql = "select * from demo";
			// pss= con.createStatement();

			ps = con.prepareStatement("insert into demo values(?,?)");
			ps.setString(1, "name");
			ps.setInt(2, 19);
			ps.execute();
			System.out.println("Successfully inserted...\ndata is:\n");
			/*
			 * pss.execute(sql); ResultSet rs=pss.getResultSet();
			 * 
			 * while (rs.next()) { System.out.println(rs.getString(1));
			 * System.out.println(rs.getInt(2));
			 * 
			 */
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
