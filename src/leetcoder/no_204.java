package leetcoder;

public class no_204 {
	public int countPrimes(int n) {
		if(n<=1) return 0;
        int[] num = new int[n+1];
        int  count= 0;
        for (int i=2; i< n;i++){
            for (int j=2; i*j<n ; j++){
                num[i*j] =1;
            }
        }
        for (int i = 2; i< n; i++){
            count += num[i];
        }
        return n- count-2;
    }	
	
	public static void main(String[] args) {
		no_204 test = new no_204();
		System.out.println(test.countPrimes(2));
	}
}
