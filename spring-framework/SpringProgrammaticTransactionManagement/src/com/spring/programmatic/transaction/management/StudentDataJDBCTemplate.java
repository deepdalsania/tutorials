package com.spring.programmatic.transaction.management;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class StudentDataJDBCTemplate implements StudentDAO {

	private JdbcTemplate jdbcTemplate;
	private PlatformTransactionManager transactionManager;

	@Override
	public void setJdbcTemplate(JdbcTemplate jt) {
		this.jdbcTemplate = jt;
	}

	@Override
	public void setTransactionManager(PlatformTransactionManager tm) {
		this.transactionManager = tm;

	}

	@Override
	public void insertStudent(String name, String university, Double cgpa, Integer marks, Integer year) {
		TransactionDefinition transDef = new DefaultTransactionDefinition();
		TransactionStatus transStatus = transactionManager.getTransaction(transDef);
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
			transactionManager.commit(transStatus);
		} catch (DataAccessException e) {
			System.out.println("Error in insertig record, rolling back");
			transactionManager.rollback(transStatus);
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
