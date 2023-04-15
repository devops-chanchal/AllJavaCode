package feb;

public class ElevenClassStudent extends Student1{
	String subject;//Object created
static String college="NIT Jaipur";
	
	public ElevenClassStudent(int rollNo, String name, String subject) {
		super(rollNo, name);
		this.subject = subject;
	}
	public void show() 
	{
		System.out.println("My roll no is "+rollNo);
		System.out.println("My name is "+name);
		System.out.println("My subject is "+subject);
	}
	public static void main(String[] args) {
		ElevenClassStudent obj=new ElevenClassStudent(1, "Pranav", "Bio");
		obj.show();
		
		
		
		//obj is ctreated constructor will call
		
	}
	
	


//child object rollno,name parent set  //subject
	
	
	
	
	
	
	
}
