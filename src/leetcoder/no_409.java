package leetcoder;

import java.util.HashSet;

public class no_409 {
    public int longestPalindrome(String s) {
        HashSet<Character> hashSet = new HashSet<>();
        int sum = 0;
        char[] str = s.toCharArray();
        for(char a : str) {
        	if (hashSet.contains(a)) {
        		sum +=2;
        		hashSet.remove(a);
        	} else {
        		hashSet.add(a);
        	}
        }
        if(hashSet.isEmpty()) return sum;
        else return sum+1;
    }
}
