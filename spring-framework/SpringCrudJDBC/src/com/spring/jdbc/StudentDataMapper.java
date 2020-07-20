package com.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentDataMapper implements RowMapper<StudentData> {

	@Override
	public StudentData mapRow(ResultSet rs, int rowNum) throws SQLException {
		StudentData student = new StudentData();
		student.setEnNo(rs.getInt("en_no"));
		student.setName(rs.getString("name"));
		student.setUniversity(rs.getString("university"));
		student.setCgpa(rs.getDouble("cgpa"));
		return student;
	}

}
