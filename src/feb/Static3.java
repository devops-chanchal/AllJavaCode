package feb;

public class Static3 {
	String studentName;
	int rollNo;   //global variable  //Object is created
	static String collegeName="IIT Delhi"; //because college name is common to all objects that why we make it 
	    //static
	public static void main(String[] args) {
		Static3 s1=new Static3();  //obj will created  //only global variable will get the memory
		Static3 s2=new Static3();
		Static3 s3=new Static3();
		s1.data("Pranav", 1 );
		s2.data("Richa", 2);
		s3.data("Priyanka", 3);
		System.out.println(s1.studentName +  "  "+ s1.rollNo+ " "+Static3.collegeName);
		System.out.println(s2.studentName +  "  "+ s2.rollNo+" "+Static3.collegeName);
		System.out.println(s3.studentName+  "  "+ s3.rollNo+"  "+Static3.collegeName);
		
	}
	public void data(String studentN,int roll) 
	{
		studentName=studentN;
		rollNo=roll;
	
		
	}
	

}
