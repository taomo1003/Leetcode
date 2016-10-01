package leetcoder;

public class no_9 {
    public static boolean isPalindrome(int x) {
        int x1 = 0;
        int x2 =x;
        while (x>0)
        {
          x1 = x1*10+x%10;
          x = (x-x%10)/10;
        }
        return x2==x1;
    }
    
	public static void main(String[] args) {
		System.out.print(isPalindrome(1));
	}
}
