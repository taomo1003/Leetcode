package leetcoder;

public class no_104 {
	public class TreeNode {
		     int val;
		     TreeNode left;
		     TreeNode right;
		     TreeNode(int x) { val = x; }
		  }
	public int maxDepth(TreeNode root) {
		 if (root== null) return 0;
		 return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
	    }
}

//Leetcode
//public int maxDepth(TreeNode root) {
//    return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
//}