package gtu;

public class Win18Q_4B2OR {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		equality obj = new equality();
		obj.x = 5;
		obj.y = 5;
		System.out.println(obj.isequal());
	}

}
class equality
{
	int x , y;
	
	boolean isequal(){
		return(x == y);
	}
}
