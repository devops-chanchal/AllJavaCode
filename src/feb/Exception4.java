package feb;

public class Exception4 {
	
	public static void main(String[] args) {
		
		System.out.println("Learning checked exception");
		try {
		Thread.sleep(-9000);//checked exception
		}              //compile time exception
		 catch (Exception e) {
			System.out.println("I am inside the catch");
		}                  //
		System.out.println("I am learning exception handling");
	}

}
