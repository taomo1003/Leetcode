package leetcoder;

import java.util.HashMap;

public class no_82 {
	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	
    public ListNode deleteDuplicates(ListNode head) {
    	HashMap<Integer, ListNode> map = new HashMap<>();
        ListNode virtualHead = new ListNode(0);
        virtualHead.next = head;
        ListNode i = head;
        ListNode j = virtualHead;
        while(i!=null){
        	if (map.containsKey(i.val)) {
        		int temp = i.val;
        		i = i.next;
        		while (i!=null) {
					if (i.val==temp) i = i.next;
					else break;
				}
        		map.get(temp).next = i;
        		if (i!=null) {map.put(i.val, map.get(temp));j =i; i = i.next; }
        	} else {
        		map.put(i.val, j);
        		j=i;
        		i=i.next;
        	}
        	
        }
        return virtualHead.next;    
    }
    
    public static void main(String[] args) {
		no_82 test = new no_82();
		ListNode head = test.new ListNode(2);
		head.next = test.new ListNode(2);
		head.next.next = test.new ListNode(2);
		head.next.next.next = test.new ListNode(3);
		head.next.next.next.next = test.new ListNode(3);
		
		ListNode newHead = test.deleteDuplicates(head);
		while(newHead!=null){
		System.out.println(newHead.val);newHead = newHead.next;
		}
	
		
	}
}
