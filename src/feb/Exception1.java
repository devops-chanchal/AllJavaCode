package feb;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1000; //local var
		           //Run time exception
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		try { //line 10 will throw the exception
		int b=a/age; //divide by 0 so //Program will be terminate
		//object of Airthmatic class
		}
		catch (Exception e) {//catch will catch the exception
		System.out.println("age zero is not allowed");
		//if no exception this line will not be executed
		}
		System.out.println("Niche Thyself");//program will 
		                            //not terminated
		

	}

}
