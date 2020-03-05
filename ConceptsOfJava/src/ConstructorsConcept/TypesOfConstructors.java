package ConstructorsConcept;

public class TypesOfConstructors {
	
	//Default Constructor
	public TypesOfConstructors() {
		System.out.println("Iam in constructor");
		}
	
	// Parameterized constructor
	public TypesOfConstructors(int a, int b, int c) {
		System.out.println("Iam in parameterized constructor");
		int d = a+b+c;
		System.out.println(d);
		}
	
	// Parameterized constructor with string
		public TypesOfConstructors(String str,String str1) {
			System.out.println("Iam in parameterized constructor with string");
			String c= str +  str1;
			System.out.println(c);
			}
		
		public void abc() {
			System.out.println("I am a method");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * With below object created defualt contrutor will be executed 
		 * since no parameter is passed
		 */		
		TypesOfConstructors tc =new TypesOfConstructors();
	
		/*
		 * With below object created Parameterized contrutor will be executed 
		 * since  parameter is passed
		 */	
		TypesOfConstructors tc1 =new TypesOfConstructors(1,2,3);
	
       
		TypesOfConstructors tc2 =new TypesOfConstructors("Hello", "world");
		tc2.abc();
		
		/*
		 * we can create multiple objects and constructors in a class, If you define any
		 * contructor, it doenot execute implicit constructor Implicit constructor will
		 * be executed only if no constructors is defined
		 */
		
	}

}
