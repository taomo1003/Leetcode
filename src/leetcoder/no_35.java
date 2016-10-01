package leetcoder;

public class no_35 {
    public int searchInsert(int[] nums, int target) {
         if (nums.length == 0) return 0;
         
         
         //Binary Search
         int l = 0;
         int r = nums.length-1;
         
         while(l<r){
           int mid = (l+r)/2;
      	   if (nums[mid]==target) break;
      	   if(nums[mid] < target) {
      		   l = mid + 1;
      		   continue;
      	   }
      	   else {
      		   r = mid;
      		   continue;
      	   }
         }
         
         if (nums[(l+r)/2]==target) return (l+r)/2;
         else return target>nums[l]? l+1:l;    
         
    }
    
    public static void main(String[] args) {
		no_35 test = new no_35();
		int target = 6; 
		int[] nums = {1,3,5,6};
		System.out.println(test.searchInsert(nums, target));
		
	}
    
    
}
