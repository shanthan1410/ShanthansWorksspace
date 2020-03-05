package SuperKeyWord;

public class ThisKeyWord {
	
	int a=2;// global variable which can be used for entire class
	
	public void getData() {
		int a=3; //local variable can be used only for this method
		System.out.println(a);
		/* above prints 3 as output , to get output as 2 we need use this keywor
		 * this refers to current object-object scope lies in class level*/
		System.out.println(this.a);
		System.out.println(a+this.a);
		//using this keyword will refer to global variable
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyWord kw =new ThisKeyWord();
		kw.getData();
		
	}

}
