package feb;

public class Interface2 implements Interface1{

	@Override
	public void creditAmount() {
		System.out.println("Credit amount is 35$");
		
	}

	@Override
	public void fdAmount() {
		System.out.println("Your fd amount is 200$");
		
	}
	
	public static void main(String[] args) {
		Interface2 obj=new Interface2();
		obj.creditAmount();
		obj.fdAmount();
	}

//Multiple Inhritance ---allowed nhi hai----Interface	
	
}
