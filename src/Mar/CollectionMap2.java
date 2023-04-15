package Mar;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap2 {
public static void main(String[] args) {
	//key  //value
	Map<Integer,String> m=new HashMap<>();
	
	m.put(1, "Anchal");
	m.put(2, "Jolly");
	m.put(3, "payal");
	m.put(4, "Priyanka");
	m.put(null, "Sonal");
	m.put(null, "Swati");

	
	System.out.println(m.get(4));  //Get the value based upon key you provide
	System.out.println(m.containsKey(3)); //contains key
	System.out.println(m.containsValue("Sonal")); //contains value
	
}
	
	
	
	
}
