package leetcoder;

public class no_19 {
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode Dummy = new ListNode(0);
    	Dummy.next = head;
    	int length = 0;
    	ListNode first = head;
    	while (first != null ){
    		length ++;
    		first = first.next;
    	}
    	length -=n;
    	
    	first = Dummy;
    	while (length>0){
    		length--;
    		first = first.next;
    	}
    	first.next = first.next.next;
    	return Dummy.next;    	
    }
    
}

//!!!!!
//Two pointers are traveling with the space of n
//public ListNode removeNthFromEnd(ListNode head, int n) {
//    ListNode dummy = new ListNode(0);
//    dummy.next = head;
//    ListNode first = dummy;
//    ListNode second = dummy;
//    // Advances first pointer so that the gap between first and second is n nodes apart
//    for (int i = 1; i <= n + 1; i++) {
//        first = first.next;
//    }
//    // Move first to the end, maintaining the gap
//    while (first != null) {
//        first = first.next;
//        second = second.next;
//    }
//    second.next = second.next.next;
//    return dummy.next;
//}
