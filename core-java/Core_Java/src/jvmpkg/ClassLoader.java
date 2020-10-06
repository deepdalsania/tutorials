package jvmpkg;

public class ClassLoader {

	static {
		System.out.println("static bolcok");
		System.exit(0);
	}

	public static void main(String[] args) {

		System.out.println(String.class.getCanonicalName());

		System.out.println(String.class.getClassLoader());

		System.out.println(Bike.class.getClassLoader());
	}

}
