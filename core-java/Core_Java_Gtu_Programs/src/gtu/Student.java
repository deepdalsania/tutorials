package gtu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class Student {

	/** win17Q_2COR
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("D:/DEEP/java6.txt");
		f.createNewFile();
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		bw.write("DEEP");
		bw.close();
		BufferedReader br1 = new BufferedReader(new FileReader("D:/DEEP/java6.txt"));
		BufferedWriter pw = new BufferedWriter(new FileWriter("D:/DEEP/java7.txt"));
		int i;
		do{
		i = br1.read();
		if (i != -1) {
			if (Character.isUpperCase((char)i)) {
					pw.write(Character.toLowerCase((char)i));
					
				}else {
					pw.write((char)i);
				}
			}
		}while(i != -1);
		bw.close();
		br1.close();
		pw.close();
	}
}
