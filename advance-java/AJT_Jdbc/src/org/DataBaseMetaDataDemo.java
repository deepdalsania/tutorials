package org;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.Statement;

public class DataBaseMetaDataDemo {
	public static void main(String[] args) {
		try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@DeepDalsaniaDD:1521:xe","system","abc@123");
			String s = "select * from userinfo";
			Statement st = conn.createStatement();
			st.execute(s);
			DatabaseMetaData data = conn.getMetaData();
			System.out.println("getCatalogSeparator : "+data.getCatalogSeparator());
			System.out.println("getCatalogTerm : "+data.getCatalogTerm());
			System.out.println("allProceduresAreCallable : "+data.allProceduresAreCallable());
			System.out.println("getDriverName : "+data.getDriverName());
			System.out.println("getDriverVersion : "+data.getDriverVersion());
			System.out.println("getDatabaseMajorVersion : "+data.getDatabaseMajorVersion());
			System.out.println("getDatabaseMinorVersion : "+data.getDatabaseMinorVersion());
			System.out.println("getDatabaseProductName : "+ data.getDatabaseProductName());
			System.out.println("getDatabaseProductVersion : "+ data.getDatabaseProductVersion());
			System.out.println("getDefaultTransactionIsolation : "+data.getDefaultTransactionIsolation());
			System.out.println("getDriverMajorVersion : "+data.getDriverMajorVersion());
			System.out.println("getDriverMinorVersion : "+data.getDriverMinorVersion());
			System.out.println("getJDBCMajorVersion : "+data.getJDBCMajorVersion());
			System.out.println("getMaxCatalogNameLength : "+data.getMaxCatalogNameLength());
			System.out.println("getMaxConnections : "+data.getMaxConnections());
			System.out.println("getMaxRowSize : "+data.getMaxRowSize());
			System.out.println(data.getMaxColumnsInIndex());
			System.out.println(data.getMaxColumnsInTable());
			System.out.println(data.dataDefinitionCausesTransactionCommit());
			
			 System.out.println("connected...");
		 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
