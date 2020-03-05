package SuperKeyWord;

public class FatherClass {
	
	public FatherClass() {
		System.out.println("parent class constructor");
	}
	
	
	//Method overloading: In a class if we have same methods with diffrent parametres
	//constructor overloading can be also done with diffrent parameters
	
	public  void father() {
		System.out.println("Madhu SUdhan Reddy");
	}
	
	public void father(String str, String str1) {
		System.out.println("Madhu SUdhan Reddy");
	}
	
	public void father(String str, String str1, String str2) {
		System.out.println("Madhu SUdhan Reddy");
	}
	

	String name = "Madhu Sudhan Reddy";
	
	String Location= "Bhel";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

	}

}
