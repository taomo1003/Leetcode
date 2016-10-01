package leetcoder;

public class no_242 {
	  public boolean isAnagram(String s, String t) {
	    int[] ana = new int[200];
	    int[] anb = new int[200];
	    for (int i = 0; i < s.length(); i++) {
			ana[s.charAt(i)] ++;
				}
	    for (int i = 0; i < t.length(); i++) {
	    anb[t.charAt(i)] ++;
	    }
        for (int i = 0; i < anb.length; i++) {
			if (ana[i]!=anb[i]) return false;
		}
        return true;
	  }
}
