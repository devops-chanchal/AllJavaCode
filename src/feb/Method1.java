package feb;

public class Method1 {

	public static void main(String[] args) {
	sum(4,5);//calling //we need to give actual input value	//int is smaller
    sub(100.30,20.10);  //calling to give input  //double is bigger-->it can 
                                           //store int as well double
	sub(100,30);
	}
	public static void sum(int num1,int num2) //2 inputs //int //, seprated
	{
		int sum=num1+num2;  //new variable to store 
		System.out.println(sum);  //print the sum	
	}
	public static void sub(double number3,double number4) //2 inputs //double //, seprated
	{
		double sub=number3-number4;  //new variable to store 
		System.out.println(sub);  //print the sum
	}
	
	
	
	
	

}
