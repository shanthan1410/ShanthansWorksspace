package ArraysConcept;

public class InterviewQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2 4 5 
		//3 4 7
	    //1 2 0
		
		//Wherever you get the min number in that column i need to get max number?
		/*
		 * step 1: Find the min number 
		 * step 2: identify the column of min number 
		 * step 3: find the max number in identified column
		 */
		
		int a[][]= {{2,4,5},{3,4,7},{10,2,1}};
		int minnumber= a[0][0];// assume min number is 1st row 1st column number i,2 2 here
		int minColumn=0;// declared to zero
		
		//a[row][column]
		for(int i=0;i<3;i++) {
			for(int j=0;j<3; j++) {
				if(a[i][j]<minnumber) {
					minnumber=a[i][j];
					minColumn =j;
				}
				
			}
		}
		System.out.println(minnumber);
		//2,4,5 
		//3,4,7
	    //10,2,1
		int k=0;
		int maxnumber= a[0][minColumn];//maxnum=5 assume max number is 1st row j column number ie=j=2
		while( k<3) {
			if(a[k][minColumn]>maxnumber){
				maxnumber = a[k][minColumn];
			}
			k++;
		}
		
		System.out.println(maxnumber);
		
	}

}
