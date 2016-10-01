package leetcoder;

public class no_141 {
	 public boolean hasCycle(ListNode head) {
		 if (head == null) return false;
		 if (head.next == null) return false;
		 if (head.next.next == null) return false;
	     ListNode a = head.next;
	     ListNode b = head;
	     while (a!=b) { 
	    	 a = a.next.next;
	    	 b = b.next;
	    	 if (a == null) return false;
	    	 if (a.next == null) return false;
	    	 if (b == null) return false;
	    	}
	     return true;  
}
	 
	 class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
}
