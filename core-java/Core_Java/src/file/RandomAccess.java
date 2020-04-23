package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class RandomAccess {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("D:/DEEP/nine.txt");
		f.createNewFile();
		RandomAccessFile rm = new RandomAccessFile(f,"rw");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name : ");
		
		rm.writeUTF(br.readLine());
		rm.seek(0);
		System.out.println("Name is  : "+rm.readUTF());
	//	System.out.println("Pointer : "+rm.getFilePointer());
		rm.seek(0);
		byte[] b = new byte[(int) rm.length()];
		rm.readFully(b, 0, b.length);
		String s = new String(b);
		System.out.println("Name is : "+s);
		rm.seek(s.length());
		rm.writeInt(2);
		rm.seek(s.length());
		System.out.println("readInt : "+rm.readInt());
		System.out.println("Pointer : "+rm.getFilePointer());
		rm.close();
	}

}
