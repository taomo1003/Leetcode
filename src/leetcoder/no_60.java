package leetcoder;

import java.util.ArrayList;
import java.util.List;

public class no_60 {
    public String getPermutation(int n, int k) {
        long[] fac = new long[n+1];
        List<Integer> nums = new ArrayList<Integer>();
        fac[0]=1;
        fac[1]=1;
        for (int i =1; i < n+1; i++) {
        	fac[i] = fac[i-1]*i;
        	nums.add(i);
        }
        
        StringBuilder sb = new StringBuilder();
        n--;
        while (k>0 && n>0) {
        	int i = 0;
        	while (i*fac[n] < k) {i++;}
        	k -= (i-1)*fac[n];
        	n--;
        	sb.append(String.valueOf(nums.get(i-1)));
        	nums.remove(i-1);
        }
        sb.append(String.valueOf(nums.get(0)));
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
		no_60 test = new no_60();
		for (int i = 1; i< 25; i++){
			System.out.println(test.getPermutation(4, i));
		}
		
	}   
}
