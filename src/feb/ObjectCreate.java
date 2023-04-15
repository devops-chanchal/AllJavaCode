package feb;

public class ObjectCreate {
	
	public static void main(String[] args) {
	//className objname=new classname();  //new keyword  //allocate the memory
		ObjectCreate obj1=new ObjectCreate();
		ObjectCreate obj2=new ObjectCreate();
		ObjectCreate obj3=new ObjectCreate();
		obj1.sum(20,10);	
	}
	
	public int sum(int num1,int num2) 
	{
		int sum =num1+num2;
		return sum;
		
	}
	
	
	
	

}
