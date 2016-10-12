package leetcoder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class no_103 {
	public class TreeNode {
		  int val;
		  TreeNode left;
		  TreeNode right;
		  TreeNode(int x) { val = x; }
	}
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> tempque = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
    	tempque.add(root);
    	int count = 0;
    	int next = 1;
    	int layer = 0;
    	int tempnext = 0;
    	
    	Stack<Integer> temp = new Stack();
    	while(!tempque.isEmpty()){
    		TreeNode curr = tempque.poll();
    		if (curr != null) 
    		{temp.add(curr.val);
    		tempque.add(curr.left);
    		tempque.add(curr.right);
    		tempnext +=2;
    		}
    		count++;
    		if (count==next&&!temp.isEmpty()){
    			count = 0;
    			next = tempnext;
    			tempnext = 0;
    			layer++;
    			if (layer%2 == 1) result.add(temp);
    			else result.add(reverse(temp));
    			temp = new Stack<>();
    		}
    	}
    	return result;
    	
    }
    
    private List<Integer> reverse(Stack<Integer> temp){
    	List<Integer> temp1 = new Stack<>();
    	while(!temp.isEmpty()){
    		temp1.add(temp.pop());
    	}
    	return temp1;
    	
    }
    
    public static void main(String[] args) {
		no_103 test = new no_103();
		TreeNode root = test.new TreeNode(0);
		root.left = test.new TreeNode(1);
		//root.right = test.new TreeNode(2);
		root.left.left = test.new TreeNode(3);
		//root.left.right = test.new TreeNode(4);
		//root.right.left = test.new TreeNode(5);
		//root.right.right = test.new TreeNode(6);
		root.left.left.left = test.new TreeNode(2);
		root.left.left.left.left = test.new TreeNode(4);
		root.left.left.left.left.left = test.new TreeNode(6);
		
		System.out.println(test.zigzagLevelOrder(root));
	}
    
    
}
