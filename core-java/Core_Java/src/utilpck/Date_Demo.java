package utilpck;

import java.util.Date;

public class Date_Demo {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println("1)Current date : "+d);
		
		Date d1 = new Date(4000); // default date + 4000 millisecond
		System.out.println("2)Deafault Date : "+d1);
		
		long t = System.currentTimeMillis();
		System.out.println("currentTimeMillis : "+t);
		
		Date d2 = new Date(t); 
		System.out.println("3)Current date : "+d2);// default date + currentTimeMillis 

		System.out.println("4)compareTo : "+d2.compareTo(d));
		Date d3 = new Date();
		System.out.println("5)getDate : "+d3.getDate());
		System.out.println("6)getDay : "+d3.getDay());
		System.out.println("7)getHours : "+d3.getHours());
		System.out.println("8)getMinutes : "+d3.getMinutes());
		System.out.println("9)getTimezoneOffset : "+d3.getTimezoneOffset());
		System.out.println("10)toGMTString : "+d3.toGMTString());
		System.out.println("11)toLocaleString : "+d3.toLocaleString());
	}

}
