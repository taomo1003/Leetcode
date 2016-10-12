package leetcoder;

public class no_114 {
	public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	
    public void flatten(TreeNode root) {
    	root = solve(root);
        
    }
    
    private TreeNode solve(TreeNode root){
    	if (root==null) return root;
    	if (root.left != null) 
        {TreeNode temp = root.right;
        root.right = solve(root.left);
        root.left=null;
        TreeNode ript = root.right;
        while(ript.right!= null) ript = ript.right;
        ript.right = solve(temp);}
        else root.right = solve(root.right);
    	return root;
    }
    
    
    public static void main(String[] args) {
		no_114 test = new no_114();
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
		test.flatten(temp);
		System.out.println();
	}
}
