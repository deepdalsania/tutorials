package com.spring.jdbc.store.procedure;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

public class StudentDataJDBCTemplate implements StudentDAO {

	private DataSource dataSource;
	private SimpleJdbcCall jdbcCall;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcCall = new SimpleJdbcCall(ds).withProcedureName("getSingleStudentData");
	}

	@Override
	public void insertStudent(String name, String university, Double cgpa) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String query = "insert into STUDENTINFO (name, university, cgpa) values (?, ?, ?)";
		// update : is used to insert, update and delete records.
		jdbcTemplate.update(query, name, university, cgpa);
		System.out.println(
				"Inserted record is :" + "\nName : " + name + "\nUniversity : " + university + "\nCGPA : " + cgpa);
	}

	@Override
	public StudentData getStudent(Integer enNo) {
		SqlParameterSource in = new MapSqlParameterSource().addValue("in_en_no", enNo);
		Map<String, Object> out = jdbcCall.execute(in);
		StudentData studentData = new StudentData();
		studentData.setEnNo(enNo);
		studentData.setName(out.get("out_name").toString());
		studentData.setUniversity(out.get("out_university").toString());
		studentData.setCgpa(Double.parseDouble(out.get("out_cgpa").toString()));
		return studentData;
	}

	@Override
	public List<StudentData> getAllStudents() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String query = "select * from STUDENTINFO";
		List<StudentData> studentList = jdbcTemplate.query(query, new StudentDataMapper());
		return studentList;
	}

	@Override
	public void updateStudent(Integer enNo, Double cgpa) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String query = "update STUDENTINFO set cgpa = ? where en_no = ?";
		jdbcTemplate.update(query, cgpa, enNo);
		StudentData studentData = getStudent(enNo);
		System.out.println("Updated record is :" + "\nEnrollment No : " + studentData.getEnNo() + "\nName : "
				+ studentData.getName() + "\nUniversity : " + studentData.getUniversity() + "\nCGPA : "
				+ studentData.getCgpa());
		// return;
	}

	@Override
	public void deleteStudent(Integer enNo) {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String query = "delete from STUDENTINFO where en_no = ?";
		jdbcTemplate.update(query, enNo);
		System.out.println("After Deletion all records are :");
		getAllStudents().forEach(studentData -> System.out
				.println("Enrollment No : " + studentData.getEnNo() + "\nName : " + studentData.getName()
						+ "\nUniversity : " + studentData.getUniversity() + "\nCGPA : " + studentData.getCgpa()));
	}

}
