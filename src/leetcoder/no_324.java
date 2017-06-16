package leetcoder;

import java.util.Arrays;

public class no_324 {
	public int findKthLargest(int[] nums, int k) {
        final int N = nums.length;
        Arrays.sort(nums);
        return nums[N - k];
	}
	
    public void wiggleSort(int[] nums) {
        int mid = findKthLargest(nums, (nums.length+1)/2);
        
        
    }
}
