package DateClassConcepts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How to retrive current date and current time
		
Date d =new Date();//Date class comes from util pacakage
	System.out.println(d.toString());
	
	// result will be in "Fri Jan 24 17:23:06 EST 2020" format
	 
	// But we need in mm/dd/yyyy or mm/dd/yyyy HH:MM:SS
	SimpleDateFormat sdf= new SimpleDateFormat("M/d/yyyy");
	SimpleDateFormat sd= new SimpleDateFormat("M/d/yyyy hh:mm:ss");
	System.out.println(sdf.format(d));
	System.out.println(sd.format(d));
	
	// www.tutorialspoint.com/java/java_date_time.htm
	
	}

}
