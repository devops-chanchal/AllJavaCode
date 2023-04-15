package feb;

public class Loop4 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {   //1-10  outer loop 1 value change inner will execute complete
			for(int j=1;j<11;j++) 
			{		
			System.out.println(i +" "+ j); //i=1   //j=1   //i=1 //j=2  //i=1 //j=3 ...i=1 j=10
			                               //i=2  //j=1   //i=2  //j=2 ...   i=2 j=10
				                           //i=3  //j=1 ........i=3 j=10
			}                              //.
		}                                  //.
		                                   //i=10 j=1 ....i=10 j=10
		
		
		
	}

}
