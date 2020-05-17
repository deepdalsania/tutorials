package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "ff")
public class OracleGet {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@SuppressWarnings("unused")
	public String get() {
		String n;
		int a;
		Connection con;
		Statement pss;
		PreparedStatement ps = null;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con = DriverManager.getConnection("jdbc:odbc:info");
			String sql = "select * from demo where name='" + name + "'";
			pss = con.createStatement();

			// ps= con.prepareStatement("select * from demo where name=?");
			// ps.setString(1, name);
			// ps.execute();
			pss.execute(sql);
			ResultSet rs = pss.getResultSet();

			while (rs.next()) {
				n = rs.getString(1);
				a = rs.getInt(2);
			}
		} catch (Exception e) {
			return "no";
		}
		return "data";
	}

}
