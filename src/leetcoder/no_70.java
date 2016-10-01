package leetcoder;

public class no_70 {
	 public static int climbStairs(int n) {
	return (int)Math.round(((Math.pow(((1+Math.sqrt(5))/2), n+1)-Math.pow(((1-Math.sqrt(5))/2), n+1)))/Math.sqrt(5));
	  }
	
	 public static void main(String[] args) {
		 
		System.out.println(climbStairs(44));
	}
}
