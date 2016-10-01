package leetcoder;

public class no_198 {
    private int[][] money; 
	
	public int rob(int[] nums) {
    
		money = new int[nums.length][nums.length];
    	for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				money[i][j] = -1;	
			}	
		}
		
		return robget(0, nums.length-1, nums);
		
    }
	
	public int robget (int i, int j, int[] nums){
		if (i>j) return 0;
		if (i==j) return nums[i];
		if (j-i ==1) return Math.max(nums[i], nums[j]);
		
		if (money[i][j] >=0) return money[i][j];
		
		for (int k = i; k < j; k++) {
			int temp = robget(i, k-2, nums) + robget(k+2, j , nums) + nums[k];
			if (temp > money[i][j]) {money[i][j] = temp;}
		}
		return money[i][j];
	}
	
	public static void main(String[] args) {
		no_198 test = new no_198();
		int[] te  = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
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
