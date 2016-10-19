package leetcoder;

public class no_143 {
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		}
	   public void reorderList(ListNode head) {
		    if(head==null) return;
		    
		    ListNode fast = head;
		    ListNode slow = head;
		    
		    while(fast.next != null && fast.next.next!= null) {
		    	fast = fast.next.next;
		    	slow = slow.next;
		    }
		    
		    ListNode tempHead = reverseList(slow.next);
		    
		    
		    while (true){
		    	if (head == slow) {
		    		head.next = tempHead;
		    		break;
		    	}
		    	ListNode tp1 = head.next;
		    	ListNode tp2 = tempHead.next;
		    	head.next = tempHead;
		    	tempHead.next = tp1;
		    	head = tp1;
		    	tempHead = tp2;
		    	
		    }
 
	    }
	    
	    private ListNode reverseList(ListNode head){
	    	if (head.next == null) return head;
	    	ListNode temp = head.next;
	    	head.next = null;
	    	while(temp.next!=null){
	    		ListNode tp1 = temp.next;
	    		temp.next = head;
	    		head = temp;
	    		temp = tp1;
	    	}
	    	temp.next = head;
	    	return temp;
	    }
	    
	    public static void main(String[] args) {
			no_143 test = new no_143();
			ListNode head  = test.new ListNode(1);
			//head.next = test.new ListNode(2);
			//head.next.next = test.new ListNode(3);
			//head.next.next.next = test.new ListNode(4);
			//head.next.next.next.next = test.new ListNode(5);
			
			test.reorderList(head);
			ListNode temp = head;
			while(temp!=null){
				System.out.println(temp.val);
				temp = temp.next;
			}
		}
	   
}
