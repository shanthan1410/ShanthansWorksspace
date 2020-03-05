package SuperKeyWord;


/*Even entire class can be marked as final, for example change access modifier from public to final in fatherClass
 * and you see it throws error in child class*/
/*if set access modifier to final in any class . 
this means we cannot extend thatclass
other clasess cannnot inherit the properties of this class*/
final class FinalKeyWord {
	
	final void getData() {
		/*
		 * You cannot override this method again i.e this methods are unique and cant
		 * be used with same name i.e child classes can't use this methods if this method
		 * is in parent class
		 */
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		final int i =4; //constant variables
		/*
		 * Once you declare any variable using final variable that is fixed and cant be
		 * changed
		 */
		//Like below we cant change i variable since it has final keyword
		int a=4;
		a=5;
		System.out.println(a);
		FinalKeyWord src = new FinalKeyWord();
		src.getData();
		
	}

}
