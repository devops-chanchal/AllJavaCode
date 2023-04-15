package feb;

public class Break2 {
	
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				
			
			
			if(i==2  &&  j==2)   //compare a value  //true //boolean
			{
				break;   //not executed until i value is 16
			}
			System.out.println(i + "  "+ j);
		}
		}
		
		
		
		
	}

}
