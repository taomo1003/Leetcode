package leetcoder;

public class no_33 {
    public int search(int[] nums, int target) {
    	if (nums.length==0) return -1;
    	if (nums.length==1) return nums[0]==target ? 0:-1;
        int i = 0 ;
        while (i<nums.length-1 && nums[i]<nums[i+1]) {i++;};
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
        	if (nums[index[mid]] == target) return index[mid];
        	if (nums[index[mid]] > target) j = mid-1;
        	else i = mid+1;
        }
        
        return -1;
    }
    
    
    public static void main(String[] args) {
		no_33 test = new no_33();
		int[] nums = {1,3};
		System.out.println(test.search(nums, 3));
	}
}
