package leetcoder;

public class no_59 {
    public int[][] generateMatrix(int n) {
        if (n==0) return new int[0][0];
        int[][] matrix = new int[n][n];
        
        int ptl = 0 ;
        int ptr = n ;
        int ptu = 0 ;
        int ptd = n ;
        
        int index = 1;
        int i=0;
        int j=0;
        while(index<=n*n){
        	while(j<ptr){
        		matrix[i][j] = index;
        		j++;
        		index++;
        		if (index > n*n) return matrix;
        	}
        	j--;
        	i++;
        	while(i<ptd){
        		matrix[i][j] = index;
        		i++;
        		index++;
        		if (index > n*n) return matrix;
        	}
        	i--;
        	j--;
        	while(j>=ptl){
        		matrix[i][j] = index;
        		j--;
        		index++;
        		if (index > n*n) return matrix;
        	}
        	j++;
        	i--;
        	while(i>=ptu+1){
        		matrix[i][j] = index;
        		i--;
        		index++;
        		if (index > n*n) return matrix;
        	}
        	i++;
        	j++;
        	ptr--;
        	ptl++;
        	ptu++;
        	ptd--;
        	
        }
        return matrix;
    }
    
    public static void main(String[] args) {
		no_59 test = new no_59();
		int[][] testresult = test.generateMatrix(5);
		System.out.println();
	}
}
