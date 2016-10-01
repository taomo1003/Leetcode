package leetcoder;

import java.util.*;

public class no_107 {
	  public List<List<Integer>> result = new ArrayList<List<Integer>>();
	    
	  public List<List<Integer>> levelOrder(TreeNode root) {
	      if (root == null) {return result;}
		  push(root, 0);
		  Collections.reverse(result);
		  return result;
	 }
	  
	  public void push(TreeNode T, int level) {
		  if(result.size()<=level){
			  List<Integer> tmp = new ArrayList<Integer>();
			  tmp.add(T.val);
			  result.add(tmp);
		  }
		  else{
			  result.get(level).add(T.val);
		  }
		  if (T.left !=null) {push(T.left, level+1);}
		  if (T.right != null) {push(T.right, level+1);}
	  }
	  
	  public class TreeNode {
		       int val;
		       TreeNode left;
		       TreeNode right;
		       TreeNode(int x) { val = x; }
		   }
}
