package com.spring.programmatic.transaction.management;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;

public interface StudentDAO {

	/*
	 * DAO stands for Data Access Object, which is commonly used for database
	 * interaction. DAOs exist to provide a means to read and write data to the
	 * database and they should expose this functionality through an interface by
	 * which the rest of the application will access them.
	 */

	/* initialize db resources like connection */
	public void setJdbcTemplate(JdbcTemplate jt);

	public void setTransactionManager(PlatformTransactionManager tm);

	/* insert record into the table */
	public void insertStudent(String name, String university, Double cgpa, Integer marks, Integer year);

	/* return all rows with list */
	public List<StudentData> getAllStudents();

}
