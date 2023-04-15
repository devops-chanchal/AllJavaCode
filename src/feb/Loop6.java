package feb;

import java.util.Scanner;

public class Loop6 {
	
	public static void main(String[] args) {
		
		
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Number of rows you want"); 
		  int rows=sc.nextInt();
		 
		 
		for (int i = 1; i <= rows; i++) { //1-4   //1-10  outer loop 1 value change inner will execute complete //rows
			for(int j=1;j<=i;j++)  //1-i   -1   -2   -3
			{		
			System.out.print("* "); //printing 6 stars //inner loop control no of starts in output //columns 
				
			} 
			System.out.println(); //new line every time i value change
		}                                 
	}

}
//H.W  Reverse priyamid print