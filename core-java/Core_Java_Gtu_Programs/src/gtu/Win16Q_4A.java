package gtu;

public class Win16Q_4A {
	public static void main(String[] args) {
		Win16Q_4A w = new Child(); /*this is known as upcasting of object.if write Win16Q_4A(); instead of new Child() then we cannot get output as Casting successfully
									because we dont upcast then the condition w instanceof Child will be wrong so check method will not
									invoke.*/	
		Child.show(w);
			}
}
class Child extends Win16Q_4A{
	void check(){
		System.out.println("Casting successfully");
	}
	public static void show(Win16Q_4A w){
		if(w instanceof Child){
			//Child c =(Child)w;this is known as downcasting of an object but here it is not require.
			
			new Child().check();
		}
		
	}
	

}
/* Parent p = new Child(); upcasting
 * Child c = new Parent(); compile time error
 * Child c = (Child) new Parent()or object of Parent; downcsting but throws ClassCastException at runtime*/
