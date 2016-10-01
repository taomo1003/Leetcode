package leetcoder;

public class no_171 {
    public static int titleToNumber(String s) {
    	int len_c = s.length();
        int len = len_c;
        int res = 0;
        while(len>0){
            res = (int) (res + Math.pow(26,len_c-len)*((int)s.charAt(len-1) - 64));
            len--;
        }
        return res; 
    }
    
    public static void main(String[] args) {
		System.out.println(titleToNumber("AAB"));
	}
    
}
