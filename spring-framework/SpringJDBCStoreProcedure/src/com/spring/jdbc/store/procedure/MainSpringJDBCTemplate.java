package com.spring.jdbc.store.procedure;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringJDBCTemplate {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringJDBCStoreProcedure.xml")) {
			StudentDataJDBCTemplate stuJdbcTemplate = (StudentDataJDBCTemplate) context.getBean("studentJdbcTemplate");
			System.out.println("<---- Record Insertion ---->");
			stuJdbcTemplate.insertStudent("Foo", "Stanford", 8.89d);
			stuJdbcTemplate.insertStudent("Bar", "Stanford", 8.87d);
			stuJdbcTemplate.insertStudent("Buz", "Stanford", 9.21d);
			stuJdbcTemplate.insertStudent("Qux", "Stanford", 8.85d);

			System.out.println("<---- List All Records ---->");
			stuJdbcTemplate.getAllStudents()
					.forEach(studentData -> System.out.println("Enrollment No : " + studentData.getEnNo() + "\nName : "
							+ studentData.getName() + "\nUniversity : " + studentData.getUniversity() + "\nCGPA : "
							+ studentData.getCgpa()));

			System.out.println("<---- Get Single Record ---->");
			StudentData studentData = stuJdbcTemplate.getStudent(1);
			System.out.println("Enrollment No : " + studentData.getEnNo() + "\nName : " + studentData.getName()
					+ "\nUniversity : " + studentData.getUniversity() + "\nCGPA : " + studentData.getCgpa());

			System.out.println("<---- Record Updation ---->");
			stuJdbcTemplate.updateStudent(3, 9.5d);

			System.out.println("<---- Record Deletion ---->");
			stuJdbcTemplate.deleteStudent(4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
