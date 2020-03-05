package ArraysConcept;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Given a string how we say whether its a palindrome or not
		String s ="madam";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
			//but two verify madam is palindrom we need to verify s and reserved string is equal 
			}
		System.out.println();// since we are using print above ; next when we use println the first
		//character will be same line of print, so if we use println again it satrts from new line
		
		String r ="madam";
		String p ="";
	   for( int i=s.length()-1;i>=0;i--) {
		System.out.println(r.charAt(i));
		p=p+r.charAt(i);
		}
	   System.out.println(s);
	   System.out.println(p);
	   if(r.equals(p)) {
		   System.out.println("Plaindrome verified");
	   }
	}
}
