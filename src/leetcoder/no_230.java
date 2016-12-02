package leetcoder;

import java.util.Stack;

public class no_230 {
	private Stack<TreeNode> stack = new Stack<>();
    
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 
    public int kthSmallest(TreeNode root, int k) {
        goleft(root);
        TreeNode temp = null;
        for (int i = 0; i < k; i++) {
        	temp = stack.pop();
			goleft(temp.right);
		}
        return temp.val;
    }
    
    public void goleft(TreeNode root){
    	while (root!=null) {
    	stack.push(root);
    	root = root.left;}
    }
    
    public static void main(String[] args) {
		no_230 test = new no_230();
		TreeNode root = test.new TreeNode(1);
		System.out.println(test.kthSmallest(root, 1));
		
	}
    
}
