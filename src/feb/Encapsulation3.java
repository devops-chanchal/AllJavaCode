package feb;

public class Encapsulation3 {
	public static void main(String[] args) {
		Encapsulation1 cust1=new Encapsulation1();
		cust1.setAge(11);   
		cust1.setSalary(200);  //we need to stop it and show error to them
		
		System.out.println("my customer age is :--->"+cust1.getAge());
		System.out.println("my customer salary is :--->"+cust1.getSalary());
		
		
		
	}
	

}
