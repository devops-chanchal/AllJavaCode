package feb;

public class Overriding2 extends Overriding1 {

	
	public static  void eat(String dish) 
	{
		System.out.println("I am in child class");
		System.out.println("I am eating "+dish);
		
	}
	
	public static void main(String[] args) {
		
		Overriding1 obj1=new Overriding1();   //Parent class
		Overriding2 obj2=new Overriding2();   //child class
	//	obj1.eat("Burger");  //parent
	//	obj2.eat("Pizza");   //child
		Overriding1 obj3=new Overriding2();  //parent can store object of child
		obj3.eat("parantha");  //child method will be called    //Run time polymorphism or overriding 
		
		
	}
	
	
	
	
}
