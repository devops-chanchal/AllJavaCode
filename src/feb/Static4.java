package feb;

public class Static4 {
	
	public static void main(String[] args) {
		Static4 obj=new Static4();
		obj.method1();
        method2();		
	}

	
	
	public void method1()  //non static method
	{
		
		System.out.println("I am a non static method");
	}
	public static void method2()       //static method
	{
		System.out.println("I am a static method");
		
	}
	
}
