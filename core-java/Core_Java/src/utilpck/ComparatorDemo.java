package utilpck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(110, "Jai", 20));
		list.add(new Student(106, "Vir", 22));
		list.add(new Student(104, "Abhi", 26));

		System.out.println("Sorting by Name");
		// we are not using stream then we can do that like this
		Collections.sort(list, new NameComparator());
		// list.forEach(student -> System.out.println(student));
		list.forEach(System.out::println);

		System.out.println("\nSorting by Age");
		Collections.sort(list, new AgeComparator());
		list.forEach(System.out::println);
		/*
		 * If we are using stream API then we can direct use sorted for each but in this
		 * we can't specify field for sorting
		 */
		/*
		 * list.stream().forEachOrdered(name -> System.out.println(name));
		 * list.stream().forEachOrdered(name -> System.out.println(name));
		 */
	}
}

class Student {

	protected int en_no, age;
	protected String name;

	public Student(int en_no, String name, int age) {
		this.en_no = en_no;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [en_no=" + en_no + ", age=" + age + ", name=" + name + "]";
	}

}

class NameComparator implements Comparator<Student> {

	// compare by name
	@Override
	public int compare(Student s1, Student s2) {
		// compareTo return -1(lessthan),0(equal) and 1(graterthan)
		return s1.name.compareTo(s2.name);
	}

}

class AgeComparator implements Comparator<Student> {

	// compare by age
	@Override
	public int compare(Student s1, Student s2) {
		if (s1.age == s2.age) {
			return 0;
		} else if (s1.age > s2.age) {
			return 1;
		} else {
			return -1;
		}
	}
}