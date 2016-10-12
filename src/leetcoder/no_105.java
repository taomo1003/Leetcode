package leetcoder;

public class no_105 {
	  public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	  
	 public TreeNode buildTree(int[] preorder, int[] inorder) {
	        if (preorder.length==0) return null;
	        int i = 0;
	        
	        
	        while (i<inorder.length){
	        	if (preorder[0]==inorder[i]) break;
	        	i++;
	        }
	        int[] leftp = new int[i];
	        int[] lefti = new int[i];
	        for (int j = 0; j < i; j++) {
				lefti[j] = inorder[j];
				leftp[j] = preorder[j+1]; 
			}
	        
	        int[] rightp = new int[inorder.length-i-1];
	        int[] righti = new int[inorder.length-i-1];
	        for (int j = 0; j < inorder.length-i-1; j++) {
	        	righti[j] = inorder[i+j+1];
				rightp[j] = preorder[i+j+1]; 
			}
	        
	        TreeNode temp  = new TreeNode(preorder[0]);
	        
	        temp.left = buildTree(leftp,lefti);
	        temp.right = buildTree(rightp, righti);
	        return temp;
	        
	 }
	 
	 public static void main(String[] args) {
		no_105 test = new no_105();
		int[] inorder = {4,2,5,1,6,3};
		int[] preorder = {1,2,4,5,3,6};
		TreeNode temp = test.buildTree(preorder, inorder);
		System.out.println(temp);
		System.out.println(0);
	}
	 
	 
}


//public TreeNode buildTree(int[] preorder, int[] inorder) {
//    return buildTree(preorder, inorder, 0, preorder.length - 1, 0, preorder.length - 1);
//}
//
//public TreeNode buildTree(int[] preorder, int[] inorder, int pbeg, int pend, int ibeg, int iend) {
//    
//    if(pbeg > pend || ibeg > iend) {
//        return null;
//    }
//    
//    TreeNode head = new TreeNode(preorder[pbeg]);
//    int i = ibeg;
//    while(i < inorder.length && inorder[i] != head.val) {
//        i++;
//    }
//    
//    head.left = buildTree(preorder, inorder, pbeg + 1, pbeg + i - ibeg, ibeg, i - 1);
//    head.right = buildTree(preorder, inorder, pbeg + i - ibeg + 1, pend, i + 1, iend);
//    
//    return head;
//}
