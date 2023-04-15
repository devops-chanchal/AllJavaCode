package feb;

public class Student {
	String studentName;
	int rollNo;
	public static void main(String[] args) {
		Student s1=new Student();    //memory will be allocated
		Student s2=new Student();
		Student s3=new Student();  //3 times memory will be allocated
		s1.data("Ruplai", 1);
		s2.data("Rohan", 2);
		s3.data("Pranav", 3);
		
		System.out.println(s1.studentName +  "  "+ s1.rollNo);
		System.out.println(s2.studentName +  "  "+ s2.rollNo);
		System.out.println(s3.studentName+  "  "+ s3.rollNo);
	
	
	}
public void data(String studentN,int roll) 
{
	studentName=studentN;
	rollNo=roll;
	
}
	
	
}
