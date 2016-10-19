package leetcoder;

import java.util.Stack;

public class no_173 {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
		

	 public class BSTIterator {
		 private Stack<TreeNode> stack;
		 public BSTIterator(TreeNode root) {
		      stack = new Stack<>();
		      goLeft(root);
		 }

		    /** @return whether we have a next smallest number */
		 public boolean hasNext() {
		      return !stack.isEmpty();
		 }

		    /** @return the next smallest number */
		 public int next() {
		        TreeNode curr = stack.pop();
		        goLeft(curr.right);
		        return curr.val;
		 }
		 
		 private void goLeft(TreeNode root) {
			 //for( ;root!=null; stack.push(root),root = root.left);
			while(root!=null){
				stack.push(root);
				root = root.left;
			}
		}
	 }

}
