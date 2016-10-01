package leetcoder;

import java.util.Arrays;

public class no_169 {
	public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}



//int major=num[0], count = 1;
//for(int i=1; i<num.length;i++){
//    if(count==0){
//        count++;
//        major=num[i];
//    }else if(major==num[i]){
//        count++;
//    }else count--;
//    
//}
//return major;