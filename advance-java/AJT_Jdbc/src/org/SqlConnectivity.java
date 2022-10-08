package org;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class SqlConnectivity {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection connection = DriverManager.getConnection("jdbc:odbc:sqldata","system","abc@123");
		/*String q = "insert into studentdb values(?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(q);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EnNo : ");
		String en = sc.next();
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Enter city : ");
		String city = sc.next();
		preparedStatement.setString(1, en);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, city);
		preparedStatement.execute();
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()){
			System.out.println("Enrollment NO : "+resultSet.getString(1));
			System.out.println("Enrollment NO : "+resultSet.getString("name"));
			System.out.println("Enrollment NO : "+resultSet.getString("city"));
		}*/
		
		CallableStatement callableStatement = connection.prepareCall("{? = call addition(?,?)}");
		callableStatement.setInt(2, 3);
		callableStatement.setInt(3, 4);
		callableStatement.registerOutParameter(1, Types.INTEGER);
		
		
		System.out.println("Addition is : "+callableStatement.getInt(1));
		callableStatement.execute();
		callableStatement.close();
		connection.close();
	}
}

/*class OracleConn
{
	public void sp() {
		
		
CallableStatement callableStatement = conn.prepareCall("call addition(?,?,?)");
		
		callableStatement.setInt(1, 10);
		
		callableStatement.setInt(2, 4);
		callableStatement.registerOutParameter(3, Types.INTEGER);
	
		callableStatement.execute();
		
		System.out.println("Adition is  = "+callableStatement.getInt(3));
		callableStatement.close();
}
*/
