package Mar;

public class FirstWord {

	static String str="my name is Avish";//my
	static String ans="";               // name   
	static String a[]=str.split(" ");     //is
	public static void main(String[] args) {// Avish
		for (String word : a) {//foreach
			String first = word.substring(0, 1).toUpperCase();
			String rest=word.substring(1,word.length());
			ans=ans+first+rest;
		}
		System.out.println(ans);
		
		
		
	}
	
	
	//calculate the occurence of each char--->Hashmap
	
	
	
	
	
	
}
