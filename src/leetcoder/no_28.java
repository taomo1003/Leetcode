package leetcoder;

public class no_28 {
    public static int strStr(String haystack, String needle) {
    	
        if (needle.length()==0) {return 0;} 
        for (int i = 0; i< haystack.length()-needle.length()+1;i++) {
            int k = i; int j = 0;
            while (haystack.charAt(k)==needle.charAt(j) && j<needle.length() ){
                j++;k++;if (j == needle.length()) {return i;}
            }
        }
        return -1;
    }
    
	public static void main(String[] args) {		
			System.out.println(strStr("a", "a"));
		
		
	} 
    
}
