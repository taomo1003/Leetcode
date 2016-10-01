package leetcoder;

public class no_53 {
    public int maxSubArray(int[] nums) {
    	int sum = 0;
    	for (int i:nums) {sum+=i;};
        return Solve(nums, sum, 0, nums.length-1);
    }
	private int Solve(int[] nums, int sum, int i, int j) {
		if (i>j) return Integer.MIN_VALUE;
		if (i==j) return sum; 
		while(nums[i]<0 && i<j-2) {
			sum -= nums[i];
			i++;
		}
		while(nums[j]<0 && i<j-2) {
			sum -= nums[j];
			j--;
		}
		return Math.max(sum,Math.max(Solve(nums, sum-nums[j], i, j-1), Solve(nums, sum-nums[i], i+1, j)));
	}
	
	public static void main(String[] args) {
		no_53 test = new no_53();
		int[] nums = {1};
		System.out.println(test.maxSubArray(nums));
	}
    
}


//int max = nums[0];
//int currentSum = 0;
//for (int i : nums) {
//    currentSum += i;
//    max = Math.max(max, currentSum);
//    if (currentSum < 0) {
//        currentSum = 0;
//    }
//}      
//return max;