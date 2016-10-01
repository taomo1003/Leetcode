package leetcoder;

public class no_31 {
    public void nextPermutation(int[] nums) {
        if (nums.length < 2 ) return;
        int  i = nums.length-1;
        
        while( i > 0 ){
        	if (nums[i]>nums[i-1]) break;
        	i--;
        }
        
        if (i == 0) {
        	Sort(0, nums);
        	return;
        }
        
        int temp = nums[i-1];
        int k = nums.length-1;
        while (nums[k] <= temp) k--;
        
        nums[i-1] = nums[k];
        nums[k] = temp;
        Sort(i,nums);
        return;
        
    }

	private void Sort(int i, int[] nums) {
		int j = nums.length-1;
		while(i<j){
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
	}
	
	
	public static void main(String[] args) {
		no_31 test = new no_31();
		int[] nums = {2,5,4,3,1};
		test.nextPermutation(nums);
		for (int i = 0; i< nums.length ; i++){
		System.out.println(nums[i]);}
	}
}
