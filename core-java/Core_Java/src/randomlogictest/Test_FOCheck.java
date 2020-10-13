package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test_FOCheck {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s = "This will be added to abc.txt";
		char c[] = s.toCharArray();
		int x = s.length();
		FileOutputStream fo;
		try {
			fo = new FileOutputStream("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e);
			return;
		}
		for (int i = 0; i < x; i++) {
			fo.write(c[i]);
		}
		fo.close();
	}

}
