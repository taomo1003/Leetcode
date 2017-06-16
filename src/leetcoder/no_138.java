package leetcoder;

import java.util.HashMap;

public class no_138 {
	HashMap<RandomListNode, RandomListNode> hashMap =new HashMap<>();
	
	class RandomListNode {
		int label;
		RandomListNode next, random;
		RandomListNode(int x) { this.label = x; }
	};
		  
	public RandomListNode copyRandomList(RandomListNode head) {
		RandomListNode temp;
		temp = check(head);
		if (temp==null) return null;
		temp.random = check(head.random);
		temp.next = copyRandomList(head.next);
		return temp;
	}
	public RandomListNode check(RandomListNode head) {
		if (head==null) return null;
		if (hashMap.containsKey(head)) 
			return hashMap.get(head);
		else {
			RandomListNode temp = new RandomListNode(head.label);
			hashMap.put(head, temp);
			return temp;
		}
	}
}
