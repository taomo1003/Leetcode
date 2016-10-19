package leetcoder;

import leetcoder.no_143.ListNode;

public class no_147 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
    public ListNode insertionSortList(ListNode head) {
    	if (head == null) return head;
        ListNode temp = head.next;
        head.next = null;
        while(temp!=null) {
        	ListNode curr = temp;
        	temp = temp.next;
        	curr.next = null;
        	head = insert(curr,head);
        }
        return head;
    }
    
    private ListNode insert(ListNode curr, ListNode head){
    	if (curr.val <= head.val) {curr.next = head; return curr;}
    	ListNode tempfa = head.next;
    	ListNode tempsl = head;
    	while (tempfa!= null && curr.val > tempfa.val){
    		tempfa = tempfa.next;
    		tempsl = tempsl.next;
    	}
    	tempsl.next = curr;
    	curr.next = tempfa;
    	return head;  	
    }
    
    public static void main(String[] args) {
		no_147 test = new no_147();
		ListNode head  = test.new ListNode(1);
		head.next = test.new ListNode(2);
		head.next.next = test.new ListNode(3);
		head.next.next.next = test.new ListNode(4);
		head.next.next.next.next = test.new ListNode(5);
		
		
		ListNode temp = test.insertionSortList(head);
		while(temp!=null){
			System.out.println(temp.val);
			temp = temp.next;
		}
	}
   
}
