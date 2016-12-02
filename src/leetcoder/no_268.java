package leetcoder;

public class no_268 {
    public int missingNumber(int[] nums) {
    	int curr = nums.length;
        for (int i = 0; i < nums.length; i++) {
			curr ^= nums[i];
			curr ^= i;
		}
        return curr;
    }
}
