package feb;

public class HW1 {

	
	public static void main(String[] args) {
		
	
	//123  ----->321  //charAt not  //operator   123/10=12
	// reverse a number  //                      123%10=3
   int num=349389723;  //123  //12  //1
   int rem=0;
   int res=0;      //54321   // rem
   while(num>0) 
   {
	   
	 rem=num%10; //calculate rem     
	   res= res*10  +rem;  //rem=1  //res=3*10+rem=31
	   
	   num=num/10;  //123  //12 //1  //0
	   
	   
   }
   System.out.println(res);
 
}
}