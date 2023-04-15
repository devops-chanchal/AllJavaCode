package feb;

public class MutliArray2 {
	
	
	public static void main(String[] args) {
		String a[][]= new String[4][2];
		
		a[0][0]="Hinal";
		a[0][1]="Hinal@123";
		a[1][0]="Richa";
		a[1][1]="pass@123";
		a[2][0]="Rohit";
		a[2][1]="Rohit@123";
		//a[3][0]="Tannu";
		a[3][1]="Tannu@123";
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
//H.w:--->Create a array of char,boolean
//H.W:-->for double array [7][8]    give values declare first then give values then print values
//H.W User take three number and find the max number
//H.W method find average of number 3 number input 3 number output int-->Return type
//100 number Fibonacci series  0,1,1,2,3,5,8,13... 
//Sum of the numbers   input will be num   output will int 135=9
//rev of string-charAt()---->Reverse a number 234-432 but with out charAt();
//Take a int array put 10 value find max and min number array:-->array,if else,for
//You need print only odd number from 1-100 by using continue keyword


// 5- 2 program daily