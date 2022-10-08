package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Connectivity_MySQL {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class MySQLQurey
{
	Connection conn;
	Statement st;
	PreparedStatement preparedStatement;
	Scanner sc = new Scanner(System.in);
	
	void connectivity() throws ClassNotFoundException, SQLException{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		 conn = DriverManager.getConnection("jdbc:odbc:sqldata","system","abc@123");
//			("jdbc:oracle:thin:@DeepDalsaniaDD:1521:xe","uname","password")// problem
		 System.out.println("connected...");
	}
	
	
	void createTable() throws SQLException{
	
		 st = conn.createStatement();
		System.out.println("connected...");
		//String s = "CREATE TABLE DEPOSIT( (ACTNO VARCHAR(5) ,CNAME VARCHAR(18) , BNAME VARCHAR(18) , AMOUNT INT(8) ,ADATE DATE));";
		
		String s = "CREATE TABLE userinfo(ID NUMBER(2),USERNAME VARCHAR2(20), PASSWORD VARCHAR2(20))";
		st.execute(s);
		
		
		//st.execute("insert into UserInfo values('Deep','Dalsania','dd@oracle','system')");
		System.out.println("executed.");
		st.close();
		conn.close();
		
	}
	
	void insertData() throws SQLException{
/*		 st = conn.createStatement();
		 st.execute("insert into UserInfo values('Deep','Dalsania','dd@oracle','system')");*/
		
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
