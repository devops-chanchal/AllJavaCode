package feb;

import java.util.Scanner;

public class Method4 {
	
	public static void main(String[] args) {
		//I want to take input at runtime on console
		Scanner sc=new Scanner(System.in);  //keyword new:-
		System.out.println("Enter the first Number");
		double first=sc.nextDouble();//Scanner class has method nextint
		System.out.println("Enter the second Number");
		double second=sc.nextDouble();
		System.out.println("Enter the third Number");
		double third=sc.nextDouble();
		System.out.println("Sum of three number is :--->");
		System.out.println(sum(first,second,third));
		sc.next();//----->   it will take on word as input
		sc.nextLine();//----->It will take one line as input
		
		sc.nextBoolean();//-->it will boolean value as a input
		sc.nextFloat();//:-->float   
	
	}
	public static double sum(double num1,double num2,double num3)  
	{
		 double sum=num1+num2+num3;                      
	//	System.out.println(sum);                    
		
		return sum;       
	}
	
	
//You take a boolean input then print it using method	
//Create a method to take principal,interest rate and time as input	in 
	//return type you need to calculated interest value
	//All these two program run it debug mode line by line observe variable 
	//created in pannel
	

}
