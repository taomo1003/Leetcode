package leetcoder;

public class no_3 {
	 public static int lengthOfLongestSubstring(String s) {
	  if (s.length()==0) return 0;
	  if (s.length()==1) return 1;
	  
	  int i = 0;
	  while (i<s.length()) {
		 int index = firstIndexof(s.substring(i+1, s.length()),s.charAt(i));
		if (index != -1) {
		index = index+i;
		int s1l = lengthOfLongestSubstring(s.substring(0,index+1));
		int s2l = lengthOfLongestSubstring(s.substring(i+1,s.length()));
		return Math.max(s1l,s2l);	
		}
		i++;
	}
	  return s.length();
	}
	 
	 
	 private static int firstIndexof(String substring, char charAt) {
		for (int i = 0; i < substring.length(); i++) {
			if (substring.charAt(i)==charAt)
				return i;
		}	 
		return -1;
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


