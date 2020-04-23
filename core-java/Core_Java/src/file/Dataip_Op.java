package file;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Dataip_Op {
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File("D:/DEEP/seven.txt");
		FileOutputStream fo = new FileOutputStream(f);
		DataOutputStream d = new DataOutputStream(fo);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number for range : ");
		int n = Integer.parseInt(br.readLine());
		
		System.out.println("<< Even Number >>");
		for (int i = 1; i < n ; i++ ) {
			if(i % 2 == 0){
			d.write(i);
			}
		}
		d.flush();
		d.close();
		FileInputStream fi = new FileInputStream(f);
		DataInputStream di = new DataInputStream(fi);
		int a;
		while((a = di.read()) != -1){
			System.out.println(a + " ");
		}
		
		di.close();
	}

}
