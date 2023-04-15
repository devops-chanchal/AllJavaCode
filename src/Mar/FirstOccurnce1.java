package Mar;

import java.util.Scanner;

public class FirstOccurnce1 {
	

	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		String str=sc.next(); //String word
		char c = sc.next().charAt(0);
		System.out.println(firstOccur(str,c));	
	}
	public static  int firstOccur(String s,char c) 
	{
	for (int i = 0; i <s.length() ; i++) {
		if(s.charAt(i)==c) //abcda p
		{
		return i;	
		}
		
	}
	return -1;
	} 
	
	

}
