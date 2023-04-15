package ignore;

public class Palindrome {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
	    public static  boolean isPalindrome(String s) {
	s=s.trim();
	s=s.toLowerCase();
	String rev="";
	String str="";
	for(int i=0;i<s.length();i++)
	{
	if(s.charAt(i)>='a' && s.charAt(i)<='z')
	str=str+s.charAt(i);
	System.out.println(str);
	}
	for(int i=s.length()-1;i>0;i--)
	{
	if(s.charAt(i)>='a' && s.charAt(i)<='z')
	rev=rev+s.charAt(i);
	System.out.println(rev);
	}
	System.out.println(str +"    "+rev);
	if(str.equals(rev))
	{
	return true;
	}
	
	return false;

	        
	    }
	}

