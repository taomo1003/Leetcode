package leetcoder;

public class no_81 {
	public boolean search(int[] nums, int target) {
    	if (nums.length==0) return false;
    	if (nums.length==1) return nums[0]==target;
        int i = 0 ;
        while (i<nums.length-1 && nums[i]<=nums[i+1]) {i++;};
        int[] index = new int[nums.length];
        for (int j = 0; j<nums.length-i-1;j++){
        	index[j] = i+j+1;
        }
        int k = 0;
        for (int j = nums.length-i-1; j<nums.length ; j++){
        	index[j] = k++;
        }
        
        i = 0;
        int j = nums.length-1;
        while(i<=j){
        	int mid  = i+(j-i)/2;
        	if (nums[index[mid]] == target) return true;
        	if (nums[index[mid]] > target) j = mid-1;
        	else i = mid+1;
        }
        
        return false;
    }
    
    
    public static void main(String[] args) {
		no_81 test = new no_81();
		int[] nums = {1,1,1,3,3,4,5,5,0,0,0,0,0,0,0,0};
		System.out.println(test.search(nums, 3));
	}
}
