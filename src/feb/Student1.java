package feb;

public class Student1 {
	int rollNo;
	String name;
	public Student1(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	public void show() 
	{
		System.out.println("My roll no is "+rollNo);
		System.out.println("My name is "+name);
	}
	
	public static void main(String[] args) {
		
		Student1 s1=new Student1(12, "Avish");
		Student1 s2=new Student1(10, "jolly");
		s1.show();
		s2.show();
	}
	
	
	
	
	
	
	

}
