package gtu;

abstract class Vegetables{
	String veg_color;
	String veg_name;
}
class Potato extends Vegetables{
	public Potato() {
		// TODO Auto-generated constructor stub
	 veg_color = "yellow";
	 veg_name = "Potato";
	}
	public String toString() {
		return(veg_color);
		
	}
}
class Brinjal extends Vegetables{
	public Brinjal() {
		// TODO Auto-generated constructor stub
	veg_color = "purple"; 
	veg_name = "Brinjal";
	}
	public String toString() {
		return(veg_color);
	}
}
class Tomato extends Vegetables{
	public Tomato() {
		// TODO Auto-generated constructor stub
	veg_color = "red";
	veg_name = "Tomato";
	}
	public String toString() {
		return(veg_color);
	}
}

public class Sum16Q_2BOR {
	public static void main(String[] args) {
		Potato p = new Potato();
		Brinjal b = new Brinjal();
		Tomato t = new Tomato();
		
		System.out.println(p.veg_name+" Color is "+p.veg_color);
		System.out.println(b.veg_name+" Color is "+b.veg_color);
		System.out.println(t.veg_name+" Color is "+t.veg_color);
	}
}
