package com.spring.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public interface StudentDAO {

	/*
	 * DAO stands for Data Access Object, which is commonly used for database
	 * interaction. DAOs exist to provide a means to read and write data to the
	 * database and they should expose this functionality through an interface by
	 * which the rest of the application will access them.
	 */

	/* initialize db resources like connection */
	public void setJdbcTemplate(JdbcTemplate jt);

	/* insert record into the table */
	public void insertStudent(String name, String university, Double cgpa);

	/* return 1 row corresponding to passed enNo */
	public StudentData getStudent(Integer enNo);

	/* return all rows with list */
	public List<StudentData> getAllStudents();

	/* update a student cgpa into table corresponding to passed enNo */
	public void updateStudent(Integer enNo, Double cgpa);

	/* delete record from table corresponding to passed enNo */
	public void deleteStudent(Integer enNo);

}
