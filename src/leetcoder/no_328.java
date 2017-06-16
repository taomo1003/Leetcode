package leetcoder;

import java.util.Arrays;

public class no_328 {
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	}
	
    public ListNode oddEvenList(ListNode head) {
    	if (head==null || head.next == null) return head;
        ListNode headEvenTemp = head.next;
        ListNode odd = head;
        ListNode even = headEvenTemp;
        
        while(true){
        	if (even.next!=null) {
        		odd.next = even.next;
        		odd = odd.next;
        	} else {
				odd.next = headEvenTemp;
				break;
			}
        	if (odd.next!=null){
        		even.next = odd.next;
        		even = even.next;
        	} else {
				even.next = null;
				odd.next = headEvenTemp;
				break;
			}
        }
        return head;
    }
    
    
    public static void main(String[] args) {
        int[] dp = new int[5];
        
        System.out.println(Arrays.binarySearch(dp, 0, 0, 0));
		
	}
}

