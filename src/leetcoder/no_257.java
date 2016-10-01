package leetcoder;

import java.util.ArrayList;
import java.util.List;

public class no_257 {
	List<String> result;
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		 }
	
    public List<String> binaryTreePaths(TreeNode root) {
    	result = new ArrayList<String>();
        if (root == null) return result;
        findpath(root, "");
        return result;
    }
    
    public void findpath(TreeNode root,String current) {
    	String temp = Integer.toString(root.val);
    	if (current.equals("")) current += temp; else current += ("->"+temp);
    	
		if (root.left == null && root.right==null) {
		result.add(current);
		return;}
		if (root.left == null)  {findpath(root.right, current); return;}
		if (root.right == null) {findpath(root.left, current); return;}
		findpath(root.left, current);
		findpath(root.right, current);
	}
    
    public static void  main(String[] args) {
    	no_257 test = new no_257();
		TreeNode root = test.new TreeNode(1);
		root.left = test.new TreeNode(2);
		root.right = test.new TreeNode(3);
		root.left.right= test.new TreeNode(5);
		
		System.out.println(test.binaryTreePaths(root));
	}
}
