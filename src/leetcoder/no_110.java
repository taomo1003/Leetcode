package leetcoder;

public class no_110 {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
    public boolean isBalanced(TreeNode root) {
      if (root == null)  return  true;
      if (Math.abs(depth(root.left) - depth(root.right)) <=1) 
    	  return isBalanced(root.left) && isBalanced(root.right);
      else return false;   	
    }
    
    public int depth(TreeNode t) {
	    if (t==null) return 0;
	    else return 1+Math.max(depth(t.left),depth(t.right));
	}
}
