package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Connectivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); Connection conn =
		 * DriverManager.getConnection("jdbc:odbc:Data",sys,pw); // for oracle Scanner
		 * sc = new Scanner(System.in); System.out.println("Enter Id : "); int id =
		 * sc.nextInt(); System.out.println("Enter Name : "); String name = sc.next();
		 * //Statement st = conn.createStatement(); //st.execute(s); String s =
		 * "select * from StudentInfo where ID=? and NAME=?";
		 * 
		 * PreparedStatement ps = conn.prepareStatement(s); ps.setInt(1, id);
		 * ps.setString(2, name); ps.execute(); ResultSet rs = ps.getResultSet();
		 * while(rs.next()){ System.out.println("ID : "+rs.getInt(1));
		 * System.out.println("Name : "+rs.getString(2));
		 * System.out.println("Nmber : "+rs.getInt(3));
		 * System.out.println("City : "+rs.getString(4)); }
		 */

		/*
		 * MyAccess access = new MyAccess(); access.connectivity();
		 * //access.createTable(); //access.inserData(); //access.dynamicQuery();
		 * //access.updateData(); access.deleteData();
		 */

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection conn = DriverManager.getConnection("jdbc:odbc:UserData");
//				("jdbc:oracle:thin:@DeepDalsaniaDD:1521:xe","uname","password")// problem
		System.out.println("connected...");
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter Id : "); int
		 * id = sc.nextInt();
		 */
		String s = "delete from UserInfo " + "where ID=4";
		try {
			/*
			 * PreparedStatement ps = conn.prepareStatement(s); ps.execute(); ps.close();
			 */
			Statement statement = conn.createStatement();
			statement.execute(s);
			System.out.println("Execcuted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class MyAccess {
	Connection conn;
	Statement statement;
	PreparedStatement ps;

	void connectivity() throws ClassNotFoundException, SQLException {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		conn = DriverManager.getConnection("jdbc:odbc:UserData");
//			("jdbc:oracle:thin:@DeepDalsaniaDD:1521:xe","uname","password")// problem
		System.out.println("connected...");
	}

	/*
	 * void createTable() {
	 * 
	 * 
	 * try{ //String s =
	 * "CREATE TABLE DEPOSIT( (ACTNO VARCHAR(5) ,CNAME VARCHAR(18) , BNAME VARCHAR(18) , AMOUNT INT(8) ,ADATE DATE));"
	 * ; statement.
	 * executeUpdate("CREATE TABLE UserInfo(ID INT,USERNAME VARCHAR(20), PASSWORD VARCHAR(20))"
	 * );
	 * 
	 * 
	 * System.out.println("executed."); statement.close(); conn.close(); }catch
	 * (SQLException e) { // TODO: handle exception e.printStackTrace(); } }
	 */
	void inserData() throws Exception {

		statement = conn.createStatement();
		statement.execute("insert into UserInfo values(4,'abc','p@123')");
		System.out.println("executed.");
		statement.close();
		conn.close();
	}

	void dynamicQuery() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		System.out.println("Enter Name : ");
		String name = sc.next();
		String s = "select * from UserInfo where ID=? and USERNAME=?";

		ps = conn.prepareStatement(s);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.execute();
		ResultSet rs = ps.getResultSet();
		while (rs.next()) {
			System.out.println("Id : " + rs.getInt(1));
			System.out.println("Username : " + rs.getString(2));
			System.out.println("Password : " + rs.getString(3));

		}

		rs.close();
		ps.close();
		conn.close();
		sc.close();
	}

	/*
	 * public void updateData() throws SQLException { Scanner sc = new
	 * Scanner(System.in); System.out.println("Enter Id : "); int id = sc.nextInt();
	 * System.out.println("Enter Username : "); String name = sc.next(); String s =
	 * "update UserInfo set USERNAME='abc' where Id=4 "; ps.execute(s);
	 * System.out.println("executed."); String s =
	 * "update UserInfo set USERNAME=? where Id=? "; try{
	 * 
	 * PreparedStatement ps = conn.prepareStatement(s);
	 * 
	 * ps.setString(1, name);
	 * 
	 * ps.setInt(2, id);
	 * 
	 * ps.executeUpdate();
	 * 
	 * ps.close(); conn.close(); }catch (SQLException e) { // TODO: handle exception
	 * e.printStackTrace(); }
	 * 
	 * 
	 * }
	 */

	public void deleteData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		String s = "delete from UserInfo where ID=" + id + "";
		try {
			ps.execute(s);
			ps.close();
			System.out.println("Execcuted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}

}
