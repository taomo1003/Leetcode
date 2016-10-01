package leetcoder;

public class no_14 {
    public static String longestCommonPrefix(String[] strs) {
    	int mini = Integer.MAX_VALUE;
    	int loc = 0;
    	int longest = 0;
    	if (strs.length==0) {
			return "";
		}
    	for (int i = 0; i < strs.length; i++) {
		if (strs[i].length() < mini)	
		{loc = i; mini =strs[i].length(); }
		}
    
    	OK:
    	for (int i = 0; i < mini; i++) {
		for(int j=0 ; j < strs.length; j++)  {
			if (strs[j].charAt(i) ==  strs[loc].charAt(i)){	
			} else {break OK;}
		}
		longest ++;
		}
		
		return strs[loc].substring(0, longest);
    }
    
    
    public static void main(String[] args) {
    	
    	String[] strs = {};
		System.out.println(longestCommonPrefix(strs));
	}
}
