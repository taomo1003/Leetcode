package leetcoder;

public class no_8 {
//	public static int myAtoi(String str) {
//       // int result = 0;
//        for (int i =0;i<str.length();i++){
//        try {
//        	System.out.println(Integer.valueOf(str.substring(i,i+1)));
//        	//System.out.println(Integer.valueOf(str.substring(i,i+1)));
//           // result = Integer.valueOf(String.valueOf(i));    
//        }
//        catch (Exception e){
//        	str = str.substring(0,i)+str.substring(i+1,str.length());}
//        }
//        
//        return Integer.valueOf(str);
//        
//    }
//    
//	public static void main(String[] args) {
//		
//		System.out.println(myAtoi("    010"));
//	}
	  public int myAtoi(String str) {
	        double result = 0;
	        int POrN = 1;
	        int count = 0;
	        char[] charArr = str.toCharArray();
	        for(char c:charArr){
	            count ++;
	            if( c >='0' && c <='9' ){
	                result *= 10;
	                result += ( c - '0');
	            }else if( c == '-' && count == 1){
	                POrN = -1;
	            }else if( c == '+' && count == 1){
	                POrN =  1;
	            }else if( c == ' ' && count == 1){
	                count --;
	            }else{
	                break;
	            }
	            
	        }
	        if( result > Integer.MAX_VALUE ){
	            if(POrN == 1)
	                return Integer.MAX_VALUE;
	            else
	                return Integer.MIN_VALUE;
	        }else{
	            return (int)(result * POrN);
	        }
	    }

}


//int myAtoi(string str) {
//    long result = 0;
//    int indicator = 1;
//    for(int i = 0; i<str.size();)
//    {
//        i = str.find_first_not_of(' ');
//        if(str[i] == '-' || str[i] == '+')
//            indicator = (str[i++] == '-')? -1 : 1;
//        while('0'<= str[i] && str[i] <= '9') 
//        {
//            result = result*10 + (str[i++]-'0');
//            if(result*indicator >= INT_MAX) return INT_MAX;
//            if(result*indicator <= INT_MIN) return INT_MIN;                
//        }
//        return result*indicator;
//    }
//}
