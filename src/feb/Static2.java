package feb;

public class Static2 {
	String studentName;
	int rollNo;   //global variable  //Object is created
	 String collegeName; 
	public static void main(String[] args) {
		Static2 s1=new Static2();
		Static2 s2=new Static2();
		Static2 s3=new Static2();
		s1.data("Pranav", 1, "IIT Delhi");
		s2.data("Richa", 2, "IIT Delhi");
		s3.data("Priyanka", 3, "IIT Delhi");
		System.out.println(s1.studentName +  "  "+ s1.rollNo+ " "+s1.collegeName);
		System.out.println(s2.studentName +  "  "+ s2.rollNo+" "+s2.collegeName);
		System.out.println(s3.studentName+  "  "+ s3.rollNo+"  "+s3.collegeName);
		
	}
	public void data(String studentN,int roll,String college) 
	{
		studentName=studentN;
		rollNo=roll;
		collegeName=college;
		
	}
	

}
