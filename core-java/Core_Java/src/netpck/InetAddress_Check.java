package netpck;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_Check {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		/*inetAdress class has no  visible constructor. therefore to create an instance of this class we have to use one of it
		 * instance method. the object created by using instance method are used to invoke factory methods which returns required 
		 * entities.*/
		InetAddress ip = InetAddress.getLocalHost();/*getByName , getAllByName , getByAddress we can use any one of them to create
		 												an instance of IneAddress class*/
		System.out.println("LocalHost IP : "+ip.getHostAddress());
		System.out.println("LocalHost Name : "+ip.getHostName());
		String s = "www.google.com" ; 
		System.out.println("isAnyLocalAddress : "+ip.isAnyLocalAddress());
		InetAddress ip1 = InetAddress.getByName(s);
		System.out.println("IP of Google : "+ip1.getHostAddress());
		System.out.println("Host Name : "+ip1.getHostName());
		System.out.println("getCanonicalHostName : "+ip1.getCanonicalHostName());
		System.out.println("isLoopbackAddress :"+ip1.isLoopbackAddress());
		//System.out.println("getAddress"+ip1.getAddress());
	}

}
