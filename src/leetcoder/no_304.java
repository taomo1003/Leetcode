package leetcoder;

public class no_304 {
	
	public class NumMatrix {
	private int[][] matrixSum;
	
    public NumMatrix(int[][] matrix) {
    	if (matrix.length==0) return;
    	matrixSum = new int[matrix.length][matrix[0].length];
    	
    	matrixSum[0][0] = matrix[0][0];
    	
    	for (int i = 1; i < matrix.length; i++) {
			matrixSum[i][0] = matrix[i][0] + matrixSum[i-1][0];
		}
    	for (int i = 1; i < matrix[0].length; i++) {
			matrixSum[0][i] = matrix[0][i] + matrixSum[0][i-1];
		}
    	
        for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {			
				matrixSum[i][j] = matrixSum[i-1][j] + matrixSum[i][j-1] - matrixSum[i-1][j-1] +matrix[i][j];
				
			}
		}
        
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
    	if (row1==0 && col1 == 0) return matrixSum[row2][col2];
    	else if (row1==0) return matrixSum[row2][col2] - matrixSum[row2][col1-1];
    	else if (col1==0) return matrixSum[row2][col2] - matrixSum[row1-1][col2];
    	else return matrixSum[row2][col2] - matrixSum[row1-1][col2] - matrixSum[row2][col1-1] + matrixSum[row1-1][col1-1];
    }
    
	}
	
	
}
