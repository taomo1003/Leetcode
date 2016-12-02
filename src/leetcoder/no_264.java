package leetcoder;

import java.util.LinkedList;
import java.util.Queue;

public class no_264 {
    public int nthUglyNumber(int n) {
    	Queue<Integer> m2 = new LinkedList<>();
    	Queue<Integer> m3 = new LinkedList<>();
    	Queue<Integer> m5 = new LinkedList<>();
    	
        int curr = 1;
        int q2;
        int q3;
        int q5;
        m2.add(2);
        m3.add(3);
        m5.add(5);
        for (int i = 1; i < n; i++) {
			if (!m2.isEmpty()) q2 = m2.peek(); else q2 = Integer.MAX_VALUE;
			if (!m3.isEmpty()) q3 = m3.peek(); else q3 = Integer.MAX_VALUE;
			if (!m5.isEmpty()) q5 = m5.peek(); else q5 = Integer.MAX_VALUE;
			if (q2 < q3 && q2< q5) {
				curr = m2.poll();
				if (Integer.MAX_VALUE/2>curr) m2.add(curr*2);
				if (Integer.MAX_VALUE/3>curr) m3.add(curr*3);
				if (Integer.MAX_VALUE/5>curr) m5.add(curr*5);
				continue;
			}
			if (q3 < q2 && q3< q5) {
				curr = m3.poll();
				if (Integer.MAX_VALUE/3>curr) m3.add(curr*3);
				if (Integer.MAX_VALUE/5>curr) m5.add(curr*5);
				continue;
			}
			if (q5 < q3 && q5< q2) {
				curr = m5.poll();
				if (Integer.MAX_VALUE/5>curr) m5.add(curr*5);
				continue;
			}
		}
        return curr;
    }
    
    public static void main(String[] args) {
		no_264 test = new no_264();
			System.out.println(test.nthUglyNumber(1600));	
		
	}
}
