package leetcoder;

import java.util.Iterator;
import java.util.LinkedList;

public class no_236 {	
	private boolean finded = false;
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	      }
	 
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	LinkedList<TreeNode> linkp =new LinkedList<>();
    	LinkedList<TreeNode> linkq =new LinkedList<>();
    	linkp = find(linkp,root,p);
    	finded= false;
    	linkq = find(linkq, root, q);
    	
    	Iterator<TreeNode> iterator = linkp.iterator();
    	while (iterator.hasNext()){
    		System.out.println(iterator.next().val);
    	}
    	System.out.println();
    	iterator = linkq.iterator();
    	while (iterator.hasNext()){
    		System.out.println(iterator.next().val);
    	}
    	
    	Iterator<TreeNode> iteratorp = linkp.iterator();
    	Iterator<TreeNode> iteratorq = linkq.iterator();
    	
    	TreeNode temp = root;
    	while (iteratorp.hasNext()){
    		TreeNode temp1 = iteratorp.next();
    		if (iteratorq.hasNext() && temp1==iteratorq.next()) temp = temp1;
    		else return temp;
    	}
    	return temp;
    }
    
    public LinkedList<TreeNode> find(LinkedList<TreeNode> result, TreeNode root, TreeNode p) {
    	if (root == null) return result;
    	result.add(root);
		if (root == p) {
			finded = true;
			return result;}
		
		find(result,root.left, p);
		if (finded) return result;
		if (!finded) {
			find(result,root.right, p);	}
		if (finded) return result;
		
		result.removeLast();
		return result;
	}
    
    public static void main(String[] args) {
    	no_236 test = new no_236();
		TreeNode root = test.new TreeNode(1);
		root.left = test.new TreeNode(2);
		root.right = test.new TreeNode(3);
		root.left.left = test.new TreeNode(4);
		root.left.right = test.new TreeNode(5);
		root.right.left = test.new TreeNode(6);
		root.right.right = test.new TreeNode(7);
		TreeNode q = root.left.right;
		TreeNode p = root.left;
		System.out.println(test.lowestCommonAncestor(root, p, q).val);
		
	}
}
