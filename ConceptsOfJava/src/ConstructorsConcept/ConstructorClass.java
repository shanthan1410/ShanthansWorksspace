package ConstructorsConcept;

public class ConstructorClass {
	
	/* Block of code when ever an object is created
	 * When ever you create an object, constructor is called
	 * Whether you create a constructor in class or not
	 * If created- compliler will call explicit constructor
	 * i.e its execute code what ever written in constructor automatically
	 * If not created: Compiler will call implicit contructor
	 * i.e nothing will be executed and printed
	 *  */
	/* Rules to create constructor 
	 * 1. Name of the construtor should be class name
	 * 2. It will not return any value*/
	
	public ConstructorClass() {
	System.out.println("Iam in constructor")	;
	}

	public void getData() {
		System.out.println("Iam in method")	;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorClass c= new ConstructorClass();
		/*
		 * When we create object in the class and have constructor defined in same class
		 * compiler executes piece of code in constructor
		 * If not defined compliler will call implicit constructor
		 */
		
		c.getData();

	}

}
