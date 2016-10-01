package leetcoder;

import java.util.HashSet;

public class no_142 {
	public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> a = new HashSet<ListNode>();
    	while(head != null){
    	    if (a.contains(head)) return head;
    	    a.add(head); head = head.next;}
    	return null;
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
