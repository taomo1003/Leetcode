package leetcoder;

public class no_396 {
    public int maxRotateFunction(int[] A) {
    	  int F = 0;
          int sum = 0;
          int res = Integer.MIN_VALUE;
          int n = A.length;
          if( n <= 1) return 0;
          for( int i = 0; i < n; i++){
          	F += i*A[i];
          	sum += A[i];
          }
          if( F > res) res = F;
          for(int k = 1; k < n; k++){
          	F += sum;
          	F -= n*A[n-k];
          	if(F > res) res = F;
          }
          return res;
    }
}




//Find rules:
//
//F0 = 0 + 1a1 + 2a2 + 3a3
//
//F1 = F0 + a0 + a1 + a2 - 3a3 = F0 + a0 + a1 + a2 + a3 - 4a3
//
//F2 = F1 + a3 + a0 + a1 - 3a2 = F1 + a0 + a1 + a2 + a3 - 4a2
//
//F3 = F2 + a2 + a3 + a0 - 3a1 = F2 + a0 + a1 + a2 + a3 - 4a1

