package gtu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum18Q_4C {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fo = new FileOutputStream("D:/DEEP/java8.txt");
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number for range : ");
		int n = Integer.parseInt(br.readLine());
		
		System.out.println("<< Even Number >>");
		for (int i = 1; i < n ; i++ ) {
			if(i % 2 == 0){
			bo.write(i);
			}
		}
		bo.close();
		fo.close();
		FileInputStream fi = new FileInputStream("D:/DEEP/java8.txt");
		BufferedInputStream bi = new BufferedInputStream(fi);
		BufferedOutputStream bo1 = new BufferedOutputStream(new FileOutputStream("D:/DEEP/java9.txt"));
		int i;
		do{
		i = bi.read();
		if (i != -1) {
			bo1.write(Character.toLowerCase((char)i));
			}
		}while(i != -1);
		
		fi.close();
		bi.close();
		bo1.close();
	
	}

}
