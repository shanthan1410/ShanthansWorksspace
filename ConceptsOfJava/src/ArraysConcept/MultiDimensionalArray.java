package ArraysConcept;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//2 4 5 
//3 4 7
		//a[row][column]
     int a[] [] = new int[2][3];
     a[0][0]=2;
     a[0][1]=4;
     a[0][2]=5;
     a[1][0]=3;
     a[1][1]=4;
     a[1][2]=7;
     
     // if we want to print 2row 1stcloumn
     System.out.println(a[1][0]);
     
   //a[row][column]
   //a[2][3]
     //to print all rows and columns
     // outer forloop basiclally stands for row
     //inner for loop stands for column
     for(int i=0;i<2;i++) {
    	 for(int j=0;j<3;j++) {
    		 System.out.println(a[i][j]);
    	 }
     }
     
     
     
     int b[][]= {{2,4,5},{3,4,7}};
     System.out.println(b[1][2]);
     
     //it will print 7 ; index starts from zero
     
	}

}
