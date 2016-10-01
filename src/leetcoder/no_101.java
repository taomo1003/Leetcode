package leetcoder;

public class no_101 {

	
	 public class TreeNode {
	      int val;
	     TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }

	    public boolean isSymmetric(TreeNode root) {
	    	
	    	if(root == null) return true;
	    	
	    	if (root.left == null && root.right == null) return true;
	    	else if(root.left == null || root.right == null) return false;
	    	
	        return compare(root.left, root.right);
	    	
	    }
	    


	    public boolean compare(TreeNode t1, TreeNode t2){
	    	if (t1.val != t2.val) {return false;}
	    	boolean lft = false;
	    	boolean rit = false;
	
            boolean t1l =  t1.left == null ? false : true;
            boolean t1r =  t1.right == null ? false : true;
            boolean t2l =  t2.left == null ? false : true;
            boolean t2r =  t2.right == null ? false : true;
            
            if (!t1l && !t2r){
            	lft =true;
            } else {
				if (!t1l || !t2r) {
					lft = false;
				} else{
					lft = compare(t1.left, t2.right);
				}
			}

            if (!t1r && !t2l){
            	rit =true;
            } else {
				if (!t1r || !t2l) {
					rit = false;
				} else {
					rit = compare(t1.right, t2.left);
				}
			
			}
            
	    	return lft && rit;
	    }

}
