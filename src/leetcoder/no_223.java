package leetcoder;

public class no_223 {
	 public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
	        long intersect;
	        long a = Math.min(C,G);
	        long b = Math.max(A,E);
	        long c = Math.min(D,H);
	        long d = Math.max(B,F);
	        if ((a-b)<0 ||(c-d)<0) intersect = 0; else intersect = (a-b)*(c-d);
	        return (int)((long)((C-A)*(D-B)+(G-E)*(H-F))-intersect);
	        }
	 
	 
	 public static void main(String[] args) {
		 no_223 test = new no_223();
		 
		System.out.println(test.computeArea(-1500000001,
				0,
				-1500000000,
				1,
				1500000000,
				0,
				1500000001,
				1));
	}
}
