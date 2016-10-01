package leetcoder;

public class no_342 {
	 public boolean isPowerOfFour(int num) {
		    if (num==1) return true;
	        if (num<4) return true;
	        return (Math.log(num)/Math.log(4)%1 ==0);
	    }
	 
	 public static void main(String[] args) {
		 
		 
	 }
}
