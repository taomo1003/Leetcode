package leetcoder;

public class no_48 {
    public void rotate(int[][] matrix) {
    	int n = matrix.length-1;
        if (n<1) return;
        for (int k = 0; k <n; k++){
        	for (int i = k; i<n ;i++){
        		int temp = matrix[k][i];
        		matrix[k][i] = matrix[n-i][k];
        		matrix[n-i][k] = matrix[n-k][n-i];
        		matrix[n-k][n-i] = matrix[i][n-k];
        		matrix[i][n-k] = temp;
        	}
        }
        
    }
    
    public static void main(String[] args) {
		int[][] matrix = {{1,2},{3,4}};
		no_48 test = new no_48();
		test.rotate(matrix);
		System.out.println(matrix);
	}
    
}
