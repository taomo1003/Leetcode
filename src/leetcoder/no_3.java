package leetcoder;

import java.util.HashMap;

public class no_3 {
	public static int lengthOfLongestSubstring(String s) {
		 int maxlength = 0;
		 HashMap<Character, Integer> map = new HashMap<>();
		 for (int i = 0, j=0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))){
				j = Math.max(map.get(s.charAt(i)), j);
			}
			maxlength = Math.max(i-j+1, maxlength);
			map.put(s.charAt(i), i+1);
		}
		 
		 return maxlength;
	}
	 
	public static void main(String[] args){
		 System.out.println(lengthOfLongestSubstring("kbpjjxrrrgejkrapjvldmgofucbtokobnfmwddnuluewlglwbyzneoubsxughkjwpvtsyinkctiobvmcumracmbujxct"));
	 }
	 
}



//public int lengthOfLongestSubstring(String s) {
//    int[] map = new int[256];
//    for (int i = 0; i < 256; i++) map[i] = -1;
//    
//    int start = 0, maxLen = 0;
//    for (int i = 0; i < s.length(); i++) {
//        char c = s.charAt(i);
//        if (map[c] >= start) {
//            if (maxLen < i - start) {
//                maxLen = i - start;
//            }
//            start = map[c] + 1;
//        }
//        map[c] = i;
//    }
//    return maxLen;
//}



//if (s.length()==0) return 0;
//HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//int max=0;
//for (int i=0, j=0; i<s.length(); ++i){
//    if (map.containsKey(s.charAt(i))){
//        j = Math.max(j,map.get(s.charAt(i))+1);
//    }
//    map.put(s.charAt(i),i);
//    max = Math.max(max,i-j+1);
//}
//return max;
//


