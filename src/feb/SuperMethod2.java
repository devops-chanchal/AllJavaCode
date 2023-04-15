package feb;

public class SuperMethod2 extends SuperMethod1{

	public void drink() 
	{
		System.out.println("I am drinking coffee");
		
	}
	public void data() 
	{
		super.drink();
	}
	public static void main(String[] args) {
		SuperMethod2 obj=new SuperMethod2();
		obj.drink();
		obj.data();
	}
	
	
}
