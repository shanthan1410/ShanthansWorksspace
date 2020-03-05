
public class JavaFirstProgramBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Pink highlighted are key words of java 
		 * If we want to execute this class we need to write main for sure.
		*/
// This step prints in the output
System.out.println("I started Java learning");

// Add 2 numbers 2,3 5
int a =2;
int b =3;
int sum= a+b;
System.out.println(sum);
System.out.println(a+b);
System.out.println("sum is" + sum);

// Calling method from ClassObjectInJava
// Creating object for parent class we can access all the methods of parent class in present class.

ClassObjectsInJava m= new ClassObjectsInJava();
m.ValidateHeader();
//System.out.println(m.ValidateHeader())

m.ValidateHeader2();
System.out.println(m.ValidateHeader2());

System.out.println(m.ValidateHeader1());
	}
	
	

}
