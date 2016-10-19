package leetcoder;

public class no_152 {
    public int maxProduct(int[] nums) {
   	    int result=nums[0];
   	    if (nums.length==1) return result;
   	    int j = 0;
        for (int i = 0; i < nums.length; i++) {
        	if (nums[i]==0) {result = max(solve(nums,j, i-1), 0, result); j = i+1;}
        }
        if (j<nums.length) result = Math.max(solve(nums,j,nums.length-1),result);
        return result;
    }
    
    private int max(int a, int b, int c){
    	return Math.max(Math.max(a, b),c);
    }
    
    public int solve(int[] nums,int begin,int end) {
    	if (end<begin) return Integer.MIN_VALUE;
    	if (end==begin) return nums[end];
    	
    	int begminusindex = -1;
    	int endminusindex = -1;
    	
    	int count = 0;
    	int product = 1;
    	for (int i = begin; i <= end; i++) {
    		product *= nums[i];
			if (count==0 && nums[i]<0) {
				count++;
				begminusindex = i;
			} else if (nums[i]<0) {
				count++;
				endminusindex = i;
			}
		}
    	if (count%2==0) return product;
    	
    	int p1 = 1;
    	int p2 = 1;
    	int p3 = 1;
    	for (int i = begin; i <= end; i++) {
    		if (i == begminusindex || i == endminusindex) continue;
			if (i<begminusindex) p1*=nums[i];
			else if (i<endminusindex) p2*=nums[i];
			else p3*= nums[i];
		}
    	if (count==1) return Math.max(p1,p3);
    	
    	return Math.max(p1*nums[begminusindex]*p2,p2*nums[endminusindex]*p3);
    }
     
    
    public static void main(String[] args) {
		no_152 test = new no_152();
		int[] nums = {0,2};
		System.out.println(test.maxProduct(nums));
	}
}


//public int maxProduct(int[] nums) {
//    int max = Integer.MIN_VALUE, product = 1;
//    int len = nums.length;
//
//    for(int i = 0; i < len; i++) {
//        max = Math.max(product *= nums[i], max);
//        if (nums[i] == 0) product = 1;
//    }
//
//    product = 1;
//    for(int i = len - 1; i >= 0; i--) {
//        max = Math.max(product *= nums[i], max);
//        if (nums[i] == 0) product = 1;
//    }
//
//    return max;
//}