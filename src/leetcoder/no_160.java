package leetcoder;

import java.util.HashSet;

public class no_160 {
	
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	HashSet<ListNode> a = new HashSet<ListNode>();
    	while(headA != null){a.add(headA); headA = headA.next;}
    	while(headB != null){
            if (a.contains(headB)) return headB;
    		headB = headB.next;}
    	return null;
    	
    	
    	
    }
	
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) {
		          val = x;
		          next = null;
		      }
		  }
}
