package oops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Multi_Interface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annual a = new Annual();
		a.get_s();
		a.disp_s();
		a.disp_e();
		a.disp_i();
		a.disp_u();
		
	}

}

class Stu
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

interface External
{
	public int e1 = 98 , e2 = 89 , e3 = 90;
	public void disp_e();
	
}
interface Internal
{
	int i1 = 30 , i2 = 29 , i3 = 28;
	void disp_i();
	
}
interface University extends External,Internal
{
	int u = 9;
	void disp_u();
}
class Annual extends Stu implements University
{
	DecimalFormat f = new DecimalFormat("##.00");
	
	public void disp_e() {
		System.out.println("External Marks of three subjects is: ");
		System.out.println("OOPJ = "+e1+"\n"+"SP = "+e2+"\n"+"CG = "+e3);
		
	}
	public void disp_i() {
		System.out.println("Internal Marks of three subjects is: ");
		System.out.println("OOPJ = "+i1+"\n"+"SP = "+i2+"\n"+"CG = "+i3);
		
	} 
	public void disp_u() {
		float tot_e , tot_i ,  avg , total;
		tot_e = e1 + e2 + e3;
		tot_i = i1 + i2 + i3;
		//System.out.println("TOTAL = "+total);
		avg = (tot_e * 70) / 100;
		total = avg + tot_i;
		System.out.println("Total marks out of 300 is  = "+f.format(total));
		System.out.println("Extra Curricular Activity marks out of 10 is = "+u);
	}

	

	

}
