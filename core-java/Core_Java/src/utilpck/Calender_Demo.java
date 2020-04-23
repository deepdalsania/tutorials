package utilpck;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calender_Demo {

	/**
	 * @param args
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calendar c = Calendar.getInstance();
		GregorianCalendar gc = (GregorianCalendar) GregorianCalendar.getInstance();
		System.out.println("1)Current time : "+c.getTime());
		System.out.println("2)getFirstDayOfWeek : "+c.getFirstDayOfWeek());
		System.out.println(" : "+c.getActualMaximum(1));
		System.out.println(" : "+c.getActualMinimum(2));
		System.out.println(" : "+c.getGreatestMinimum(1));
		System.out.println(" : "+c.getLeastMaximum(6));
		System.out.println(" : "+c.getMaximum(5));
		System.out.println("3)getMinimalDaysInFirstWeek : "+c.getMinimalDaysInFirstWeek());
		System.out.println(" : "+c.getMinimum(5));
		System.out.println("4)getTimeInMillis : "+c.getTimeInMillis());
		System.out.println("5)AM : "+c.AM_PM);
		System.out.println("6)DAY_OF_MONTH : "+c.DAY_OF_MONTH);
		System.out.println("7)DAY_OF_WEEK_IN_MONTH : "+c.DAY_OF_WEEK_IN_MONTH);
		System.out.println("8)DAY_OF_YEAR : "+c.DAY_OF_YEAR);
		System.out.println("DST_OFFSET : "+c.DST_OFFSET);
		System.out.println("ERA : "+c.ERA);
		System.out.println("FIELD_COUNT : "+c.FIELD_COUNT);
		System.out.println("UNDECIMBER : "+c.UNDECIMBER);
		System.out.println("9)WEEK_OF_MONTH : "+c.WEEK_OF_MONTH);
		System.out.println("10)WEEK_OF_YEAR : "+c.WEEK_OF_YEAR);
		System.out.println("ZONE_OFFSET : "+c.ZONE_OFFSET);
		System.out.println("11)isLeapYear : "+gc.isLeapYear(2016));
		System.out.println("isLenient : "+c.isLenient());
		System.out.println("1)isLenient : "+gc.isLenient());
		
	/*	String s = "	";
		int a = 0;
		try {
		a	= Integer.parseInt(s);
				
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("12 :"+a);
		}*/
		

	
	}

}
