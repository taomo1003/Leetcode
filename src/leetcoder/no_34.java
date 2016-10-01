package leetcoder;

public class no_34 {
    public int[] searchRange(int[] nums, int target) {
       int[] result = {-1,-1};
       if (nums.length == 0) return result;
       
       
       //Binary Search
       int l = 0;
       int r = nums.length-1;
       
       while(l<=r){
    	   if (nums[(l+r)/2]==target) break;
    	   if(nums[(l+r)/2] < target) {
    		   l = (l+r)/2 + 1;
    		   continue;
    	   }
    	   else {
    		   r = (l+r)/2 - 1;
    		   continue;
    	   }
       }
       
       //No result found;
       if (l>r) return result;
       
       
       
       result[0] = findIndex(l, (l+r)/2, 0, nums, target);
       result[1] = findIndex((l+r)/2, r, 1, nums, target);
      
       return result;
       
    }
    
    private int findIndex(int l, int r, int mode, int[] nums,int target){
    	while (l <= r){
    		int mid = (l+r)/2;
    		if (nums[mid] == target) {
    			if (mode ==1) {
    				l = mid+1;
    			} else {
    				r = mid-1;
    			}
    		} else {
    			if (mode ==1) {
    				r = mid-1;
    			} else {
    				l = mid+1;
    			}
    		}
    	}
    	return mode==1?r:l;
    }
    
    
    public static void main(String[] args) {
		no_34 test = new no_34();
		int[] nums = {1,2,3,5,5,5,4,6,7};
		int target = 5;
		System.out.println(test.searchRange(nums, target)[0]);
		System.out.println(test.searchRange(nums, target)[1]);
	}
}
