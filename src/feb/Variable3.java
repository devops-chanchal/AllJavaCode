package feb;

public class Variable3 {
	int a=100;           //global var  //non static      
	static int b=1000;   //static var
	public static void main(String[] args) { //static method
		int c=1000;   //local var
		System.out.println(c);  //local variable in same method allowed
		System.out.println(a);  //a is non static var you can not use static method
		System.out.println(b);
		
	}
public void play()     //non static method
{
	System.out.println(c);  //local variable in different method allowed
	System.out.println(a);  //a is non static var you can  use non static method
	System.out.println(b);   //static also you can use in non static method
}	
}
