package file;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Token {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter any numbers : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer s1 = new StringTokenizer(s);
		System.out.println("Total Tokens : "+s1.countTokens());
		int count = 0;
		while (s1.hasMoreElements()) {
			String t = (String) s1.nextElement();
			System.out.println("Token is : "+t);
			
			if (t.contains("4")) {
				count++;
			}

		}
		
		System.out.println("Repeated Tokens : "+count);
	}

}
