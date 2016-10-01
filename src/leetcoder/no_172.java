package leetcoder;

public class no_172 {
	public static int trailingZeroes(int n) {
            int count = 0;
            int pow5 = 2; 
            int temp = (int) Math.pow(5, pow5);
            while (temp<=n) {
            	count++;
            	if (temp*2<=n) {count++;};
            	if (temp*3<=n) {count++;};
            	if (temp*4<=n) {count++;};
            	pow5++;
            	temp = (int) Math.pow(5, pow5);
            	};
            
	        return n/5+count;
	    }
	
	public static void main(String[] args) {
		System.out.println(trailingZeroes(75));
	}
	
}


//public static int trailingZeroes(int n) {
//          return n==0 ? 0 : n/5 + trailingZeroes(n/5);
//}