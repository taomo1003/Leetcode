package leetcoder;



public class no_83 {
	public class ListNode {
	     int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	
	 public ListNode deleteDuplicates(ListNode head) {
	   if (head == null || head.next == null) return head;
	   ListNode pt = head;     
	   while (pt.next != null) {
		   if (pt.val == pt.next.val && pt.next.next != null) {pt.next = pt.next.next;continue;}
		   if (pt.val == pt.next.val && pt.next.next == null) {pt.next = null; break;}
		   pt = pt.next;
	   }
	   
	   return head;
	 }
}


