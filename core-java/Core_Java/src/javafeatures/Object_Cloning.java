package javafeatures;

public class Object_Cloning implements Cloneable{
	
	int en_no;
	String name;
	public Object_Cloning(int en_no , String name) {
	this.en_no = en_no;
	this.name = name;
	}
	public Object clone()throws java.lang.CloneNotSupportedException  {
		return super.clone();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Object_Cloning oc = new Object_Cloning(02,"deep");
			Object_Cloning oc1 = (Object_Cloning)oc.clone();
			
			System.out.println(oc.en_no+" "+oc.name);
			System.out.println(oc1.en_no+" "+oc1.name);
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
