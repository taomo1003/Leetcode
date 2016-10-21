package leetcoder;

import java.util.ArrayList;
import java.util.List;

public class no_199 {
	 public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	private List<Integer> result = new ArrayList<>();
	private int currlevel = 0;
	
    public List<Integer> rightSideView(TreeNode root) {
        solve(root, 1);
        return result;
    }
    
    private void solve(TreeNode root, int level) {
    	if (root==null) return;
		if (level>currlevel)  {result.add(root.val);currlevel++;}
		solve(root.right, level+1);
		solve(root.left, level+1);
	}
}
