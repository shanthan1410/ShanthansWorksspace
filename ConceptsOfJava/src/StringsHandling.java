
public class StringsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Payment $100 paid
		 String is a pre defined class which has lot of methods which helps to deal with text.
		 below syntax can be only used for string class.
		instead of using memory allocation syntax i.e no need of new memeory allocator*/
		
		String str ="Payment $100 paid";
		System.out.println(str.charAt(8));
		
		String str1= "Payments $100 paid";
		System.out.println(str1.indexOf("$"));
		
		System.out.println(str.substring(8));
	
		
		//print string in reverse
		// Given a string how you say its a palindrome ex: madam
		String s = "madam";
		String r ="";
		System.out.println(s.length());
		System.out.println(s.length()-1);
		
		  for(int i=s.length()-1;i>=0;i--) {
			  // In below sysout the output wil be coming vertical way but we need to make it in horizontal way to assert 
			 // System.out.println(s.charAt(i)); 
			  
			  r = r + s.charAt(i); 

			//concatinating of two strings can be done by + sign
						  // The concat() method is used to join two or more strings. 
						  //This method does not change the existing strings, 
						  //but returns a new string containing the text of the joined strings.
						  //For above in first loop r =m later it will be r=m+a=ma: r=ma+d=mad; r=mad+a=mada; r=mada+m=madam; r=madam

			  
			  }
		  System.out.println(r);
		  System.out.println(s);
		  
		  if(s.equals(r)) {
			  System.out.println("madam is palindrome");  
		  }
		  else
			  System.out.println("madam is not palindrome");  
		  
		  //practice from 0 zero index madam
		  for(int i=0;i<=s.length()-1;i++) {
			  System.out.println(s.charAt(i)); 
			  
			/*
			 * or for(int i=0;i<s.length();i++) 
			 * { System.out.println(s.charAt(i));
			 * are same
			 */
		  }	  
	}
}
		
	


