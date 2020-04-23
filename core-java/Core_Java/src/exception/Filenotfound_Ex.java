package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;



public class Filenotfound_Ex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream instream = null ;
		FileOutputStream outstream = null;
		
		try {
			File f = new File("D:\\Java.txt");
			
			File f1 = new File("D:\\Class.txt");
			
			instream = new FileInputStream(f);
			outstream = new FileOutputStream(f1);
			
			byte[]  buffer = new byte[1024];
			
			int length;
			
			while ((length = instream.read(buffer)) > 0){
				outstream.write(buffer , 0 , length);
			}
			
			instream.close();
			outstream.close();
			
			System.out.println("File Copied");
			
			
		} catch (Exception e) //(FileNotFoundException e) then error generate unhandled IO exception at while loop
		{
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
