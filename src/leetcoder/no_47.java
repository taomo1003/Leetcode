package leetcoder;

import java.util.ArrayList;
import java.util.List;

public class no_47 {

    public List<List<Integer>> permuteUnique(int[] nums) {
    	List<List<Integer>> result = new ArrayList<>();
    	if (nums.length==0) return result;
    	List<Integer> tempList = new ArrayList<>();
    	for (int k : nums) tempList.add(k);
    	int[] temp = nums;
    	while (!result.contains(tempList)){
    		result.add(tempList);
    		temp = nextPermutation(temp);
    		tempList = new ArrayList<>();
    		for (int k : nums) tempList.add(k); 	
    	}
    	return result;
    	
    }
    public int[] nextPermutation(int[] nums) {
        if (nums.length < 2 ) return nums;
        int  i = nums.length-1;
        
        while( i > 0 ){
        	if (nums[i]>nums[i-1]) break;
        	i--;
        }
        
        if (i == 0) {
        	Sort(0, nums);
        	return nums;
        }
        
        int temp = nums[i-1];
        int k = nums.length-1;
        while (nums[k] <= temp) k--;
        
        nums[i-1] = nums[k];
        nums[k] = temp;
        Sort(i,nums);
        return nums;
        
    }

	private void Sort(int i, int[] nums) {
		int j = nums.length-1;
		while(i<j){
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
	}
	
	
	public static void main(String[] args) {
		no_47 test = new no_47();
		int[] nums = {1,3,1};
		System.out.println(test.permuteUnique(nums));
	}
}
