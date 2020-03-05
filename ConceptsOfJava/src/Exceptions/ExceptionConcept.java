package Exceptions;

public class ExceptionConcept {
	
	/* Try Catch Mechanism */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a =3;
		int b =7;
		int c =0;
		
		/*
		 * In real time scenarios after login there might be a pop up saying
		 * advertisment fro christmas or anything aftersome days it might gone, in that
		 * case script looks for pop up and fails so we can add try catch in these kind
		 * of cases
		 */
		/* One try can be followed by multiple catch blocks 
		 * catch block should be definitely followed by try block */
		
		/*
		 * Exception is class which handles all kinds of exceptions
		 * 
		 */		
		try{
			/*
			 * int k = b/c; System.out.println(k);
			 */
			int array[] =new int [5];
			System.out.println(array[8]);
		}
		//when 7/0 will get infinity, these are called as Arithmetic exceptions
		catch(ArithmeticException e) {
			System.out.println("I catched the Arithmetic exception");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("I catched the IndexOutOfBounds Exception");
		}
		//Exception is class which handles all kinds of exceptions
		catch(Exception e) {
			System.out.println("I catched the error/exception");
		}
		finally
		{
			/*
			 * This block is executed irrespective of exception thrown or not 
			 * In real scenario when scripts fails in middle , but id f write close 
			 * browser in finally block after scripts fails at some line,
			 * it comes to finally block and executes that particular code written
			 *
			 * We can also write code related to deleted cookies;
			 *
			 * The only case finally block will not execute is , when we stop our script in middle
			 */
			System.out.println("Deleted cookies");
		}
	}

}
