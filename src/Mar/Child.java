package Mar;

public class Child implements Parent1,Parent2 {
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I am from Parent2");	
	}
	@Override
	public void data() {
		// TODO Auto-generated method stub
	System.out.println("I am from Parent1");	
	}
	public static void main(String[] args) {	
		Child c=new Child();
		c.data();
		c.eat();
	}
}
