package leetcoder;

public class no_371 {
	 public static int getSum(int a, int b) {
		 // Iterate till there is no carry  
		    while (b != 0)
		    {
		        // carry now contains common set bits of x and y
		        int carry = a & b;  
		 
		        // Sum of bits of x and y where at least one of the bits is not set
		        a = a ^ b; 
		 
		        // Carry is shifted by one so that adding it to x gives the required sum
		        b = carry << 1;
		    }
		    return a; 
	}
	 
	 public static void main(String[] args) {
		System.out.println(getSum(34,44));
	}
}
