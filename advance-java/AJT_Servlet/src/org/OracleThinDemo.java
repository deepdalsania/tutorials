package org;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OracleThinDemo extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		OracleThinQurey oracleQurey = new OracleThinQurey();
		oracleQurey.connectivity();
		//oracleQurey.createTable();
		oracleQurey.insertData();
		//oracleQurey.updateData();
		//oracleQurey.deleteData();
	}

}
class OracleThinQurey
{
	Connection conn;
	Statement st;
	PreparedStatement preparedStatement;
	Scanner sc = new Scanner(System.in);
	
	void connectivity(){
		
		 try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@DeepDalsaniaDD:1521:xe","system","deepDD@410");
		
			 System.out.println("connected...");
		 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	
	
	void createTable() {
	
		 try {
			st = conn.createStatement();
			System.out.println("connected...");
			//String s = "CREATE TABLE DEPOSIT( (ACTNO VARCHAR(5) ,CNAME VARCHAR(18) , BNAME VARCHAR(18) , AMOUNT INT(8) ,ADATE DATE));";
			
			String s = "CREATE TABLE userinfo(ID NUMBER(2),USERNAME VARCHAR2(20), PASSWORD VARCHAR2(20))";
			st.execute(s);
			
			
			//st.execute("insert into UserInfo values('Deep','Dalsania','dd@oracle','system')");
			System.out.println("executed.");
			st.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	void insertData() {
/*		 st = conn.createStatement();
		 st.execute("insert into UserInfo values('Deep','Dalsania','dd@oracle','system')");*/
		
		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		System.out.println("Enter Username : ");
		String name = sc.next();
		System.out.println("Enter Password : ");
		String pw = sc.next();
		
		try {
			preparedStatement = conn.prepareStatement("insert into userinfo values(?,?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, pw);
			preparedStatement.execute();
			System.out.println("executed.");
			preparedStatement.close();
			sc.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void updateData() {
		
		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		System.out.println("Enter Username : ");
		String name = sc.next();
		try {
			preparedStatement = conn.prepareStatement("update userinfo set USERNAME=? where ID="+id+"");
			preparedStatement.setString(1, name);
			//preparedStatement.executeUpdate();
			preparedStatement.execute();
			System.out.println("executed.");
			preparedStatement.close();
			sc.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteData() {
		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		
		try {
			preparedStatement = conn.prepareStatement("delete from userinfo where ID="+id+"");
			preparedStatement.executeUpdate();
			System.out.println("executed.");
			preparedStatement.close();
			sc.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}