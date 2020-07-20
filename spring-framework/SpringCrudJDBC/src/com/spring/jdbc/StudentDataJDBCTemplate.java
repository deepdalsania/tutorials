package com.spring.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDataJDBCTemplate implements StudentDAO {

	private JdbcTemplate jdbcTemplate;

	@Override
	public void setJdbcTemplate(JdbcTemplate jt) {
		this.jdbcTemplate = jt;
	}

	@Override
	public void insertStudent(String name, String university, Double cgpa) {
		String query = "insert into STUDENTINFO (name, university, cgpa) values (?, ?, ?)";
		// update : is used to insert, update and delete records.
		jdbcTemplate.update(query, name, university, cgpa);
		System.out.println(
				"Inserted record is :" + "\nName : " + name + "\nUniversity : " + university + "\nCGPA : " + cgpa);
	}

	@Override
	public StudentData getStudent(Integer enNo) {
		String query = "select * from STUDENTINFO where en_no = ?";
		StudentData studentData = jdbcTemplate.queryForObject(query, new Object[] { enNo }, new StudentDataMapper());
		return studentData;
	}

	@Override
	public List<StudentData> getAllStudents() {
		String query = "select * from STUDENTINFO";
		List<StudentData> studentList = jdbcTemplate.query(query, new StudentDataMapper());
		return studentList;
	}

	@Override
	public void updateStudent(Integer enNo, Double cgpa) {
		String query = "update STUDENTINFO set cgpa = ? where en_no = ?";
		jdbcTemplate.update(query, cgpa, enNo);
		StudentData studentData = getStudent(enNo);
		System.out.println("Updated record is :" + "\nEnrollment No : " + studentData.getEnNo() + "\nName : "
				+ studentData.getName() + "\nUniversity : " + studentData.getUniversity() + "\nCGPA : "
				+ studentData.getCgpa());
	}

	@Override
	public void deleteStudent(Integer enNo) {
		String query = "delete from STUDENTINFO where en_no = ?";
		jdbcTemplate.update(query, enNo);
		System.out.println("After Deletion all records are :");
		getAllStudents().forEach(studentData -> System.out
				.println("Enrollment No : " + studentData.getEnNo() + "\nName : " + studentData.getName()
						+ "\nUniversity : " + studentData.getUniversity() + "\nCGPA : " + studentData.getCgpa()));
	}

}
