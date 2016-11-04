package leetcoder;

public class no_221 {
	private int[][] keep;
	
    public int maximalSquare(char[][] matrix) {
    	if (matrix.length==0) return 0;
        keep= new int[matrix.length][matrix[0].length];
        int temp = solve(matrix.length-1, matrix[0].length-1, matrix);
        return temp*temp;
    }
    
    public int solve(int i, int j, char[][] matrix) {
		if (i<0||j<0) return 0;
		if (keep[i][j]!=0) return keep[i][j];
		if (matrix[i][j]=='0') keep[i][j] = Math.max(solve(i-1, j, matrix), solve(i, j-1, matrix));
		else keep[i][j] = Math.max(grow(i,j,matrix),Math.max(solve(i-1, j, matrix), solve(i, j-1, matrix)));
		return keep[i][j];
	}
    
    public int grow(int i, int j , char[][] matrix) {
    	int count=1;
    	int tempi = i-1;
    	int tempj = j-1;
    	
		while (tempi>=0&&tempj>=0){
			for(int k = tempj; k<= j ; k++){
				if(matrix[tempi][k]=='0') return count;
			}
			for(int k = tempi+1; k<= i ; k++){
				if(matrix[k][tempj]=='0') return count;
			}
			tempi--;
			tempj--;
			count++;	
		}
		return count;
	}
    
    public static void main(String[] args) {
		char[][] matrix = {{'1','0','1','0','0'},
						   {'1','0','1','1','1'},
						   {'1','1','1','1','1'},
						   {'1','0','0','1','0'}};
		no_221 test = new no_221();
		
		System.out.println(test.maximalSquare(matrix));
	}
    
    
}
