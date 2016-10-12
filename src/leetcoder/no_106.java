package leetcoder;

public class no_106 {
	  public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	  
	 public class pointer {
			 int posti;
			 int postj;
			 int ini;
			 int inj;
			 
		 pointer(int i,int j, int k,int l) {
				ini = i;
				inj = j;
				posti = k;
				postj = l;
			}
     } 
	  
	 public TreeNode buildTree(int[] inorder, int[] postorder) {
		 pointer p = new pointer(0, inorder.length-1, 0, inorder.length-1);
	     return solver(inorder, postorder, p);
	        
	 }
	 
	 private TreeNode solver(int[] inorder, int[] postorder, pointer p){
		 System.out.println(p.ini);
		 System.out.println(p.inj);
		 System.out.println(p.posti);
		 System.out.println(p.postj);
		
		 if (p.posti>p.postj || p.ini>p.inj) return null;
		 
		 int i = p.inj;
		 int curr = postorder[p.postj];
		 while(i>0){
			 if (inorder[i]==curr) break;
			 i--;
		 }
		 
		 TreeNode temp = new TreeNode(curr);
		 
		 
		 
		 //postorder    8, 4, 5, 2, 6, 7, 3, 1
		 //inorder    4, 8, 2, 5, 1, 6, 3, 7
		 
		 pointer p1 = new pointer(p.ini, i-1, p.posti, p.posti+i-p.ini-1);
		 pointer p2 = new pointer(i+1, p.inj, p.posti+i-p.ini, p.postj-1);
		 
		 
		 
		 temp.left = solver(inorder, postorder, p1);
		 temp.right = solver(inorder, postorder, p2);
		 
		 return temp;
	 }
	 
	
	 
	 public static void main(String[] args) {
		no_106 test = new no_106();
		int[] inorder = {4, 8, 2, 5, 1, 6, 3, 7};
		int[] posorder = {8, 4, 5, 2, 6, 7, 3, 1};
		TreeNode temp = test.buildTree( inorder,posorder);
		System.out.println(temp);
		System.out.println(0);
	}
	 
	 
}


//public TreeNode buildTreePostIn(int[] inorder, int[] postorder) {
//	if (inorder == null || postorder == null || inorder.length != postorder.length)
//		return null;
//	HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
//	for (int i=0;i<inorder.length;++i)
//		hm.put(inorder[i], i);
//	return buildTreePostIn(inorder, 0, inorder.length-1, postorder, 0, 
//                          postorder.length-1,hm);
//}
//
//private TreeNode buildTreePostIn(int[] inorder, int is, int ie, int[] postorder, int ps, int pe, 
//                                 HashMap<Integer,Integer> hm){
//	if (ps>pe || is>ie) return null;
//	TreeNode root = new TreeNode(postorder[pe]);
//	int ri = hm.get(postorder[pe]);
//	TreeNode leftchild = buildTreePostIn(inorder, is, ri-1, postorder, ps, ps+ri-is-1, hm);
//	TreeNode rightchild = buildTreePostIn(inorder,ri+1, ie, postorder, ps+ri-is, pe-1, hm);
//	root.left = leftchild;
//	root.right = rightchild;
//	return root;
//}
