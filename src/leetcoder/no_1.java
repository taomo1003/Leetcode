package leetcoder;

import java.util.HashMap;

public class no_1 {
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) return new int[] {map.get(nums[i]),i};
			map.put(target-nums[i], i);
		}
		return null;
	}
	
	public static void main(String[] args) {
		int[] inp = {1,3,7,9}; 
		System.out.println(twoSum(inp,16)[0]+","+twoSum(inp,16)[1]);

	}
}

//Old
//public static int[] twoSum(int[] nums, int target) {
//    int[] solu = new int[2];
//    for (int i=0;i<nums.length;i++){
//        for (int j = i+1;j<nums.length;j++){
//            if (nums[i]+nums[j]==target) {
//                solu[0]=i;
//                solu[1]=j;
//                return solu;
//            }
//        }
//    }
//    return solu;
//}
