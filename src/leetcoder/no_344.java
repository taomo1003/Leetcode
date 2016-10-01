package leetcoder;

public class no_344 {
	public static String reverseString(String s) {
		String result = "";
        for (int i =0 ; i< s.length() ;i++){
         result += s.charAt(s.length()-1-i);
        }
        return result;
    }
	
	
	public static void  main(String[] args) {
		System.out.println(reverseString("hello"));
	}
}



//StringBuilder sb = new StringBuilder(s);
//return sb.reverse().toString();