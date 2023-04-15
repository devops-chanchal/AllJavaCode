package feb;

public class Exception2 {
	public static void main(String[] args) {
	int a[]=new int[10];
	//index=0-9
	try {
	
	a[1]=10/0; //It will throw an exception
	          //Java.Lang  //handle
	} //same class or parent class //arrayindexoutofbound
	
	catch (RuntimeException e) {
		System.out.println("I am inside the RuntimeException class");
		}
	catch (ArithmeticException e) {
		System.out.println("I am inside the ArithmeticException class");	
	}
	catch (ArrayIndexOutOfBoundsException e) {
	System.out.println("I am inside the ArrayIndexOutOfBoundsException class");
	}
	
	
	//100 lines
	
	}
	

}
