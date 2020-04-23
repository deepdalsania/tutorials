package gtu;

import java.io.File;
import java.io.IOException;


public class Sum18Q_3COR {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	//	String s = args[0];
		File f = new File("D:/DEEP",args[0]);
		if (f.isDirectory()) {
			File[] f1 = f.listFiles();
			System.out.println("Files in Directories are : ");
			for (File file : f1) {
				System.out.println(file);
			}
		}else if (f.isFile()) {
			System.out.println("Size of file in bytes : "+f.length());
			
		}
		
		
	}	
	
}
