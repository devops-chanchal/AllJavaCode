package Mar;

import java.util.HashSet;
import java.util.Set;

public class Collection4 {
	
	public static void main(String[] args) {
		
		Set<String> s=new HashSet<String>(); //Declare
	System.out.println(s.add("Payal"));
	System.out.println(s.add("Jolly"));
	System.out.println(s.add("Payal")); //Duplicate values are not allowed
		System.out.println(s);
		
		
		
	}

}
