package leetcoder;

public class no_86 {
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	
    public ListNode partition(ListNode head, int x) {
        ListNode virI = new ListNode(0);
        ListNode virR = new ListNode(0);
        ListNode i = virI;
        ListNode j = virR;
        while (head!=null) {
			if (head.val<x) {
				i.next = head;
				i = i.next;
			}
			else {
				j.next = head;
				j = j.next;
			}
			head = head.next;
		}
        j.next = null;
        i.next = virR.next;
        return virI.next;
    }
    
    
    public static void main(String[] args) {
		no_86 test = new no_86();
		ListNode head = test.new ListNode(4);
		head.next = test.new ListNode(3);
		//head.next.next = test.new ListNode(0);
		//head.next.next.next = test.new ListNode(6);
		//head.next.next.next.next = test.new ListNode(7);
		
		ListNode newHead = test.partition(head,4);
		while(newHead!=null){
		System.out.println(newHead.val);newHead = newHead.next;
		}
	
		
	}
}
