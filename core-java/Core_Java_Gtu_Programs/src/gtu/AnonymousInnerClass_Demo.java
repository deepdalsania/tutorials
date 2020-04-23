package gtu;

public class AnonymousInnerClass_Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample()
		{
			void disp(){
				System.out.println("anonymous class smaple");
			}
		};
	s.disp();
	new Sample().disp();
	}

}
class Sample{
	void disp(){
		System.out.println("actual class sample");
	}
}