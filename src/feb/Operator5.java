package feb;

public class Operator5 {
	
	public static void main(String[] args) {
		int x=10;
		int y=20;
		
		           //false   //not check 
System.out.println( (x>y) && (++x>y));    //false   //It is not checking for the second condition
System.out.println(x);            // 10

             
                    //true    //false
System.out.println( (x<y) && (++x>y));    //false  //first input is true that is why it is checking for the second condition
System.out.println(x);            // 11
		
		
		
		
		
		
		
		
	}

}
