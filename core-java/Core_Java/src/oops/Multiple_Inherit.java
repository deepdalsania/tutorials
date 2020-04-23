package oops;

import java.text.DecimalFormat;

import java.util.Scanner;


public class Multiple_Inherit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Total t = new Total();
		t.get_s();
		t.disp_s();
		t.disp_m();
		t.disp_r();
		
	}

}

class Student
{
	protected long en_no;
	protected String name;
	
	Scanner s = new Scanner(System.in);
	
	public void get_s(){
		System.out.println("Enter the details of Student: ");
		System.out.println("Enter the name of student: ");
		name = s.next();
		
		System.out.println("Enter the ENROLMENT NUMBER of student: ");
		en_no = s.nextLong();
		
	}
	public void disp_s(){
		
		System.out.println("NAME: "+name);
		System.out.println("ENROLMENT NUMBER= "+en_no);
		
	}
}

interface Result
{
	public float m1 = 78f , m2 = 89f , m3 = 90f;
	public void disp_m();
	
}
interface Result1
{
	void disp_r();
	
}
class Total   extends Student implements Result,Result1 
{
	DecimalFormat f = new DecimalFormat("##.00");
	public void disp_m() {
		
		System.out.println("Marks of three subjects is: ");
		System.out.println("OOPJ = "+m1+"\n"+"SP = "+m2+"\n"+"CG = "+m3);
		
	}

	public void disp_r() {
		
		float total , avg;
		total = m1 + m2 + m3 ;
		System.out.println("TOTAL = "+total);
		avg = total / 3;
		System.out.println("AVERAGE = "+f.format(avg));
		
	} 

}