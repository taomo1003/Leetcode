package leetcoder;

public class no_190 {
	 public static long reverseBits(int n) {
		 //from https://discuss.leetcode.com/topic/42572/sharing-my-2ms-java-solution-with-explanation/2
		 if (n == 0) return 0;
		    
		    int result = 0;
		    for (int i = 0; i < 32; i++) {
		        result <<= 1;
		        if ((n & 1) == 1) result++;
		        n >>= 1;
		    }
		    return result;

	    }
	 
	 
	 public static void main(String[] args) {
		System.out.println(reverseBits(43261596));
	}
	 
	 
}
