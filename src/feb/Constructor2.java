package feb;

public class Constructor2 {
	int rollNo;  //global var
	String name;
	//this,final,super
	
	public Constructor2() {  //return type no //name same as classname //No parameter
	System.out.println("I am constructor without parameter");
	}
	public Constructor2(int rollNo, String name) {  //constructor Overloading //local
		System.out.println("I am constructor with parameters");
		this.rollNo = rollNo;  //local prefer   //this it will prefer to global var
		this.name = name;
	}
	public Constructor2(int rollNo) {  //constructor Overloading
		System.out.println("I am constructor with 1 parameters");
		this.rollNo = rollNo;
		
	}
	//name of constructor Constructor1
	public static void main(String[] args) {
	Constructor2 obj=new Constructor2();
	obj.rollNo=100;
	obj.name="Rupali";
	System.out.println(obj.rollNo+ "    "+obj.name);
	Constructor2 obj1=new Constructor2(1,"Archana");	   //2
	System.out.println(obj1.rollNo+ "    "+obj1.name);
	// Constructor2 obj2=new Constructor2(2,"Payal");
	// Constructor2 obj3=new Constructor2(3,"Richa");
	
	}  

}
