package leetcoder;

public class no_125 {
	 public static boolean isPalindrome(String s) {
	  char[] pali = s.toCharArray();
	  int l = 0;
	  int r = s.length()-1;
	  while (l < r) {
		 while (! check(pali[l]) && l < r ) {l++;}
		 while (! check(pali[r]) && l < r ) {r--;}
		 if (! checksame(pali[l], pali[r])) {return false;} else {
			l++;
			r--;
		} 
	  } 
	 return true;
	  
	 } 
	 public static boolean check(char a) {
		int temp = Integer.valueOf(a);
		return (47<temp && temp <58) || (64<temp && temp <91) || (96<temp && temp <123);
	 }
	 
	 public static boolean checksame(char a , char b) {
		if (47<Integer.valueOf(a) && Integer.valueOf(a) <58) return (a==b);
		return (a==b) || (Math.abs(a-b)==32);
	}
	 
	 
	public static void main(String[] args) {
		System.out.println(isPalindrome("0P"));
	} 
}
