package com.spring.declarative.transaction.management;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringDeclarativeTx {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"DeclarativeTransactionManagement.xml")) {
			StudentDataJDBCTemplate stuJdbcTemplate = (StudentDataJDBCTemplate) context.getBean("studentJdbcTemplate");
			System.out.println("<---- Record Insertion ---->");
			stuJdbcTemplate.insertStudent("Foo", "Stanford", 8.89d, 357, 2016);
			stuJdbcTemplate.insertStudent("Bar", "Stanford", 8.87d, 322, 2014);
			stuJdbcTemplate.insertStudent("Buz", "Stanford", 9.21d, 390, 2016);
			stuJdbcTemplate.insertStudent("Qux", "Stanford", 8.85d, 307, 2016);

			System.out.println("<---- List All Records ---->");
			stuJdbcTemplate.getAllStudents()
					.forEach(studentData -> System.out.println("Enrollment No : " + studentData.getEnNo() + "\nName : "
							+ studentData.getName() + "\nUniversity : " + studentData.getUniversity() + "\nYear : "
							+ studentData.getYear() + "\nMarks : " + studentData.getMarks() + "\nCGPA : "
							+ studentData.getCgpa()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
