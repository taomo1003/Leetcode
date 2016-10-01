package leetcoder;

public class no_231 {
	public boolean isPowerOfTwo(int n) {
        if (n<=0) return false;
        return (Math.log(n)/Math.log(2))%1 < 1e-10? true:false;
    }
	
	public static void main(String[] args) {
		no_231 test = new no_231();
		System.out.println(test.isPowerOfTwo(536870912));
		System.out.println((10-1)&(10));
	}
	
}

//public boolean isPowerOfTwo(int n) {
//    return n < 1?false:((n & (n-1)) == 0);
//}

// or return n > 0 && ((n - 1) & n) == 0;
// note power of 2 should have bitwise structure like 10000, 1000, 100, 10 an so on.

