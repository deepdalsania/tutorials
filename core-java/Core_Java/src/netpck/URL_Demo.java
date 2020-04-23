package netpck;

import java.net.MalformedURLException;
import java.net.URL;

public class URL_Demo {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
			  
			URL url=new URL("https://www.tutorialspoint.com/mongodb/mongodb_advantages.htm");  
			//1/11/2019  
			System.out.println("Protocol: "+url.getProtocol());
			System.out.println("Port Number: "+url.getPort());
			System.out.println("getDefaultPort: "+url.getDefaultPort()); 
			System.out.println("getAuthority: "+url.getAuthority()); 
		//	System.out.println("Host Name: "+url.getHost());  
			System.out.println("getPath: "+url.getPath());
		//	System.out.println("File Name: "+url.getFile());  
			System.out.println("getQuery: "+url.getQuery());
			System.out.println("getRef: "+url.getRef());
			System.out.println("toExternalForm: "+url.toExternalForm());
			
			
			  
	}

}
