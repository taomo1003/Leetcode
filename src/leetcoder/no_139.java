package leetcoder;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class no_139 {
	HashMap<String, Boolean> map = new HashMap<>();
    public boolean wordBreak(String s, Set<String> wordDict) {
        if (map.containsKey(s)) return map.get(s);
        if (s.length()==0) return true;
        for (int i = 0; i<s.length();i++){
        	String tempS = s.substring(0,i+1);
        	if (wordDict.contains(tempS)){
        		boolean temp = wordBreak(s.substring(i+1,s.length()), wordDict);
        		map.put(tempS, temp);
        		if (temp) return true;
        	} 
        }
        return false;
    }
    
    public static void main(String[] args) {
		no_139 test = new no_139();
		String s = "leetcode";
		Set<String> wordDict = new HashSet<>();
		wordDict.add("leetc");
		wordDict.add("code");
		wordDict.add("ode");
		System.out.println(test.wordBreak(s, wordDict));
	}
}


//public boolean wordBreak(String s, Set<String> wordDict) {
//boolean[] f = new boolean[s.length() + 1];
//f[0] = true;
//for (int i = 1; i <= s.length(); i++) {
//for (int j = 0; j < i; j++) {
//f[i] |= f[j] && wordDict.contains(s.substring(j, i));
//}
//}
//return f[s.length()];
//}