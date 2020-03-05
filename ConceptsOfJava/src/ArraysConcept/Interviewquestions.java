package ArraysConcept;

public class Interviewquestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0 4 5 
		//3 4 7
		//1 2 9
		
	//1. given a matrix print minimum number from above matrix?
		
		int a[][]= {{0,4,15},{3,4,7},{1,2,29}};
		int minnumber= a[0][0];// assume min number is 1st row 1st column number i,2 2 here
		
		//a[row][column]
		for(int i=0;i<3;i++) {
			for(int j=0;j<3; j++) {
				if(a[i][j]<minnumber) {
					minnumber=a[i][j];
				}
				
			}
		}
		System.out.println(minnumber);
		
		//1. given a matrix print maximum number from above matrix?
		
		int b[][]= {{32,4,15},{3,4,7},{1,2,29}};
		int maxnumber= a[0][0];// assume max number is 1st row 1st column number i,2 2 here
		
		//a[row][column]
		for(int i=0;i<3;i++) {
			for(int j=0;j<3; j++) {
				if(b[i][j]>maxnumber) {
					maxnumber=b[i][j];
				}
				
			}
		}
		System.out.println(maxnumber);

	}

}
