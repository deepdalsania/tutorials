package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.faces.bean.ManagedBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
@ManagedBean(name = "fn")
public class MySqlInsert {
	int id;
	String name;
	String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean add() {
		int result = 0;

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/info", "root", "");
			String query1 = "insert into studentinfo values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(query1);
			ps.setInt(1, this.getId());
			ps.setString(2, this.getName());
			ps.setString(3, this.getEmail());
			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (result == 1) {
			return true;
		} else {
			return false;
		}
	}

	public String save() {
		if (this.add() == true) {
			return "success";
		} else {
			return "fail";
		}

	}
}
