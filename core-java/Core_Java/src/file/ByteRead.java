package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteRead {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("D:/DEEP/third.txt");
		FileOutputStream fo = new FileOutputStream(f);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number for range : ");
		int n = Integer.parseInt(br.readLine());
		
		System.out.println("<< Even Number >>");
		for (int i = 1; i < n ; i++ ) {
			if(i % 2 == 0){
			fo.write(i);
			}
		}

		fo.close();
		FileInputStream fi = new FileInputStream(f);
		int a;
		while((a = fi.read()) != -1){
			System.out.println(a + " ");
		}
		
		fi.close();
		
	}

}
