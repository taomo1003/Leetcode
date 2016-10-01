package leetcoder;

public class no_326 {
	 public boolean isPowerOfThree(int n) {
	        return Math.round(Math.log(n)/Math.log(3)*100000000)%100000000 < 1e-5? true:false;
	    }
	 
	 
	 public static void main(String[] args) {
		no_326 test = new no_326();
		System.out.println(test.isPowerOfThree(3));
		System.out.println(Math.log(19682)/Math.log(3));
		System.out.println(Math.round(Math.log(19682)/Math.log(3)*10)%10);
	}
}


//public boolean isPowerOfThree(int n) {
//    // 1162261467 is 3^19,  3^20 is bigger than int  
//    return ( n>0 &&  1162261467%n==0);
//}
