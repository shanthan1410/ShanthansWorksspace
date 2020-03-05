package Collections;

import java.util.ArrayList;

import org.testng.Assert;

public class Arraylistexample {

	/* Collections- List-ArrayList 
	 * List is an interface
	 * Array List is class which implements List Interface
	 * Array list has a dynamic size where we can increase by adding
	 * or decrease by removing
	 * All the classes which implements list interface can accept duplicate values
	 * 
	 * ArrayList, LinkedList, Vector- Implementing List interface
	 * 
	 * Array have fixed size where as arrayList can grow dynamically
	 * You can access and insert any value in any index
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a =new ArrayList<String>();	
		// adds value 
		a.add("Shanthan Reddy Peesari");
		a.add("Java");
		
		//Accepts duplicate value too
		a.add("Java");
		System.out.println(a);
		
		//Add value at specific index
		a.add(0, "Student");
		System.out.println(a);
		
		//Remove value using  index
		/*
		 * a.remove(1); 
		 * System.out.println(a);
		 */
		
		//Remove value using  String
		/*
		 * a.remove("Java"); 
		 * System.out.println(a);
		 */
		
		// Removes all strings
		/*
		 * a.removeAll(a); 
		 * System.out.println(a);
		 */
		
		//Checks if string is present in the array list
		Assert.assertTrue(a.contains("Student"));
		System.out.println(a.contains("Student"));
		
		// gives string present in index 2
		a.get(2);
		System.out.println(a.get(2));
		
		// gives index of specific string
		a.indexOf("Shanthan Reddy Peesari");
		System.out.println(a.indexOf("Shanthan Reddy Peesari"));
		
		//Checks if array list is empty
		Assert.assertTrue(!a.isEmpty());
		
		//Gives size of array list
		System.out.println(a.size());
		
	}

}
