package leetcoder;

public class no_213 {
	public int rob(int[] nums) {
		if (nums.length==0) return 0;
		if (nums.length==1) return nums[0];
		if (nums.length==2) return Math.max(nums[0],nums[1]);
		return Math.max(robget(nums, 1, nums.length-1), robget(nums, 2, nums.length-2)+nums[nums.length-1]);
    }
	
	public int robget(int[] nums,int k,int j){
		int[][] dp = new int[j + 1][2];
	    for (int i = k; i <= j; i++) {
	        dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
	        dp[i][1] = nums[i - 1] + dp[i - 1][0];
	    }
	    return Math.max(dp[j][0], dp[j][1]);
	}
	
	public static void main(String[] args) {
		no_213 test = new no_213();
		int[] te = {1};
		//int[] te  = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		System.out.println(test.rob(te)); 
	}
	
}


//public int rob(int[] num) {
//    int[][] dp = new int[num.length + 1][2];
//    for (int i = 1; i <= num.length; i++) {
//        dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1]);
//        dp[i][1] = num[i - 1] + dp[i - 1][0];
//    }
//    return Math.max(dp[num.length][0], dp[num.length][1]);
//}
//dp[i][1] means we rob the current house and dp[i][0] means we don't,
