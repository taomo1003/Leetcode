package leetcoder;

import java.util.Arrays;

public class no_215 {
    public int findKthLargest(int[] nums, int k) {
		for (int j = k/2+1; j >=0 ; j--) {
			heapfy(nums, j, k);
		}
		int j = k;
		int n = nums.length;
		while (j<n){
			if (nums[j]>nums[0]) 
			{shift(nums, 0, j);
			heapfy(nums, 0, k);}
			j++;
		}
		return nums[0];
    }
    
	public void heapfy(int[] nums, int i , int n) {
		if ((2*i+2)<n) {
			if (nums[i]>nums[2*i+1]||nums[i]>nums[2*i+2]) {
				int temp = nums[2*i+1]<nums[2*i+2] ? 2*i+1:2*i+2;
				shift(nums,i,temp);
				heapfy(nums, temp, n);
			}
		}
		if ((2*i+1)<n) {
			if (nums[i]>nums[2*i+1]) {
				shift(nums,i,2*i+1);
				heapfy(nums, 2*i+1,n);
			}
		}
	}
	
	public void shift(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	
	public static void main(String[] args) {
		no_215 test = new no_215();
		int[] nums = {3,5,61,6,7,2,3,4,2,4,1,5,6,4,5,6,4};
		
		System.out.println(test.findKthLargest(nums, 3));
		Arrays.sort(nums);
		System.out.println(nums[nums.length-3]);
	}
}
