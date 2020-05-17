package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "user")
@SessionScoped
public class UserInfo {

	public String firstName;
	public String lastName;
	public String userName;
	public String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	/**
	 *
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public String insertData() {
		int result = 1;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			Connection con = DriverManager.getConnection("jdbc:odbc:userinfo");
			String q = "insert into UserInfoData values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(q);
			ps.setString(1, this.getFirstName());
			ps.setString(2, this.getLastName());
			ps.setString(3, this.getUserName());
			ps.setString(4, this.getPassword());
			result = ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException ex) {
			Logger.getLogger(UserInfo.class.getName()).log(Level.SEVERE, null, ex);
		}

		if (result == 1) {
			return "Success";
		} else {
			return "Failure";
		}
	}

}
