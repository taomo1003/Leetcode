package leetcoder;

import java.util.HashSet;

public class no_202 {
	 HashSet<Integer> set = new HashSet<Integer>();
	
	 public boolean isHappy(int n) {
	       int temp = 0;
	       while (n>0) {
	    	   temp += Math.pow(n%10,2);
	    	   n = n /10;
	       }
	       if (temp == 1)  return true;
	       if (set.contains(temp)) return false; else {
		   set.add(temp);
		   return isHappy(temp);
		}
	 }
}
