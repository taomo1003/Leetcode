package leetcoder;

import java.util.Arrays;

public class no_16 {
	public int threeSumClosest(int[] nums, int target) {
        int result = Integer.MAX_VALUE;
        if(nums.length < 3) return result;
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length - 2) {
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(large(result, sum, target)) result = sum;
                if(sum-target <= 0) j++;
                if(sum-target > 0) k--;
            }
            i++;
        }
        return result;
    }
	
	public boolean large(long result, long sum, long target) {
		return ((target-result)>0?(target-result):(result-target))>((target-sum)>0?(target-sum):(sum-target));
	}
	
	
	public static void main(String[] args) {
		no_16 test = new no_16();
		int[] nums = {1,2,4,8,16,32,64,128};
		System.out.println(test.threeSumClosest(nums, 82));
	}
}
