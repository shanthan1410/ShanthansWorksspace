package Inheritance;

public class grandson extends son{
	
	/* This is called multiple inheritance 
	 * if granson extends to granfather we cant methods of son
	 * if this class extends to son it can have both grandfather and son
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		grandson s =new grandson();
		s.Adress();
		s.name();
		
	}

}
