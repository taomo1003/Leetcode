package leetcoder;

import java.util.Stack;

public class no_206 {
	 public ListNode reverseList(ListNode head) {
		 if (head== null) return head;
	     Stack<ListNode> kep = new Stack<ListNode>();
		 while (head!=null) {
	       kep.push(head);
	       head = head.next; 
		 }
		 head = kep.pop();
		 ListNode pt=head;
		 while (!kep.isEmpty()) {
			pt.next = kep.peek();
		    pt = kep.pop(); 
	     }
		 pt.next=null;
	     return head;
	    }
	 
	 
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
}
