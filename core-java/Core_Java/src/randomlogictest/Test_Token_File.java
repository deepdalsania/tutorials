package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Test_Token_File {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*if we use pwintwriter to print in file then we have to pass file obj to pwintwriter and mothod to write is println , print
		 * write or we want to print on console then pass system.out into printwriter and the method is write*/
		/*here i use printwriter for console o/p and printstream for file o/p*/
		PrintStream ps = new PrintStream("D:/DEEP/java2.txt");
		PrintWriter pw = new PrintWriter(System.out);
		System.out.println("Enter any random number");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s);
		ps.println("Total Tokens : "+st.countTokens());
		pw.write("Total Tokens : "+st.countTokens()+"\n");
		int count = 0 ;
		while (st.hasMoreElements()) {
			
			String t = (String) st.nextElement();
			pw.write("Token is : "+t+"\n");
			if(t.contains("5")){
				count++ ;
			}
		}
		ps.println("Occurance of 5 is : "+count);
		ps.flush();
		ps.close();
		pw.write("Occurance of 5 is : "+count);
		pw.flush();
		pw.close();
	}

}
