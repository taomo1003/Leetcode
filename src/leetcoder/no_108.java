package leetcoder;

public class no_108 {
	public class TreeNode {
		     int val;
	         TreeNode left;
		     TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
    public TreeNode sortedArrayToBST(int[] nums) {
        return solve(nums, 0, nums.length-1);
    }
    
    private TreeNode solve(int[] nums, int i, int j){
    	
    	if (i>j) return null;
    	TreeNode temp = new TreeNode(nums[(i+j)/2]);
    	temp.left = solve(nums, i, (i+j)/2-1);
    	temp.right = solve(nums, (i+j)/2+1, j);
    	return temp;
    }
    
    
    public static void main(String[] args) {
    	no_108 test = new no_108();
    	int[] nums = {0,1,2,3,4,5};
    	TreeNode TEST = test.sortedArrayToBST(nums);
    	System.out.println();
		System.out.println("a");
	}
}
