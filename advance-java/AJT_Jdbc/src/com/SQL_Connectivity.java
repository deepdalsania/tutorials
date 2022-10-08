package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class SQL_Connectivity {

	public static void main(String[] args) throws Exception {

		OracleQurey oracleQurey = new OracleQurey();
		oracleQurey.connectivity();
		// oracleQurey.createTable();
		// oracleQurey.insertData();
		// oracleQurey.storeProcedure();
		// oracleQurey.functionDemo();
	}

}

class OracleQurey {
	Connection conn;
	Statement st;
	PreparedStatement preparedStatement;
	Scanner sc = new Scanner(System.in);

	void connectivity() throws ClassNotFoundException, SQLException {
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		conn = DriverManager.getConnection("jdbc:odbc:sqldata", "system", "abc@123");
//			("jdbc:oracle:thin:@DeepDalsaniaDD:1521:xe","uname","password")// problem
		System.out.println("connected...");
	}

	void createTable() throws SQLException {

		st = conn.createStatement();
		System.out.println("connected...");
		// String s = "CREATE TABLE DEPOSIT( (ACTNO VARCHAR(5) ,CNAME VARCHAR(18) ,
		// BNAME VARCHAR(18) , AMOUNT INT(8) ,ADATE DATE));";

		String s = "CREATE TABLE userinfo(ID NUMBER(2),USERNAME VARCHAR2(20), PASSWORD VARCHAR2(20))";
		st.execute(s);

		// st.execute("insert into UserInfo
		// values('Deep','Dalsania','dd@oracle','system')");
		System.out.println("executed.");
		st.close();
		conn.close();

	}

	void insertData() throws SQLException {
		/*
		 * st = conn.createStatement(); st.
		 * execute("insert into UserInfo values('Deep','Dalsania','dd@oracle','system')"
		 * );
		 */

		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		System.out.println("Enter Username : ");
		String name = sc.next();
		System.out.println("Enter Password : ");
		String pw = sc.next();

		preparedStatement = conn.prepareStatement("insert into userinfo values(?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, pw);
		preparedStatement.execute();
		System.out.println("executed.");
		preparedStatement.close();
		sc.close();
		conn.close();
	}

	void updateData() throws SQLException {

		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		System.out.println("Enter Username : ");
		String name = sc.next();

		String query = "update userdetail set username=" + name + " where id=" + id + "";

		preparedStatement = conn.prepareStatement(query);

	}

	void storeProcedure() throws SQLException {

		/*
		 * CallableStatement callableStatement =
		 * conn.prepareCall("call addition(?,?,?)");
		 * 
		 * callableStatement.setInt(1, 10);
		 * 
		 * callableStatement.setInt(2, 4); callableStatement.registerOutParameter(3,
		 * Types.INTEGER);
		 * 
		 * callableStatement.execute();
		 * 
		 * System.out.println("Adition is  = "+callableStatement.getInt(3));
		 * callableStatement.close();
		 * 
		 * conn.close();
		 */

		// CallableStatement callableStatement = conn.prepareCall("call insertdata()");
		CallableStatement callableStatement = conn.prepareCall("call insertdata(?,?,?,?)");

		/*
		 * callableStatement.setString(1, "parim"); callableStatement.setString(2,
		 * "patel"); callableStatement.setString(3, "pp");
		 * callableStatement.setString(4, "parmal@123");
		 */

		Scanner s = new Scanner(System.in);
		System.out.println("First name : ");
		String fname = s.next();
		System.out.println("Last name : ");
		String lname = s.next();
		System.out.println("User name : ");
		String uname = s.next();
		System.out.println("Password : ");
		String pw = s.next();
		s.close();
		callableStatement.setString(1, fname);
		callableStatement.setString(2, lname);
		callableStatement.setString(3, uname);
		callableStatement.setString(4, pw);

		callableStatement.execute();

		callableStatement.close();
		conn.close();
	}

	void functionDemo() throws SQLException {
		CallableStatement callableStatement = conn.prepareCall("{?=call sumation(?,?)}");
		callableStatement.setInt(2, 3);
		callableStatement.setInt(3, 4);

		callableStatement.registerOutParameter(1, Types.INTEGER);
		callableStatement.execute();
		System.out.println("Adition is  = " + callableStatement.getInt(1));
		callableStatement.close();
		conn.close();
	}

}
