package feb;

import java.util.ArrayList;

public class Collection2 {
	
	public static void main(String[] args) {
		ArrayList age1=new ArrayList(); //inside main object 
		ArrayList<Integer> age=new ArrayList();
		//for age 1 you can store any value
		age1.add(12);
		age1.add(22);
		age1.add(22);
		age1.add("twenty five");
		age1.add("five");
		age1.add(20.25);
		age1.add(true);
		age1.add(20.2f);
		//for age we can store only integer values
		age.add(29);
		age.add(30);
		age.add(40);
		age.add(50);
		for (Integer i : age) {
			System.out.println(i);
		}
       for (Object j : age1) {
			System.out.println(j);
		}
	}

}
