package leetcoder;

import java.util.ArrayList;
import java.util.List;

public class no_15 {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> result = new ArrayList<>();
    	int sum = 0;
        for (int i = 0; i< nums.length; i++) {
        	for (int j = i+1; j < nums.length; j++) {
				for (int k = j+1; k < nums.length; k++) {
					sum = nums[i]+nums[j]+nums[k];
					if (sum==0) {
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[k]);
						result.add(temp);
					}
				}
			}

        }
        return result;
    }
    
    public static void main(String[] args) {
		no_15 test = new no_15();
		int[] nums = {-1,0,1,2,-1,-4};
		System.out.println(test.threeSum(nums));
	}
}




//public List<List<Integer>> threeSum(int[] nums) {
//    List<List<Integer>> result = new ArrayList<>();
//    if(nums.length < 3) return result;
//    Arrays.sort(nums);
//    int i = 0;
//    while(i < nums.length - 2) {
//        if(nums[i] > 0) break;
//        int j = i + 1;
//        int k = nums.length - 1;
//        while(j < k) {
//            int sum = nums[i] + nums[j] + nums[k];
//            if(sum == 0) result.add(Arrays.asList(nums[i], nums[j], nums[k]));
//            if(sum <= 0) while(nums[j] == nums[++j] && j < k);
//            if(sum >= 0) while(nums[k--] == nums[k] && j < k);
//        }
//        while(nums[i] == nums[++i] && i < nums.length - 2);
//    }
//    return result;
//}