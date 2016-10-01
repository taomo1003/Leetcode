package leetcoder;

public class no_235 {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	     if (p==null || q==null) return null;
	     if (root == null) return null;
	     if (root ==p ) return p;
	     if (root ==q ) return q;
	     if (p.left == q || p.right==q) return p;
	     if (q.left == p || q.right==p) return q;
	     boolean pinleft = find(root.left,p);
	     boolean qinright = find(root.right,q);
	     if (pinleft && qinright) return root;
	     if (!pinleft && !qinright) return root;
	     if (pinleft && !qinright) return lowestCommonAncestor(root.left, p, q);
	     else return lowestCommonAncestor(root.right, p, q);
	 }
	 
	 public boolean find(TreeNode a, TreeNode b) {
		if (a == null || b == null) return false;
		if (a == b) return true;
		return find(a.left,b)||find(a.right,b);
	}
}
