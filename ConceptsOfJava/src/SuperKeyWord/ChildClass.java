package SuperKeyWord;

public class ChildClass extends FatherClass {
	
	public ChildClass() {
		/*
		 *  to use parent class intructor we need to use super method which should be
		 * always be in first line
		 */
		super();
		System.out.println("child class constructor");
	}
	
	 // Compile time polymorphysm : method overidding
	//when method is private we cant overide
	// when we same method or variable in parent and child class /
	//And when we create obj of child class and call the method it will return child method
	//to get parent method we need to use Super keyword.
	String  name ="shanthan";
	public  void child() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	/* If we have same methodsin parentand clidclass */
	public void father() {
		System.out.println("Shanthan");
		super.father();
	}
	
	/*
	 *  when both classes as same variable,it will prefer child class varible
	 * To differenciate between parent and child variable, we use Super key word
	 * i.e if we use super key word it will refer to parent class varible 
	 * other wise it will refer to child class variable
	 * 
	 */
	
	
	/*both parent and child class as same variable called String name
	 * Whenever there is redundant between parent and child it will prefer local
	 * varible
	 */
	
	/*In above scenario name will be print as shanthan., but to print name from father class
	 *  Super Keyword will actually referss to parents class */
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass c =new ChildClass();
		c.child();
		c.father();

	}

}
