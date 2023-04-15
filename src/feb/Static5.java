package feb;

public class Static5 {
	
	
	public static void main(String[] args) {
		//By creating the object of class
		Static4 obj1=new Static4();
		obj1.method1(); //calling the non static method from another class Static 4
		Static4.method2();  //calling the static method from another class Static 4
		
	}

}
