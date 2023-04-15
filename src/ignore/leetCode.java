package ignore;

import java.util.HashSet;
import java.util.Set;

public class leetCode {
	public static void main(String[] args) {
		int[] a={1,2,3,1};
		containsDuplicate(a);
	}
	    public static boolean containsDuplicate(int[] nums) {
	        for(int i=0;i<nums.length;i++)
	        {
	Set<Integer> s=new HashSet<Integer>();
	if(!s.add(nums[i]))
	{
	return true;

	}



	        }
	return false;

	    }
	}


