package utilpck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareTwoFields {

	static class CustSortingComaprator implements Comparator<Customer> {

		@Override
		public int compare(Customer c1, Customer c2) {

			int nCompareval = c1.getName().compareTo(c2.getName());
			int aCompareval = String.valueOf(c1.getAge()).compareTo(String.valueOf(c2.getAge()));
			return (nCompareval == 0 ? (aCompareval == 0 ? nCompareval : aCompareval) : nCompareval);
		}

	}

	public static void main(String[] args) {
		List<Customer> list = new ArrayList<>();
		list.add(new Customer(1, 20, "Aasha"));
		list.add(new Customer(2, 22, "Gauri"));
		list.add(new Customer(3, 26, "Mayank"));
		list.add(new Customer(4, 23, "Aasha"));
		list.add(new Customer(5, 26, "Rohit"));
		list.add(new Customer(6, 18, "Aasha"));
		Collections.sort(list, new CustSortingComaprator());
		System.out.println("Sort by name and age");
		list.forEach(customer -> System.out.println(customer));
	}

}

class Customer {

	protected int c_id, age;
	protected String name;

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
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

	public Customer(int c_id, int age, String name) {
		super();
		this.c_id = c_id;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer [c_id=" + c_id + ", age=" + age + ", name=" + name + "]";
	}

}