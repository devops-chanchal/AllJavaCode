package feb;

public class SuperConstructor2 extends SuperConstructor1 {
int salary;

public SuperConstructor2(int id, String name, int salary) {
	super(id, name);//calling parent constructor automatically
	this.salary = salary;  //this.var-->global var
System.out.println("I am in child class constructor.");
}

public static void main(String[] args) {
	
	SuperConstructor2 emp=new SuperConstructor2(1, "MST", 2000);
	
}


	
	
	
}
