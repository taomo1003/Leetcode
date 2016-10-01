package leetcoder;

import java.util.HashSet;
import java.util.Iterator;

public class no_73 {
    public void setZeroes(int[][] matrix) {
    	if (matrix.length==0) return;
        HashSet<Integer> badR = new HashSet<>();
        HashSet<Integer> badC = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j]==0) {
					badR.add(i);
					badC.add(j);
				}
			}
		}

        Iterator<Integer> iterator  =  badR.iterator();
        while (iterator.hasNext()) {
			matrix = remove(iterator.next(), 0, matrix);
		}
        iterator  =  badC.iterator();
        while (iterator.hasNext()) {
        	matrix = remove(iterator.next(), 1, matrix);
		}
    }
    
    public int[][] remove(int i, int j, int[][] matrix) {
    	if (j ==1) {
        for(int k = 0; k < matrix.length; k++){
        	matrix[k][i] = 0;
        }}
        else {
        for(int l = 0; l < matrix[0].length; l++){
            	matrix[i][l] = 0;
        }
		}
		return matrix;
	}
    
    public static void main(String[] args) {
		no_73 test = new no_73();
		//int[][] matrix = {{0,0,0,5},{4,3,1,4},{0,1,1,4},{1,2,1,3},{0,0,1,1}};
		int[][] matrix = {{1,0}};
		test.setZeroes(matrix);
	}
}
