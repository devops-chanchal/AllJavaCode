package feb;

public class Constructor1 {
	int rollNo;  //global var
	String name;
	//this,final,super
	
	public Constructor1() {  //return type no //name same as classname //No parameter
	System.out.println("I am constructor without parameter");
	}
	public Constructor1(int rollNo, String name) {  //constructor Overloading //local
		System.out.println("I am constructor with parameters");
		this.rollNo = rollNo;  //local prefer   //this it will prefer to global var
		this.name = name;
	}
	public Constructor1(int rollNo) {  //constructor Overloading
		System.out.println("I am constructor with 1 parameters");
		this.rollNo = rollNo;
		
	}
	//name of constructor Constructor1
	public static void main(String[] args) {
	Constructor1 obj=new Constructor1();   //0
	Constructor1 obj1=new Constructor1(12,"data");	   //2
	Constructor1 obj2=new Constructor1(16);	   //1
	}  

}
