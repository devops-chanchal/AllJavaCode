package ignore;

public class LeapYear {

	public static void main(String[] args) {
		
		int year=2200;
		if(year %4==0) //not suffient  
		{
			if(year %100 !=0  || year %400==0) {
			System.out.println("it is a leap year");
			}
			else 
			{
				System.out.println("it is not a leap year");
			}	
		}
		else 
		{
			System.out.println("it is not a leap year");
		}
		
		//2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, and 2048.
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
