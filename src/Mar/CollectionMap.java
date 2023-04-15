package Mar;

import java.util.HashMap;
import java.util.Map;

public class CollectionMap {
public static void main(String[] args) {
	//key  //value
	Map<Integer,String> m=new HashMap<>();
	
	m.put(1, "Anchal");
	m.put(2, "Jolly");
	m.put(3, "payal");
	m.put(4, "Priyanka");
	m.put(15, "test");
	m.put(12, "abc");
	m.put(12, "abcd"); //Duplicate key value will be replace
	m.put(12, null);
	m.put(13, null);
	m.put(14, null);
	m.put(16, null);
	m.put(null, "Sonal");
	m.put(null, "Swati");
	
	System.out.println(m);
}
	
	
	
	
}
