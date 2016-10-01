package leetcoder;

public class no_26 {
	 public int removeDuplicates(int[] nums) {
	        if (nums.length==0) {return 0;}
	        if (nums.length==1) {return 1;}
	        int index = 0;
	        int x1 = nums[0];
	        int count  = 1;
	        while (index < nums.length-1) {
	           int  x2 = nums[index+1];
	        if (x1 ==x2)   {index ++;}
	        else {x1= x2;index ++; nums[count] = x2;;count ++;}
	        
	        }
	        return count;
	    }
	 
	 
}
