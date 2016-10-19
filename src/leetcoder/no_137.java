package leetcoder;

import java.util.HashMap;

public class no_137 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
			if (hash.containsKey(nums[i])) hash.put(nums[i], hash.get(nums[i])+1);
			else hash.put(nums[i], 1);
		}
        
        for (int i = 0; i < nums.length; i++) {
			if (hash.get(nums[i])!=3) return nums[i];
        }
        return -1;
    }
}
