package feb;

public class Array1 {
	
	
	public static void main(String[] args) {
	int b=10;      //declaring+intialize 
	int[] a= {1,3,5,9,99,10};	   //length-6   //0-5   
	
	
	a[3]=100;   //replace that value
	System.out.println(a[0]);  //in brackets we need to give index
	System.out.println(a[1]);
	System.out.println(a[2]);
	System.out.println(a[3]);
	System.out.println(a[4]);
	System.out.println(a[5]);
	//System.out.println(a[6]);   //No compile time error  //Run time exception //Arrayindex out of bound
	
	//loops
	System.out.println("These value we are printing with the help of loop");
	for (int i = 0; i < a.length; i++) {
		
	System.out.println(a[i]);
		
		
	}
		
	}

}
