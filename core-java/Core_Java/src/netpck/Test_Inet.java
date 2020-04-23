package netpck;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test_Inet {

	/**
	 * @param args
	 * @throws UnknownHostException
	 */
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		System.out.println("Enter any site name: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		InetAddress ip = InetAddress.getByName(s);
		System.out.println("IP Address is : " + ip);
		sc.close();
	}

}
