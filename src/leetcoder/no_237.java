package leetcoder;

public class no_237 {
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	 
	 public void deleteNode(ListNode node) {
	        if (node.next==null) {node =null;return;}
	        node.val = node.next.val;
	        deleteNode(node.next);
	 }
}
