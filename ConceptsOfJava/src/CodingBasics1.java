
public class CodingBasics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * sum of numbers in an array and finding index of particular number
		 * array is collections of object might be string or integer
		 */
		int sum =0;
		int c[]= {2,3,4,5,6};
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
			sum = sum + c[i];
		}
		System.out.println(sum);
		
		 for(int i=0;i<c.length;i++) { 
			 if(c[i]==5){ 
				 System.out.println(i); 
				 break; 
			}
		  
		  }
		 
		
		//Condition to check if break works or not
		
		  for(int i=0;i<c.length;i++) {
			  System.out.println(c[i]); 
			  if(c[i]==5){
		        break; 
		      }
		  
		  }
		 
		
		
	}
}


