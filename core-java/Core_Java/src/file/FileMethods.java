package file;

import java.io.File;
import java.io.IOException;

public class FileMethods {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("D:/DEEP");
		f.mkdirs();
		File [] f2 = f.listFiles();
		
		for (int i = 0; i < f2.length; i++) {
			System.out.println(f2[i]);
			
		}
		System.out.println("count : "+f2.length);
		
		File f1 = new File(f,"first.txt");
		f1.createNewFile();
		System.out.println("3)getAbsolutePath : "+f1.getAbsolutePath());
		System.out.println("4)getCanonicalPath : "+f1.getCanonicalPath());
		System.out.println("5)getParent : "+f1.getParent());
		
		System.out.println("6)isDirectory : "+f.isDirectory());
		System.out.println("7)isFile : "+f1.isFile());
		System.out.println("8)canRead : "+f1.canRead());
		System.out.println("9)canWrite : "+f1.canWrite());
		System.out.println("10)isHidden : "+f1.isHidden());
	}

}
