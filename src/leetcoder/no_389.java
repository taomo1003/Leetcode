package leetcoder;

public class no_389 {
	  public char findTheDifference(String s, String t) {  
		int[] si = breakstr(s);
		int[] ti = breakstr(t);
		
		for (int i = 0; i < si.length; i++) {
			if (si[i]!=ti[i]) return (char) (i+'a');
		}
		
		return 'a';
		
}
	  
	  public int[] breakstr(String s) {
		  int[] result = new int[26];
		  for (int i = 0; i < s.length(); i++) {
			result[s.charAt(i)-'a'] ++;
		  }
		  return result;
	  }
	  
	  
	  public static void main(String[] args) {
		  no_389 test = new no_389();
		System.out.println(test.findTheDifference("abcd", "abcde"));
	}
}
