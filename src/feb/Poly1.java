package feb;

public class Poly1 {

	int sum;
	String fullName;
	public void sum(int num1,int num2)   //methodname   //2 int data
	{ 
		sum=num1+num2;  //coading
	System.out.println(sum);
	}
	public void sum(int num1,int num2,int num3)  //method name same   //3 int data //no of variables
	{
		sum=num1+num2+num3;    //no of input are different in number
		System.out.println(sum);
	}
	public void sum(String firstName,String lastName) //datatype change variable count is same
	{
		fullName=firstName+lastName;
		System.out.println(fullName);
	}
	
	public static void main(String[] args) {
		Poly1 obj=new Poly1();
		obj.sum(2, 5);
		obj.sum(1,5,9);
		obj.sum("Virat","Kohli");
		
		
		
		
	}
	
	
	
	
	
	
}
