package leetcoder;

public class no_27 {
	 public static int removeElement(int[] nums, int val) {
	        int pt1 = 0;
	        int pt2 = nums.length-1;
	        int newlength = nums.length;
	      
	        while (pt1 <=pt2){
	            if (nums[pt1] == val) {
	                while ( nums[pt2] == val && pt2 > pt1 )
	                {pt2--;newlength--;}
	                nums[pt1] = nums[pt2];
	                pt2 --;
	                newlength--;
	            } else {pt1++;}
	        }

	        
	        return newlength;
	    }

		public static void main(String[] args) {
			int[] test = {4,5};
			
 			System.out.println(removeElement(test,5));
			
			
		} 
}
