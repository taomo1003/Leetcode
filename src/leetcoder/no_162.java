package leetcoder;

public class no_162 {
    public int findPeakElement(int[] nums) {
        return solve(nums, 0, nums.length-1);
    }
    
    public int solve(int[] nums, int i, int j){
    	if ((j-i)<10) return getSolve(nums,i,j);
    	int mid = i + (j-i)/2;
    	if (nums[mid]>nums[mid+1]){
    		if (nums[mid]>nums[mid-1]) return mid;
    		else return solve(nums, i, mid-1);
    	} else return solve(nums, mid+1, j);
    }
    
    public int getSolve(int[] nums,int i,int j) {
		while(i<j){
			if (nums[i+1]<nums[i]) break;
			i++;
		}
		return i;
	}
}
