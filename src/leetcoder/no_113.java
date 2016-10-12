package leetcoder;

import java.util.ArrayList;
import java.util.List;

public class no_113 {
	
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	 
	private List<List<Integer>> result = new ArrayList<>();
	
	
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
    	List<Integer> temp = new ArrayList<>();
    	findSum(temp, sum, root);
    	return result;
    }
    
    private void findSum(List<Integer> curr, int sum, TreeNode root){
    	if (root==null) return;
    	int temp = root.val;
    	if (root.left==null && root.right==null && temp == sum){
    		curr.add(temp);
    		result.add(clone(curr));
    		curr.remove(curr.size()-1);
    		return;
    	}
    	curr.add(temp);
    	findSum(curr, sum-temp, root.left);
    	findSum(curr, sum-temp, root.right);
    	curr.remove(curr.size()-1);
    }
    
    private List<Integer> clone(List<Integer> curr){
    	List<Integer> temp = new ArrayList<>();
    	for (int i : curr){
    		temp.add(i);
    	}
    	return temp;
    }
    
    public static void main(String[] args) {
		no_113 test = new no_113();
		TreeNode temp = test.new TreeNode(5);
		temp.left = test.new TreeNode(4);
		temp.left.left = test.new TreeNode(11);
		temp.left.left.left = test.new TreeNode(7);
		temp.left.left.right = test.new TreeNode(2);
		temp.right = test.new TreeNode(8);
		temp.right.right = test.new TreeNode(4);
		temp.right.left = test.new TreeNode(13);
		temp.right.right.right = test.new TreeNode(1);
		temp.right.right.left = test.new TreeNode(5);
		System.out.println(test.pathSum(temp, 22));
    }
    
}
