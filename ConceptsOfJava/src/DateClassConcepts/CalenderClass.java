package DateClassConcepts;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Calendar cal=Calendar.getInstance();
	SimpleDateFormat sd= new SimpleDateFormat("M/d/yyyy hh:mm:ss");
	System.out.println(sd.format(cal.getTime()));
	System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	
	System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	System.out.println(cal.get(Calendar.AM_PM));
	System.out.println(cal.get(Calendar.MINUTE));
	
	// If it am its print 0 if pm itprints 1
		/*
		 * Using calender class we can only extract date from from "1/24/2020 06:15:29"
		 * we dont have same option in date class
		 */
	}

}
