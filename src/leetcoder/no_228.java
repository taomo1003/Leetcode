package leetcoder;

import java.util.ArrayList;
import java.util.List;

public class no_228 {
	private List<String> result;
    public List<String> summaryRanges(int[] nums) {
        result = new ArrayList<>();
        int i = 0;
        while (i<nums.length){
        	i = search(i, nums);
        }
        return result;
    }
    
    public int search(int i, int[] nums) {
		int l = i;
		int r = nums.length-1;
		while (l<r){
			int mid = l + (r-l)/2;
			if (nums[mid]==nums[i]+mid-i) {
				if (nums[mid+1]>nums[i]+mid-i+1){
					ad(i, mid, nums);
					return mid+1;
				} else {
					l = mid+1;
					continue;
				}
			}
			r = mid;
		}
		if (l==r) ad(i, l++, nums);
    	return l;
	}
    
    public void ad(int i,int l, int[] nums){
    	if (i==l) result.add(String.valueOf(nums[i]));
    	else result.add(String.valueOf(nums[i])+"->"+String.valueOf(nums[l]));
    }
    
    public static void main(String[] args) {
		no_228 test = new no_228();
		int[] nums = {0,1,2,4,5,7};
		System.out.println(test.summaryRanges(nums));
	}
}


//List<String> list=new ArrayList();
//if(nums.length==1){
//	list.add(nums[0]+"");
//	return list;
//}
//for(int i=0;i<nums.length;i++){
//	int a=nums[i];
//	while(i+1<nums.length&&(nums[i+1]-nums[i])==1){
//		i++;
//	}
//	if(a!=nums[i]){
//		list.add(a+"->"+nums[i]);
//	}else{
//		list.add(a+"");
//	}
//}
//return list;