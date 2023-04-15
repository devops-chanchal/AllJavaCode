package ignore;

class Solution {
	   
	   public void swap(int f,int s,int[] num)
	   {
	       int temp=num[f];
	       num[f]=num[s];
	       num[s]=temp;
	   }  
	    public void sortColors(int[] nums) {
	int s=0;
	int e=nums.length;
	int i=0;
	while(e>=s)
	{
	if(nums[i]==0)
	{
	    //start

	swap(i,s,nums);
	i++;s++;
	}
	else if(nums[i]==1)
	{

	i++;
	}
	else{

	swap(i,e,nums);
	e--;    
	}
	}
	    }
	}
