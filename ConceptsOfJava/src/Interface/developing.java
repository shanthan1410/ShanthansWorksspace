package Interface;

/*we can call more than one interface in a class just new add interface by seperating with coma
 * This class is noe reponsible for two clients*/
public class developing implements Bankingclient, DomainClient {
	
	//now this class is responsible to implement ALL methods of bankingclient Interface
	
	/*
	 * We are taking an agreement that i am responsible for all the methods present
	 * in the bankingclient interface and keyword for that is interface
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				/* It is an client agreement between client methods and class implementation
				 * interface has method but doenot have any body its just a signature
				 * Only Classes can implement the methods present in interface
				 * i.e we need to create class like present class and need to implement all methods of interface class
				 * 
				 * 
				 * 
				 * */
	developing d =new developing();
	d.chekingbalance();
	d.transderbalance();
	d.paycreitcard();
	d.login();
	Bankingclient dr =new developing();
	dr.paycreitcard();
		/*
		 * This is called run time polymorpysm 
		 * creating our obj and in runtime calling
		 * the stuff what the return type is assigned to that
		 *  we can cALL parrticular methods of a particular interface
		 * above bankingclient is  return type
		 */
		/*
		 * dr ojects can call only methodspresent in Bankingclient but cannot call login
		 * method ,it totall depends on on return type above dr is repsonsible for
		 * calling methods of only bankingclass When we use extends key word then d is
		 * responsible for calling methods of both classes
		 */
	
	DomainClient dc=new developing();
	dc.investment1();
	
		/* now domianclient will come and only focus on above dc object so that he can et his required methods
		 * since he is not intrested in other methods*/
	
	// If we want to use all the methods of the class use d oject which has return type as developingClass
	}

	@Override
	public void paycreitcard() {
		// TODO Auto-generated method stub
		System.out.println("pay creit card implemented");
	}

	@Override
	public void transderbalance() {
		// TODO Auto-generated method stub
		System.out.println("transder balance implemented");
	}

	@Override
	public void chekingbalance() {
		// TODO Auto-generated method stub
		System.out.println("cheking balance implemented");
	}
	
	// we can also implement other methods apart from banking client interface methods
	public void login() {
		System.out.println("logged in");
	}

	@Override
	public void investment1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void investment2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void investment3() {
		// TODO Auto-generated method stub
		
	}

}
