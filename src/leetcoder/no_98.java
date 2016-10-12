package leetcoder;

public class no_98 {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
    public boolean isValidBST(TreeNode root) {
    	long l = Long.MIN_VALUE;
    	long r = Long.MAX_VALUE;
    	return check(root, l, r);
    }
    
    public boolean check(TreeNode root, long le, long ri ) {
    	if (root==null) return true;
    	if (root.val<=le||root.val>=ri) return false;
    	return check(root.left, le, root.val) && check(root.right, root.val,ri);
	
	}
    
    
    public static void main(String[] args) {
		no_98 test = new no_98();
		TreeNode root = test.new TreeNode(1);
		root.left = test.new TreeNode(1);
		//root.right = test.new TreeNode(3);
		
		System.out.println(test.isValidBST(root));
	}
}
