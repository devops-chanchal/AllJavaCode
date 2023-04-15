package feb;

public class AccessModifier {
	
	
	public static void main(String[] args) {
		AccessModifier obj=new AccessModifier();
		obj.method1();  //same class i am able access default method
	}

	
	 public void method1() //Default  //package private
	{
		
		System.out.println("I am default method coming from AccessModifier class");
	}
}
