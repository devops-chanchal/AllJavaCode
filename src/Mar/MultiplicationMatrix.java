package Mar;

import java.util.Iterator;

public class MultiplicationMatrix {
	static int a[][]= {{1,2,3},{4,5,6},{7,8,9}};  //3*3
	static int b[][]= {{2,5,4},{3,1,9},{5,6,7}}; //3*3
	static int mul[][]=new int[3][3];
	
	//first matrix col should be equal to second matrix rows  
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int j2 = 0; j2 < a[0].length; j2++) {
					
					
					a[i][j]*b[j][i];
					
					
				}
				
			}
			
			
			
		}
		
		
		
		
		
	}
	
	
	
	

	
	
	
	
}
