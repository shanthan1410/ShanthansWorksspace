package Inheritance;

public class son extends Grandfather{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		son a =new son();
		a.Name();
	}
	
	
	public static void name() {
		System.out.println("MadhuSudhanReddy");
	}
	
	public void adress() {
		System.out.println(" Bhel");
		
		Grandfather.Adress();
		//When mehod is written in static no need to create obj for that class we can directly call method using classname.
		
		son.name();
	}

}
