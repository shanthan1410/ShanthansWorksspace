package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* HashSet , Treeset, LinkedHashset implements Set Interface
		 * Set Interface does not accept duplicate values
		 * There is no gaurentee elements stored in sequential order: Will store in random order
		 * 
		 * For example in a eccommerce web site if we add same two times. then we 
		 * prefer arraylist, we cant use above classes.
		 * 
		 * For example we need to recharge our mobile, we did for first time and it was successfull,
		 * at the same time if you are trying to recharge same mobile, transaction will fail
		 * Then we need to use SetInterface
		 * 
		 * 
		 * 
		 * */
		
		
		HashSet<String> hs =new HashSet<String>();
		//Adds values
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("he");
		hs.add("she");
		//Does not add duplicate values, it rejects
		hs.add("UK");
		System.out.println(hs);
		
		//remove string from hashset
		hs.remove("UK");
		System.out.println(hs);
		
		//Checks if hashset is empty
		System.out.println(hs.isEmpty());
		
		// checks the size of hashset
		System.out.println(hs.size());
		
		
		//iterator concept
		Iterator<String> i=hs.iterator();
		//i.next();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
