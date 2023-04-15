package ignore;

public class SortZerosAndOne {
	static int[] a1={1,1,1,0,1,0,1,1,0,1,0,0};;
	
	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	    public static void main(String[] args) {
	 
	SortZerosAndOne s=new SortZerosAndOne();
	s.sorttt(a1);
	for (int i : a1) {
	System.out.print(i+" ");
	}    
	        }
	public void sorttt(int[] arr)
	{    int i=0;
	    int start=0;
	    int end=arr.length-1;
	    while(end>=start){
	    {
	        if(arr[i]==0)
	        {
	            swap(i,start);
	            start++;
	            i++;
	        }
	        else
	        {
	            swap(i,end);
	              end--;
	            
	        } 
	        }
	    }}
	    
	    
	        public void swap(int a,int b)
	        {
	            int temp;
	            temp=a1[a];
	            a1[a]=a1[b];
	            a1[b]=temp;
	        }
	        
	        
	    }
	    
	    
	


