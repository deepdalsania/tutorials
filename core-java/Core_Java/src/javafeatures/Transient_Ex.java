package javafeatures;

//Java program to demonstrate transient keyword 
//Filename Test.java 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
class Transient_Ex implements Serializable {
	// Normal variables
	int i = 10, j = 20;

	// Transient variables
	transient int k = 30;

	// Use of transient has no impact here
	transient static int l = 40;
	transient final int m = 50;

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
		Transient_Ex input = new Transient_Ex();

		// serialization
		FileOutputStream fos = new FileOutputStream("abc.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(input);

		// de-serialization
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Transient_Ex output = (Transient_Ex) ois.readObject();
		System.out.println("i = " + output.i);
		System.out.println("j = " + output.j);
		System.out.println("k = " + output.k);
		System.out.println("l = " + output.l);
		System.out.println("m = " + output.m);
		oos.close();
		ois.close();
	}
}
