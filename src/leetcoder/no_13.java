package leetcoder;

public class no_13 {
	  public static int romanToInt(String s) {
	        char[] roman = s.toCharArray();
	        int[] roman_int = new int[s.length()];
	        int result = 0;
	        for (int i = 0; i < s.length(); i++){
	        	switch (roman[i]) {
				case 'I':
					roman_int[i] = 1;
					break;
				case 'V':
					roman_int[i] = 5;
					break;
				case 'X':
					roman_int[i] = 10;
					break;
				case 'L':
					roman_int[i] = 50;
					break;
				case 'C':
					roman_int[i] = 100;
					break;
				case 'D':
					roman_int[i] = 500;
					break;
				case 'M':
					roman_int[i] = 1000;
					break;
				}
	        }
	        for (int i = 0; i < roman_int.length-1; i++) {
				if (roman_int[i]<roman_int[i+1]){
					roman_int[i] *= -1; 
				}
				result += roman_int[i]; 
			}
	        result += roman_int[roman_int.length-1];  //add the last number
	        
	        return result;
	        
	    }
	  
	  public static void main(String[] args)
	  {
		  System.out.println(romanToInt("IV"));
	  }
}
