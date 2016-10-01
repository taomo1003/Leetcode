package leetcoder;

import java.util.Arrays;

public class no_136 {
	 public static int singleNumber(int[] nums) {
		Arrays.sort(nums);
		 for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] != nums[i+1])  return nums[i];
			i++;
		}
		return nums[nums.length-1];
	    }
	 public static void main(String[] args) {
		 int[] test = {1,2,3,4,5,6,7,8,7,6,5,4,3,2,1};
		 System.out.println(singleNumber(test));
		} 
	
}


//Leetcode answer: using XOR operation;
//public static int singleNumber(int[] nums) {
//for (int i = 0; i < nums.length-1; i++) {
//	nums[0] =  nums[0]^nums[i];	
//	}
//	return nums[0]; 
//}