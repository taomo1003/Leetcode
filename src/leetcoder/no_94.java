package leetcoder;

import java.util.ArrayList;
import java.util.List;

public class no_94 {
    private List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        solve(root);
        return result;
    }
    
    public void solve(TreeNode root){
        if (root==null) return;
        solve(root.left);
        result.add(root.val);
        solve(root.right);
    }
    
    public class TreeNode {
    	      int val;
    	      TreeNode left;
    	      TreeNode right;
    	      TreeNode(int x) { val = x; }
    	  }
    
    
}
