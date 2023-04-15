package feb;

import java.util.ArrayList;
import java.util.List;

public class Collection3 {
	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		s.add("Data");
		s.add("Richa");
		s.add("Kaushal");
		s.add("Tannu");
		s.add("MST");
		s.add("Payal");
		s.add("Archna");
		s.add("MST");
		s.remove(2);
		s.remove("MST");
		System.out.println(s.size()); //6
		System.out.println(s);
		// s.clear();
	 ;
	  System.out.println( s.contains("Tannu")); //true
	  s.clear();
	  System.out.println(s.isEmpty());  //true
	  
	  
		//data,richa,tannu,payal,archana
		System.out.println(s);//foreach //print directly
		//Duplicate values are allowed in array list
		//add,remove
		s.size();
		
		//add all ,remove all ,contains all
	}

}
