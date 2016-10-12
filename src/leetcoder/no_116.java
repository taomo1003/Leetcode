package leetcoder;

public class no_116 {
	public class TreeLinkNode {
		      int val;
		      TreeLinkNode left, right, next;
		      TreeLinkNode(int x) { val = x; }
		  }
	 
	public void connect(TreeLinkNode root) {
	    if(root == null) return;
	  
	    recur(root.left, root.right);
	}

	public void recur(TreeLinkNode left, TreeLinkNode right) {
	    if(left != null && right != null) {
	        left.next = right;
	        recur(left.right, right.left);
	        recur(left.left, left.right);
	        recur(right.left, right.right);
	    }
	}
}
