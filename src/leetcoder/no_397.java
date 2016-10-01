package leetcoder;

import java.util.HashMap;

public class no_397 {
	 HashMap<Long, Integer> save = new HashMap<>();
	 public int integerReplacement(int n) {
	     if (n==1) return 0;
	     if (save.containsKey(n)) return save.get(n);
	     if (n%2 == 0) return integerReplacement(n/2) +1;
	     else if (n==Integer.MAX_VALUE) {return Math.min(integerReplacement((n-1)/2+1),integerReplacement((n-1)/2))+2;}
	     else return Math.min(integerReplacement((n+1)/2),integerReplacement((n-1)/2))+2;
		 
	 }
	 
	 
	 public static void main(String[] args) {
     no_397 test =new no_397();
       
      System.out.println(test.integerReplacement(2147483647));
	}
}
