
package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;



public class CharRead {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("D:/DEEP/second.txt");
		FileWriter fw = new FileWriter(f);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your name : ");
		String s1 = br.readLine();
		fw.write(s1);
		br.close();
		fw.close();
		
		FileReader fr = new FileReader(f);
		BufferedReader br1 = new BufferedReader(fr);
		String c = br1.readLine();
		while(c  != null){
			System.out.println("Name : "+c);
			c = br1.readLine();
		
		}
		br1.close();
		fr.close();
	}
}
