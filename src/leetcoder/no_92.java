package leetcoder;

public class no_92 {
	public class ListNode {
		  int val;
		  ListNode next;
		  ListNode(int x) { val = x; }
	}
    public ListNode reverseBetween(ListNode head, int m, int n) {
    	if (head==null) return null;
        ListNode virtualHead = new ListNode(0);
        virtualHead.next = head;
        int d = n-m;
        ListNode k = virtualHead;
        while(m>1){
        	k = k.next;
        	m--;
        }
        
        ListNode i = k.next;
        ListNode l = i;
        ListNode j = i.next;
        while(d>0){
        	d--;
        	ListNode temp = j.next;
        	j.next = i;
        	i = j;
        	j = temp;
        }
        
        k.next = i;
        l.next = j;
        
        return virtualHead.next;
        
    }
    
    public static void main(String[] args) {
		no_92 test = new no_92();
		ListNode head = test.new ListNode(0);
		head.next = test.new ListNode(1);
		head.next.next = test.new ListNode(2);
		head.next.next.next = test.new ListNode(3);
		//head.next.next.next.next = test.new ListNode(4);
		//head.next.next.next.next.next = test.new ListNode(5);
		//head.next.next.next.next.next.next = test.new ListNode(6);
		head = test.reverseBetween(head, 2, 2);
		while (head!=null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
    
}
