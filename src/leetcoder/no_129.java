package leetcoder;

public class no_129 {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	 public int sumNumbers(TreeNode root) {
		 if (root == null) return 0;
		 return solve(root, 0);
	 }
	 
	 private int solve(TreeNode root, int sum){
		 if (root.left==null && root.right == null) return sum+root.val;
		 if (root.left==null) return solve(root.right, (sum+root.val)*10);
		 if (root.right==null) return solve(root.left, (sum+root.val)*10);
		 return solve(root.left, (sum+root.val)*10)+solve(root.right, (sum+root.val)*10);
		 
	 }
	    
}
