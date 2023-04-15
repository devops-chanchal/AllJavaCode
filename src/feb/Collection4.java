package feb;

import java.util.ArrayList;
import java.util.List;

public class Collection4 {
	public static void main(String[] args) {
		List<String> s=new ArrayList<String>();
		List<String> w=new ArrayList<String>();
		s.add("Data");
		s.add("Richa");
		s.add("Kaushal");
		s.add("Tannu");
		s.add("MST");
		s.add("Payal");
		s.add("Archna");
		s.add("MST");
		
		w.add("Richa");
		w.add("Tannu");
		w.add("MST");
	//	w.add("Jolly");
	//To add a complete list or collection in single go
	System.out.println(s.containsAll(w));
	//s.removeAll(w);
		System.out.println(s);
		System.out.println(w);
	 
	//add,remove,size,isempty,contain,addall,containall,removeall,clear
		
		
		
	}

}
