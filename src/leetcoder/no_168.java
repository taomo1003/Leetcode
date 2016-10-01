package leetcoder;

public class no_168 {
	 public static String convertToTitle(int n) {
		 
		  String result = new String();
	         String result1 = new String();
	         while(n > 0){  
	         int temp = n%26;
	         if (temp == 0) {result += 'Z'; n -= 26;}
	         else {result += (char)(temp+64);}
	         n = n / 26;
	         }
	         
	         for (int i =0; i< result.length() ;i++){
	         result1 += result.charAt(result.length()-i-1);
	         }
	         
	         return result1;
	 }
	 
	 public static void main(String[] args) {
		 System.out.println(convertToTitle(53));	
	}
	 
	 
}


//public class Solution {
//    public String convertToTitle(int n) {
//        StringBuilder sb = new StringBuilder();
//        convert(n - 1, sb);
//        return sb.toString();
//    }
//    
//    public void convert(int n, StringBuilder sb) {
//        if (n > 25) convert(n / 26 - 1, sb);
//        sb.append((char) ('A' + (n % 26)));
//    }
//}