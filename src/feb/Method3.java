package feb;

import java.util.Scanner;

public class Method3 {
	
	public static void main(String[] args) {
		//I want to take input at runtime on console
		Scanner sc=new Scanner(System.in);  //keyword new:-
		System.out.println("Enter the first Number");
		int first=sc.nextInt();//Scanner class has method nextint
		System.out.println("Enter the second Number");
		int second=sc.nextInt();
		System.out.println("Enter the third Number");
		int third=sc.nextInt();
		sc.close();  //We are done with the input
		System.out.println("Sum of three number is :--->");
		System.out.println(sum(first,second,third));                       
	}
	public static int sum(int num1,int num2,int num3)  
	{
		int sum=num1+num2+num3;                      
	//	System.out.println(sum);                    
		
		return sum;       
	}
	
	
	
	
	
	

}
