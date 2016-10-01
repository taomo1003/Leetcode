package leetcoder;

public class no_2 {
	private int plus = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	if (l1 == null && l2 == null) {
    		if (plus==1) return new ListNode(1);
    		else return null;
    	}
    	if (l1 == null) {
    		if (l2.val==9 && plus==1) 
    			{ListNode temp = new ListNode(0);
    			plus=1;
    			temp.next = addTwoNumbers(l2.next, null);
    			return temp; }
    		else {
    			ListNode temp = new ListNode((l2.val+plus)%10);
        		plus=0;
    			temp.next = addTwoNumbers(l2.next, null);
				return temp;
			}
    	}
    	if (l2 == null) { 
    		if (l1.val==9 && plus==1) 
    			{ListNode temp = new ListNode(0);
    			plus=1;
    			temp.next = addTwoNumbers(l1.next, null);
    			return temp; }
    		else {
    			ListNode temp = new ListNode((l1.val+plus)%10);
        		plus=0;
    			temp.next = addTwoNumbers(l1.next, null);
				return temp;
			}
    	}
    	if (l1.val+l2.val +plus >=10){
    		{ListNode temp = new ListNode((l1.val+l2.val+plus)%10);
    		plus=1;
			temp.next = addTwoNumbers(l1.next, l2.next);
			return temp; }
    		
    	}else {
    		ListNode temp = new ListNode(l1.val+l2.val+plus);
    		plus=0;
    		temp.next = addTwoNumbers(l1.next, l2.next);
			return temp;
		}
    }
    
    public class ListNode {
    	      int val;
    	      ListNode next;
    	      ListNode(int x) { val = x; }
   }
}
