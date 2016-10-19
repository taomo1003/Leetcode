package leetcoder;

public class no_148 {
	public class ListNode {
		     int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		}
	
	public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next!= null && fast.next.next!= null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode temp = slow.next;
        slow.next = null;
        
        ListNode A = sortList(head);
        ListNode B = sortList(temp);
       
        return mergeTwoLists(A,B);
    }
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val<l2.val) {
        	l1.next = mergeTwoLists(l1.next, l2);
        	return l1;
        } else {
        	l2.next = mergeTwoLists(l1, l2.next);
        	return l2;
		}
    }
	
	public static void main(String[] args) {
		no_148 test = new no_148();
		ListNode head = test.new ListNode(1);
		head.next = test.new ListNode(2);
		head.next.next = test.new ListNode(12);
		head.next.next.next = test.new ListNode(1);
		head.next.next.next.next = test.new ListNode(8);
		head.next.next.next.next.next = test.new ListNode(4);
		head.next.next.next.next.next.next = test.new ListNode(3);
		test.sortList(head);
		while (head!= null){
			System.out.println(head.val);
			head = head.next;
		}
	}
}
