package leetcoder;

import java.util.ArrayList;
import java.util.List;

public class no_144 {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
	List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        solve(root);
        return result;
    }
    
    private void solve(TreeNode root){
    	if (root ==null) return;
    	result.add(root.val);
    	solve(root.left);
    	solve(root.right);
    }
}
