package leetcoder;

public class no_205 {
    public boolean isIsomorphic(String s, String t) {
    	    int[] keep = new int[200];
    	    for (int i = 0; i < s.length(); i++) {
    			if (keep[(int)s.charAt(i)]==0) {
    				keep[(int)s.charAt(i)]= (int)t.charAt(i);
    			} else {
    				if (keep[(int)s.charAt(i)]!=(int)t.charAt(i)) {
    					return false;
    				}
    			}
    		}
    	    keep = new int[200];
    	    for (int i = 0; i < s.length(); i++) {
    			if (keep[(int)t.charAt(i)]==0) {
    				keep[(int)t.charAt(i)]= (int)s.charAt(i);
    			} else {
    				if (keep[(int)t.charAt(i)]!=(int)s.charAt(i)) {
    					return false;
    				}
    			}	
    		}
    	    
    	    return true;	
    }
    
    public static void main(String[] args) {
		no_205 test = new no_205();
		System.out.println(test.isIsomorphic("", ""));
	}
}


//public boolean isIsomorphic(String s, String t) {
//    Map<Character, Character> s2t = new HashMap<>();
//    Map<Character, Character> t2s = new HashMap<>();
//    
//    for (int i = 0; i < s.length(); i++){
//        s2t.put(s.charAt(i), t.charAt(i));
//        t2s.put(t.charAt(i), s.charAt(i));
//    }
//    
//    for(int i =0; i < s.length(); i++){
//        if(s2t.get(s.charAt(i)) != t.charAt(i)) return false;
//        if(t2s.get(t.charAt(i)) != s.charAt(i)) return false;
//    }
//    
//    return true;
//}