package leetcoder;

public class no_198 {
    private int[] money; 
	
	public int rob(int[] nums) {
		if(nums==null || nums.length==0) return 0;
		money = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			money[i]=-1;
		}
		return robget(nums.length-1, nums);
    }
	
	public int robget (int n, int[] nums){
		if (money[n]>=0) return money[n];
		if (n==0) return nums[0];
		if (n==1) return Math.max(nums[0], nums[1]);
		money[n] = Math.max(robget(n-2, nums)+nums[n], robget(n-1, nums));
		return money[n];
	}
	
	public static void main(String[] args) {
		no_198 test = new no_198();
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
