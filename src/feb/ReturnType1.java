package feb;

public class ReturnType1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(vote(2)); //When calling a method give the value
		
	}
//If your age is more than 18 the return true.If your age is less then 18 the return false
	
	public static boolean vote(int age)    //input age type int   //Return type boolean //When declare a method give input type
	{
		if(age>18)           //if age >18 true    if age<18 then return false
		{
			return true;
			
		}
		else {
			return false;
			
		}
		
		
	} 
}
