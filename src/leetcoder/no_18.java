package leetcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class no_18 {
	public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 4) return result;
        Arrays.sort(nums);
        int l = 0;
        while(l < nums.length - 3) {
          int i = l+1;
          while(i < nums.length - 2) {
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                int sum =nums[l] + nums[i] + nums[j] + nums[k];
                if(sum == target) result.add(Arrays.asList(nums[l], nums[i], nums[j], nums[k]));
                if(sum <= target) while(nums[j] == nums[++j] && j < k);
                if(sum >= target) while(nums[k--] == nums[k] && j < k);
            }
            while(nums[i] == nums[++i] && i < nums.length - 2);
          }
          while(nums[l] == nums[++l] && l < nums.length - 3);
        }
        return result;
    }
	
	public static void main(String[] args) {
		no_18 test = new no_18();
		int[] nums = {5,5,3,5,1,-5,1,-2};
		int target = 4;
		System.out.println(test.fourSum(nums, target));
	}
}
