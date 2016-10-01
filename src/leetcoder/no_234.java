package leetcoder;

public class no_234 {

	public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
		  }
	
    public boolean isPalindrome(ListNode head) {
    	  if(head == null || head.next == null) {
              return true;
          }
          
          ListNode counter = head;
          int count = 0;
          while(counter != null) {
              counter = counter.next;
              count++;
          }
          
          // reverse first part
          ListNode firstPart = head;
          ListNode secondPart = head.next;
          firstPart.next = null;
          for (int i = 0; i<count /2 -1 ; i++) { // reverse count /2 -1 times, reverse count/2-1 nodes
              ListNode temp = secondPart.next;
              secondPart.next = firstPart;
              firstPart = secondPart;
              secondPart = temp;
          }
          
          // firstPart is after reverse, should be same as second part
          if(count % 2 != 0) {
              secondPart = secondPart.next;
          }
          
          while(secondPart != null) {
              if(secondPart.val != firstPart.val) {
                  return false;
              }else {
                  secondPart = secondPart.next;
                  firstPart = firstPart.next;
              }
          }
          return true;
          
      
    }
    
}
