package leetcoder;

public class no_203 {
    public ListNode removeElements(ListNode head, int val) {
    	   if (head == null) return head;
       	   while(head.val == val) {head = head.next;if (head == null) return head;};
           ListNode pt1 = head;
           ListNode pt2 = pt1.next;
           while (pt2 != null) {
           	if (pt2.val==val) {
           		pt1.next = pt2.next;
           	} else {pt1 = pt1.next;}
               pt2 = pt2.next;
               if (pt2 == null) return head;
           }
           return head;
    }
    
    public class ListNode {
    	     int val;
             ListNode next;
    	     ListNode(int x) { val = x; }
    	  }
}
