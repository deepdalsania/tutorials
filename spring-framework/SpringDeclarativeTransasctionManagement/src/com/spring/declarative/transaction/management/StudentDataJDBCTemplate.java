package com.spring.declarative.transaction.management;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDataJDBCTemplate implements StudentDAO {

	private JdbcTemplate jdbcTemplate;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void insertStudent(String name, String university, Double cgpa, Integer marks, Integer year) {
		try {
			String query1 = "insert into STUDENTINFO (name, university, cgpa) values (?, ?, ?)";
			// update : is used to insert, update and delete records.
			jdbcTemplate.update(query1, name, university, cgpa);

			// Get the latest student en_no to be used in STUDENTRESULT table
			String query2 = "select max(en_no) from STUDENTINFO";
			int sid = jdbcTemplate.queryForObject(query2, Integer.class);

			String query3 = "insert into STUDENTRESULT (sid, marks, year) values (?, ?, ?)";
			jdbcTemplate.update(query3, sid, marks, year);

			System.out.println("Inserted record is :" + "\nName : " + name + "\nUniversity : " + university
					+ "\nYear : " + year + "\nMarks : " + marks + "\nCGPA : " + cgpa);

			/*
			 * Note : First try with removing comment of throws then run the application it
			 * will throw an exception. So the transaction will be rolled back and no record
			 * will be created in the database table. Now try by commenting again or
			 * removing throws. Now it should commit the transaction and you should see a
			 * record in the database.
			 */
			// to simulate the exception.
			// throw new RuntimeException("simulate Error condition");
		} catch (DataAccessException e) {
			System.out.println("Error in insertig record, rolling back");
			e.printStackTrace();
		}

	}

	@Override
	public List<StudentData> getAllStudents() {
		String query = "select * from STUDENTINFO, STUDENTRESULT where STUDENTINFO.en_no = STUDENTRESULT.sid";
		List<StudentData> studentList = jdbcTemplate.query(query, new StudentDataMapper());
		return studentList;
	}
}
