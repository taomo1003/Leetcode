package leetcoder;

public class no_38 {
	public static String countAndSay(int n) {
        String[] result = new String[n];
        result[0] = "1";
        
        for (int j = 1; j < n; j++){
            int count  =1; result[j] = "";
            for (int i = 1; i< result[j-1].length(); i++){
                if (result[j-1].charAt(i) == result[j-1].charAt(i-1)){
                    count++; continue;
                } else {
                    result[j] = result[j] +String.valueOf(count)+result[j-1].charAt(i-1);
                    count = 1;
                }
            }
            result[j] =result[j] + String.valueOf(count)+result[j-1].charAt(result[j-1].length()-1);
        }
		return result[n-1];    
    }
	
	public static void main(String[] args) {
		
		System.out.println(countAndSay(5));
	}
}
