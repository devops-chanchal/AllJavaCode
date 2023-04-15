package feb;

import java.util.Scanner;

public class Scanner1 {
	
	
	
	public static void main(String[] args) {
		
		
		//int,double
		//String boolean
		
		 Scanner sc=new Scanner(System.in); //Take input from console
		System.out.println("Please tell me your name");
		 String myName=sc.nextLine();   //String input
		 System.out.println("Please tell me do i need to do payment");
		boolean payment=sc.nextBoolean();  //Boolean input
		
		
		System.out.println("My name is:--->"+myName);
		System.out.println("Do i need to payment:--->"+payment);
		
		
	}

}
