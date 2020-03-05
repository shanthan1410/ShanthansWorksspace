package ArraysConcept;

public class ArayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// is called as line comment
		/* block */ /* is called as block comments */
		
		/*
		 * int a=4; 
		 * or we can write like below
		 * int b; 
		 * b=2;
		 */
		//a is called as variable which as single value 4
		
 //if we want to store multiple value in a single container then we use array 
		//A container which store multiple values of same data type.
		//to define an array we need to create space for that multiple values.
		
		/*
		 * there is a array called a[] and 
		 * the values that go that array is integer datatype
		 * and 5 is the values which stores in array
		 * I.e allocate 5 integer values space in the array
		 */
		
		int a[] = new int[5];
		a[0]=2;
		a[1]=3;
		a[2]=4;
		a[3]=5;
		a[4]=6;
		//Here we are allocating mmory and then assigning values
		
        for(int i=0;i<a.length; i++) {
			//System.out.println(a[i] );
			
			//below sysout will print in console as 2 3 4 5 6
			System.out.print(a[i] + " ");
			
		}
		
		/*Below rather then allocating the memory iam directly assigning values to the array
		memory is dynamically allocated*/
		int b[] = {1,2,3,4,5};
		
		System.out.println( );// ln means new line will be created in console
		
		for(int i=0;i<b.length; i++) {
			//System.out.println(a[i] );
			
			//below sysout will print in console as 2 3 4 5 6
			System.out.print(b[i] + " ");
		}
		
		//Above is called single dimensional array
		
		
		
		

		
	
		
	}

}
