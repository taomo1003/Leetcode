package leetcoder;

public class no_283 {
	 public void moveZeroes(int[] nums) {
	     if (nums.length<2) return;
	        int pt1 = 0;
	        int pt2 = 1;
	        while ( pt1 < nums.length && pt2<nums.length){
	            if (nums[pt1]==0){
	              while (pt2 < nums.length) {
	                  if (nums[pt2]!=0){
	                    nums[pt1] = nums[pt2];
	                    nums[pt2] = 0;
	                    pt1++;
	                    pt2++;
	                    break;
	                  } else {pt2++;}
	              } 
	            } else {
	                pt1++;
	                pt2++;
	            }
	        }
	    }
	 
	 
	 public static void main(String[] args) {
		 no_283 test = new no_283();
		 int [] te = {0,1,0,3,12};
		 test.moveZeroes(te);
	}
}
