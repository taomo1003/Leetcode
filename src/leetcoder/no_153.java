package leetcoder;

public class no_153 {
    public int findMin(int[] nums) {
        return find(nums, 0 ,nums.length-1);
    }
    
    private int find(int[] nums, int begin, int end){
    	int n = end-begin+1;
    	if (n<10) {
    		int min = Integer.MAX_VALUE;
    		for (int i = begin; i <= end; i++) {
				if (nums[i]<min) min = nums[i];
			}
    		return min;
    	}
    	if (nums[begin+n/4]<nums[end-n/4]) return Math.min(find(nums, begin, begin+n/4+1), find(nums, end-n/4,end));
    	else return find(nums, begin+n/4-1, end-n/4+1);
    	
    }
}
