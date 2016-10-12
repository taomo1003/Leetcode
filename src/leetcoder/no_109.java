package leetcoder;


public class no_109 {

	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	
	public class TreeNode {
		     int val;
	         TreeNode left;
		     TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
	public TreeNode sortedListToBST(ListNode head) {
    	return helper(head, null);
    }
    
    public TreeNode helper(ListNode head, ListNode end) { 
        // BST tree from head to end - 1
    	if (head == end) {
    	   return null; 
    	}
    	ListNode mid = head, fast = head; 
    	// mid is the middle point of list from head to end
    	while (fast.next != end && fast.next.next != end) {
    	    mid = mid.next;
    	    fast = fast.next.next;
    	    
    	}
    	TreeNode root = new TreeNode(mid.val);
    	root.left = helper(head, mid);
    	root.right = helper(mid.next, end);
    	return root;
    }
    
    
    public static void main(String[] args) {
    	no_109 test = new no_109();
    	ListNode temp = test.new ListNode(0);
    	temp.next = test.new ListNode(1);
    	temp.next.next = test.new ListNode(2);
    	temp.next.next.next = test.new ListNode(3);
    	temp.next.next.next.next = test.new ListNode(4);
    	temp.next.next.next.next.next = test.new ListNode(5);
    	
    	TreeNode TEST = test.sortedListToBST(temp);
    	System.out.println();
		System.out.println("a");
	}
}
