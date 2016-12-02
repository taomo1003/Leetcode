package leetcoder;

public class no_238 {
    public int[] productExceptSelf(int[] nums) {
    	int[] result = new int[nums.length];
    	long product=1;
    	int count = 0;
    	int index = 0;
        for (int i = 0; i < nums.length; i++) {
			if (nums[i]==0) {count++;index =i;}
			else product *= nums[i];
		}
        if (count>=2) return result;
        if (count==1) {
        	result[index] = (int) product;
        	return result;
        }
        for (int i = 0; i < result.length; i++) {
			result[i] = (int) (product/nums[i]);
		}
        return result;
    }
    
}
