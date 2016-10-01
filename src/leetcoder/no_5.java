package leetcoder;

public class no_5 {

    public static String longestPalindrome(String s) {
    	int l = 0;
    	int r = 0;
        int length = 0;
        int  position = 0;
        
        while (position<s.length() &&  position > length/2-s.length()) {
			int templength = 1;
			int i = position;
			int k = position+1;
			while ( k<s.length()) {if (s.charAt(i) == s.charAt(k)) {k++; templength++;} else break;}
			i--;
			while ( i>= 0 && k<s.length()){
				if (s.charAt(i)!=s.charAt(k)) break;
				i--;
				k++;
				templength +=2;
			} 
			if (templength>length)
				{l = i+1;
				r = k-1;
				length = templength;
		    }
			position++;
        }
        return s.substring(l, r+1);
    }
        
    public static void main(String[] args) {
		System.out.println(longestPalindrome("abb"));
    	
	}    
        
}
