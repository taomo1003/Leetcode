package leetcoder;

public class no_29 {
    public int divide(int dividend, int divisor) {
        int divi = 0;
        int count = 0;
        while (divisor<dividend){
        	divisor <<= 1;
        	count++;
        }
        
        while (count-->0) {
			if (dividend>divisor){
				dividend -= divisor;
				divisor >>=1;
        		divi +=  1;
			}
			else {
				divisor >>=1;
			}
        	divi <<= 1;
		}
        
        return divi;
    }
    
    
    public static void main(String[] args) {
    	no_29 test = new no_29();
    	System.out.println(test.divide(19, 7));	
	}
}



//if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1))
//    return Integer.MAX_VALUE;
//if (dividend == 0 || divisor == 1) // necessary for MIN_VALUE / 1
//    return dividend;
//// use negative numbers to avoid overflow, original idea by @brubru777
//if (dividend > 0)
//    return -divide(-dividend, divisor);
//if (divisor > 0)
//    return -divide(dividend, -divisor);
//int shiftedDivisor = divisor;
//int shift = 0;
//while ((shiftedDivisor << 1) < 0) {
//    ++shift;
//    shiftedDivisor <<= 1;
//}
//int quotient = 0;
//int remainder = dividend;
//while (shift >= 0) {
//    if (remainder <= shiftedDivisor) {
//        quotient |= 1 << shift;
//        remainder -= shiftedDivisor;
//    }
//    shiftedDivisor >>= 1;
//    --shift;
//}
//return quotient;