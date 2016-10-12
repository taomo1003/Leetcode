package leetcoder;

public class no_80 {
    public int removeDuplicates(int[] nums) {
    	int i = 0;
    	int j = 0;
    	while(j<nums.length){
    		if (i<2||nums[j]>nums[i-2]) nums[i++] =nums[j];
    		j++;
    	}
    	return i;
    }
    
    public static void main(String[] args) {
		no_80 test = new no_80();
		int[] nums = {1,1,1,2,2,3,3,3,3};
		System.out.println(test.removeDuplicates(nums));
		System.err.println();
		for (int i:nums) {System.out.println(i);}
	}
    
}










//
//int i = 0;
//for (int n : nums)
//    if (i < 2 || n > nums[i-2])
//        nums[i++] = n;
//return i;