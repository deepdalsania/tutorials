package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class ResultsetMetaDataDemo {
	public static void main(String[] args) {
		try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@DeepDalsaniaDD:1521:xe","system","abc@123");
			String s = "select * from userinfo";
			Statement st = conn.createStatement();
			st.execute(s);
			ResultSet rs = st.getResultSet();
			ResultSetMetaData data = rs.getMetaData();
		
			System.out.println("getColumnCount : "+data.getColumnCount());
			System.out.println("getColumnDisplaySize : "+data.getColumnDisplaySize(3));
			System.out.println("getColumnLabel : "+data.getColumnLabel(1));
			System.out.println("getColumnName : "+data.getColumnName(2));
			System.out.println("getColumnType : "+data.getColumnType(2));
			System.out.println("getTableName :"+data.getTableName(1));
			System.out.println(data.getScale(2));
			System.out.println(data.isAutoIncrement(1));
			System.out.println(data.isCaseSensitive(2));
			System.out.println(data.isCurrency(1));
			
		 } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
