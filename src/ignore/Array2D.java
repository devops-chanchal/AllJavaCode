package ignore;

public class Array2D {
	
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] t=new int[3][3];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				
				t[j][i]=a[i][j];
				
			}
		}
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					
				System.out.print(t[i][j]+" ");		
				}	
				System.out.println();
				}
		
		
	}

}
