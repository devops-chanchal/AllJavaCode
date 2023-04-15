package feb;

public class MatrixSum {

	//2 matrix  //2-d array
	public static void main(String[] args) {
		
	
	int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int b[][]= {{10,11,12},{13,14,15},{16,17,18}};
	int sum[][]=new int[3][3];
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a[0].length; j++) {
			
			sum[i][j]=a[i][j]+b[i][j];
			
		}	
	
		
		
		
		
	}
	for (int i = 0; i < sum.length; i++) {
	for (int j = 0; j < sum[0].length; j++) {
		
		System.out.print(sum[i][j]+"  ");
		
	}
		System.out.println();
	}
	
	
	
	

	}
	
	
	
	
	
	
	
	
	
	
}
