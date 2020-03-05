package AccessModifier;

public class TypesOfModifiers {
	
	/* Public, Private, Protected, Default */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
 
	void abc() {
		/*
		 * If we don't provide any access modifier the java class will automatically
		 * thinks it has an defualt access modifier.
		 * We can access this method only in that particular  package
		 * We cant access this method out of package even though you create an obj of this class in that particular class
		 */
	}
	public	void abc1() {	
		/*
		 * If we have variable/method as public; then you will have access across all
		 * packages.
		 */
	}
	
	private	void abc2() {	
		/*
		 * If we have variable/method as private; cannot access method or variable outside the class of the 
		 * same package as well.
		 * For example all creditcard details will be in private class
		 */
	}
	
	protected void abc3() {	
		/*
		 * If we have variable/method as protected; 
		 * In same package we access these method same as public
		 * But in different package to use this method you can access those in sub classes only
		 * i.e if we write this method in parent class and to to use this in child class 
		 * which is in different package we need to extend parent class in child class
		 *
		 *
		 *Default + 1extra feature = protected
		 */
	}
}
