package leetcoder;

public class no_66 {
	 public static int[] plusOne(int[] digits) {
	        int n = digits.length-1;
	        while(n>0){
	        	if (digits[n] == 9 ) {digits[n] = 0; n--;}
	        	else {digits[n]++;break;}
	        }
	        if (n==0) {if ( digits[n] < 9) {digits[n]++;} else {
	        	digits[n] = 0;
	        	int[] result = new int[digits.length+1];
	            result[0]=1;
	            return result;
	        }
	        }
	        
	        return digits;
	    }
	 
	 public static void main(String[] args) {
		 int[] test = {1,2,3,4};
		System.out.println(plusOne(test));
	}
}
