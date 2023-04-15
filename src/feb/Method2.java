package feb;

public class Method2 {
	
	public static void main(String[] args) {
		//sum(1000,2000,3000);//return value will recieve here
		System.out.println(sum(1000,2000,3000));                        //
	}
	public static int sum(int num1,int num2,int num3) //void:--No Return value 
	{
		int sum=num1+num2+num3;                      //I want to give return type
	//	System.out.println(sum);                    //int it will return
		
		return sum;       //It will return the sum of all three number in input
	}
	
	
	
	
	
	

}
