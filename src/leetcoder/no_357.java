package leetcoder;

public class no_357 {
    public static int countNumbersWithUniqueDigits(int n) {
        if (n==0) return 1;
        int ans = 10;
        int prod = 9;
        int current = 9;
        while (n > 1 && prod>0){
        	current *= prod--;
        	ans += current;
        	n--;
        }
    	return ans;
    }
    
    public static void main(String[] args) {
		System.out.println(no_357.countNumbersWithUniqueDigits(4));
	}
}
