package javafeatures;

public class StringInternExample{  
	public static void main(String args[]){  
	String st1=new String("hello");  
	String st2="hello";  
	String st3=st1.intern();//returns string from pool, now it will be same as s2  
	System.out.println(st1==st2);//false because reference variables are pointing to different instance  
	System.out.println(st2==st3);//true because reference variables are pointing to same instance
	System.out.println();
	String s1 = "Javatpoint";  
    String s2 = s1.intern();  
    String s3 = new String("Javatpoint");  
    String s4 = s3.intern();          
    System.out.println(s1==s2); // True  
    System.out.println(s1==s3); // False  
    System.out.println(s1==s4); // True       
    System.out.println(s2==s3); // False  
    System.out.println(s2==s4); // True        
    System.out.println(s3==s4); // False  
	}
}  
