package leetcoder;

import java.util.HashSet;

public class no_345 {
	  public static String reverseVowels(String s) {
	         if(s == null || s.length() == 0)
	            return "";
	        
	        HashSet<Character> vow = new HashSet<>();
	        vow.add('a'); vow.add('e'); vow.add('i'); vow.add('o'); vow.add('u'); 
	        vow.add('A'); vow.add('E'); vow.add('I'); vow.add('O'); vow.add('U'); 
	        char[] cs = s.toCharArray();
	        int begin = 0, end = s.length() - 1;
	        while(begin <= end){
	            if (vow.contains(cs[begin])) 
	            {
	            while(begin <= end)
	            {if (vow.contains(cs[end]))  {
	            char c = cs[begin];
	            cs[begin] = cs[end];
	            cs[end] = c;
	            end--;
	            break;
	            }
	            end--;
	            }
	            }
	            begin++;
	        }
	        return new String(cs);
	    }
	  
	  public static void  main(String[] args) {
			System.out.println(reverseVowels("leetcode"));
		}
}
