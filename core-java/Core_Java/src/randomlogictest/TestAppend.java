package test;

public class TestAppend {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s = new String("deep");
		StringBuffer s1 = new StringBuffer();
		s1.append(s);
		System.out.println(s1);*/
		String[] a = new String[]{"deep","bharatbhai","bharatiben","dalsania"};
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "]:" + a[i]);
		}
		StringBuffer sb = new StringBuffer();
		if(a.length > 0){
			
			sb.append(a[0]);
		for (int i = 0; i < a.length; i++) {
			sb.append(" ").append(a[i]);
			}
		}                                                                                                                                 
		//System.out.println("String = "+sb.reverse().toString()); reverse the string
		
		
	}
	
	

}
