package Mar;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacters {
	
	static String data="Swati Sonal Avish Tannu Pranv";
	
	public static void main(String[] args) {
		data=data.toLowerCase();
		Map<Character,Integer> m=new HashMap<>();
		
		for (int i = 0; i < data.length(); i++) {
 			Character ch=data.charAt(i);
			if(m.containsKey(ch)) 
			{  int oldValue=m.get(ch);
				m.put(ch, oldValue+1);
			}
			else 
			{
			m.put(ch, 1);	
			}
		}
		System.out.println(m);
	}
//Run this program debug mode observe the var value and if else condition
}
