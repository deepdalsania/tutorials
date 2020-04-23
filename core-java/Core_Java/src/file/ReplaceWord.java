package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceWord {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f = new File("D:/DEEP/forth.txt");
		//f.createNewFile();
		FileWriter fw = new FileWriter(f);
		fw.write("Word1 is Word1");
		System.out.println("Before Replacing : "+" Word1 is Word1");
		fw.close();
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		
		System.out.println("After Replacing : " + s.replaceAll("Word1", "Word2"));
		br.close();
		fr.close();
		FileWriter fw1 = new FileWriter(f);
		
		fw1.write(s.replaceAll("Word1", "Word2"));
		fw1.close();
		
		
	}

}
