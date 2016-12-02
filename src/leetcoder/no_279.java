package leetcoder;

public class no_279 {
    public static int numSquares(int n) {
        int[] keep = new int[n+1];
        int i = 1;
        while (i*i<=n){
        	keep[i*i]= 1;
        	i++;
        }
        if (keep[n] != 0) return keep[n];
        
        i = 2;
        while (i<=n){
        	if (keep[i]==0) {
        		int l = 1;
        		int r = i-1;
        		int min = Integer.MAX_VALUE;
        		while (l<=r){
        			if (min > keep[l]+keep[r]) min = keep[l]+keep[r];
        			l++;
        			r--;
        		}
        		keep[i] = min;
        	}
        	i++;
        }
        return keep[n];
    }
    
    public static void main(String[] args) {
		System.out.println(numSquares(13));
	}
}
