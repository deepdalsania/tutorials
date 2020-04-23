package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException  {
		// TODO Auto-generated method stub
		System.out.println("<< SERIALIZATION >>");
		File f = new File("D:/DEEP/eight.txt");
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(f));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter name of student : ");
		
		oo.writeObject(br.readLine()+" , ");
		System.out.println("Enter Enrollment number : ");
		long i = Long.parseLong(br.readLine()); 
		oo.writeObject(i+" , ");
		System.out.println("Total marks : ");
		int tot = Integer.parseInt(br.readLine());
		oo.writeObject(tot+" , ");
		float avg = (float)tot/5 ; 
		System.out.println("Average is : "+avg);
		oo.writeObject(avg);
		oo.close();
		
		System.out.println("<< DESERIALIZATION >>");
		ObjectInputStream oi = new ObjectInputStream(new FileInputStream(f));
		/*Object o = oi.readObject()() ;
		while ((o = oi.readObject()) != null) {
			System.out.println(o);
		}*/		
	
		System.out.println(oi.readObject());
		System.out.println(oi.readObject());
		System.out.println(oi.readObject());
		System.out.println(oi.readObject());
		oi.close();
	}

}
