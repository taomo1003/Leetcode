package leetcoder;

public class no_209 {
    public int minSubArrayLen(int s, int[] nums) {
      if (nums == null || nums.length == 0) return 0;
      int i = 0;
      int j = 0;
      int min = Integer.MAX_VALUE;
      int sum = 0;
      while (j<nums.length){
    	  sum += nums[j++];
    	  while (sum>=s){
    		  min = Math.min(min,j-i);
    		  sum -=nums[i++];
    	  }
    	  
      }
      return min==Integer.MAX_VALUE? 0:min;
    }
    
    public static void main(String[] args) {
		no_209 test = new no_209();
		int s = 15;
		int[] nums = {10,2,3};
		System.out.println(test.minSubArrayLen(s, nums));
	}
}
