package feb;

import java.util.ArrayList;

public class Collection1 {
		int a=10;
	// int datatype
	//Integer wrapper class it is there interview ques
	public static void main(String[] args) {
		ArrayList age1=new ArrayList(); //inside main object 
		ArrayList<Integer> age=new ArrayList();
		ArrayList<String> name=new ArrayList();
	
		name.add("MST");
		name.add("Testing");
		name.add("Java");
		name.add("selenium");//it can grow dynamically 
		
		for (String s : name) {
			System.out.println(s);	
		}
		
		
		
		
		
	}

}
