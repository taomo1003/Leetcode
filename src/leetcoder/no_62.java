package leetcoder;

public class no_62 {
    public int uniquePaths(int m, int n) {
    	//Start from zero;
    	m--;
    	n--;
        return combination(m+n,Math.min(n,m));
    }
    
    public int combination(int m, int n) {
    	long deno = 1;
    	long divi = 1;
		while(n>=1){
			deno *= m;
			divi *= n;
			m--;
			n--;
		}
		return (int)(deno/divi) ;
	}
    
    public static void main(String[] args) {
		no_62 test = new no_62();
		System.out.println(test.uniquePaths(1, 1));
	}
    
}


//public int uniquePaths(int m, int n){
//    int S=m+n-2, M=m-1;double sum=1;
//    for(int i=1;i<=M;i++){
//        sum=sum*(S-M+i)/i;
//    }
//    return (int)sum;
//}
