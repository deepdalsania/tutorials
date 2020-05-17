package utilpck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Comparator {

	public static void main(String[] args) {
		List<Student1> list = new ArrayList<>();
		list.add(new Student1(110, "Jai", 20));
		list.add(new Student1(106, "Vir", 22));
		list.add(new Student1(104, "Abhi", 26));

		// sort by name
		Collections.sort(list, Comparator.comparing(Student1::getName));
		System.out.println("Sort by name");
		list.forEach(System.out::println);

		// sort by age
		Collections.sort(list, Comparator.comparing(Student1::getAge));
		System.out.println("\nSort by age");
		list.forEach(System.out::println);
	}
}

class Student1 {

	protected int en_no, age;
	protected String name;

	public Student1(int en_no, String name, int age) {
		this.en_no = en_no;
		this.name = name;
		this.age = age;
	}

	public int getEn_no() {
		return en_no;
	}

	public void setEn_no(int en_no) {
		this.en_no = en_no;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student1 [en_no=" + en_no + ", age=" + age + ", name=" + name + "]";
	}

}
