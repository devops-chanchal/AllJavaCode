package ignore;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("anagram", "nagaram"));
	}
	    public static boolean isAnagram(String s, String t) {
	        Map<Character,Integer> m=new HashMap<>();
	         for(int i=0;i<s.length();i++)
	         {
	             if(m.containsKey(s.charAt(i))){
	           m.put(s.charAt(i),m.get(s.charAt(i))+1);
	         }
	         else
	         {
	             m.put(s.charAt(i),1); 
	         }
	         }
	         System.out.println(m);
	        for(int i=0;i<t.length();i++)
	         {
	           if(m.containsKey(t.charAt(i)))
	           {
	           int rem=m.get(t.charAt(i))-1;
	            if(rem==-1)
	            {
	            	System.out.println(m);
	                return false;
	            }
	            
	            m.put(s.charAt(i),rem);
	            
	           }
	           else
	           {
	        	   System.out.println(m);
	               return false;
	           }
	         }
	        for(int i=0;i<s.length();i++)
            {
           if(m.get(s.charAt(i))!=0)
           {
        	   System.out.println(m);
        	   return false;
           }
           
            }
	return true;
	    }
	}


