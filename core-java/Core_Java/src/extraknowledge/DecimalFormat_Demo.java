package extraknowledge;

import java.text.DecimalFormat;

public class DecimalFormat_Demo {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.##"); 
		String formatted = df.format(2.456345); 
		System.out.println("Using DecimalFormat with 2 decimal Precision : "+formatted);
		String strDouble = String.format("%.2f", 2.00023);  
		System.out.println("Without Using DecimalFormat with 2 decimal Precision : "+strDouble);
		
		
	}
}
