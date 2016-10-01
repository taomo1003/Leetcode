package leetcoder;

public class no_61 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
		}
	
    public ListNode rotateRight(ListNode head, int k) {
    	if (head == null) return null;
    	int count =0;
    	ListNode b = head;
    	while (b!=null) {
			count++;
			b = b.next;
		}
    	k = k%count;
    	if (k==0) return head;
        b = head;
        ListNode c = head;
        ListNode d = head;
    	
        c = c.next; if (c == null) c=head;
    	while (k>0) {d = d.next;k--;
    	if (d==null) d = head;
    	};
    	while(d.next!=null){
    		b=b.next; if (b == null) b=head;
    		c=c.next; if (c == null) c=head;
    		d=d.next; if (d == null) d=head;
    	}
    	
    	d.next = head;
    	b.next = null;
    	return c;
    }
    
    public static void main(String[] args) {
    	no_61 test = new no_61();
		ListNode n1 = test.new ListNode(1);
		n1.next = test.new ListNode(2);
		n1.next.next = test.new ListNode(3);
		//n1.next.next.next = test.new ListNode(4);
		//n1.next.next.next.next = test.new ListNode(5);
		
		
		ListNode result = test.rotateRight(n1,2000000000);
		while(result!=null){
		System.out.println(result.val);
		result= result.next;}
		
	}
}
