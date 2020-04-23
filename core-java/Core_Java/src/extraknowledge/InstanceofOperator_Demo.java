package extraknowledge;

public class InstanceofOperator_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		Child c = new Child();
		Child1 c1 = new Child1();
		System.out.println(c instanceof Parent);
		System.out.println(c1 instanceof Parent);
		System.out.println(p instanceof Child);
		System.out.println(p instanceof Child1);
		
		p = c;
		System.out.println(p instanceof Child);
		System.out.println(p instanceof Child1);
		
		p = c1;
		System.out.println(p instanceof Child);
		System.out.println(p instanceof Child1);
	}

}
class Parent{
	
}
class Child extends Parent{
	
}
class Child1 extends Parent{
	
}