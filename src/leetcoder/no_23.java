package leetcoder;

import java.util.ArrayList;
import java.util.Iterator;

public class no_23 {
	//Save candidate node
	private ArrayList<Integer> candi = new ArrayList<>();
	public class ListNode {
		int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	    }

	public ListNode mergeKLists(ListNode[] lists) {
		for (int i =0 ; i< lists.length;i++){
			if (lists[i]!=null) candi.add(i);
		}
		if (candi.size() == 0) return null;
		if (candi.size() == 1) return lists[candi.get(0)];
		ListNode miNode = getMin(lists);
		ListNode temp = miNode;
		miNode = miNode.next;
		temp.next = mergeKLists(lists);
		return temp;
	}
	
	public ListNode getMin(ListNode[] lists) {
		ListNode minNode = null;
		Boolean firstNode = true;
		Iterator<Integer> temp = candi.iterator();
		while(temp.hasNext()){
			int i = temp.next();
			if (lists[i]==null) {candi.remove(i); continue;}
			if (firstNode) {minNode = lists[i]; firstNode = false;continue;}
			if (lists[i].val<minNode.val) minNode = lists[i];
		}
		return minNode;
	}
}
