package leetcoder;

import java.util.Arrays;

public class no_300 {
	public int lengthOfLIS(int[] nums) {            
        int[] dp = new int[nums.length];
        int count = 0;
        
        for(int i : nums){
        	int j = Arrays.binarySearch(dp, 0, count, i);
        	if (j<0) j = -(j+1);
        	dp[j] = i;
        	if (j == count) count++;
        }
        return count;
    }
	
	public static void main(String[] args) {
		no_300 test = new no_300();
		int[] nums = {10, 9, 2, 5, 1, 2, 3 ,3, 7, 101, 18};
		System.out.println(test.lengthOfLIS(nums));
	}
}
