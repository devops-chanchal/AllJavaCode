package feb;

public class Assignment1 {
	  public static void main(String[] args) {
	  System.out.println("Main method started");
		  red();  //calling that method //stop execution on this line
		  pink();
		  blue();    //Calling a static method in main 
	   System.out.println("Main method end");	             
	   //Call a non static method in main we do not know-Object creation  
	  } 
	public static void red()    //declare a method
	{
		System.out.println("red");  //body of method
		
	}
	public static void pink() 
	{
		System.out.println("pink");
		
		
	}
	public static void blue() 
	{
		System.out.println("blue");
		
		
	}
	
	//why i need to call my method in main
	//JVM will look for main method it will only execute the main from opening bracket to close bracket

}
