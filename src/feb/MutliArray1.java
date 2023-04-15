package feb;

public class MutliArray1 {
	
	
	public static void main(String[] args) {
		int a[][]= {{1,2,3,11},{5,6,7,12},{8,9,10,13}};
		int row=a.length;
		int col=a[0].length;
		
		System.out.println("number of rows are:--->"+a.length);   //length will return no of rows
		System.out.println("number of columns are:----> "+a[0].length);         //column   
		
		//single array    1 for loop column
		//multi array     2 for loops rows and columns  outer -rows inner-col
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
			
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		
	}

}
