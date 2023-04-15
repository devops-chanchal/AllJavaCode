package feb;

public class SbiBank extends Bank{
 String branch="Mumbai";
 
 public static void main(String[] args) {
	 SbiBank obj=new SbiBank();
	 obj.print();
	 
	 
}
 public void print() 
 {
	 
	 System.out.println("Child branch name is "+branch);
	 System.out.println("Parent branch name is "+super.branch);
 }
 
 
}
