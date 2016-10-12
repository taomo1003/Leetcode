package leetcoder;

public class no_96 {
    public static int numTrees(int n) {
    	int[] fn = new int[n+1];
    	fn[0]=0;
    	fn[1]=1;
        for (int i1 = 2; i1 <= n; i1++) {
			fn[i1] += 2*fn[i1-1];
			for (int k = 0; k < i1-2; k++) {
				fn[i1] += fn[k+1]*fn[i1-2-k];
			}
		}
        return fn[n];
    }
    
    
    public static void main(String[] args) {
		System.out.println(numTrees(2));
	}
}
