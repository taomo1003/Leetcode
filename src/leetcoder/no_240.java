package leetcoder;

public class no_240 {
    public boolean searchMatrix(int[][] matrix, int target) {
    	if(matrix.length ==0) return false; 
    	int r = 0;
    	int c = matrix[0].length-1;
    	while (c>=0 && r<matrix.length){
    		if (matrix[r][c]==target) return true;
    		if (matrix[r][c]>target) c--;
    		else r++;
    	}
    	return false;
    }
    
    
    public static void main(String[] args) {
		no_240 test = new no_240();
		int[][] matrix = {{-1},{-1}};
		
		System.out.print(test.searchMatrix(matrix, 0));
	}
}


//my solution original

//public boolean searchMatrix(int[][] matrix, int target) {
//	if(matrix.length==0) return false;
//    return solve(0, matrix.length-1, 0 , matrix[0].length-1, matrix, target);
//}
//
//public boolean solve(int startm, int endm,int startn, int endn, int[][] matrix, int target) {
//	if (startm>endm || startn>endn) return false;
//	int midm = startm + (endm-startm)/2;
//	int midn = startn + (endn-startn)/2;
//	if (matrix[midm][midn] == target) return true;
//	if (matrix[midm][midn] > target) {
//		return solve(startm, midm-1, startn, endn, matrix, target) || 
//				solve(midm, endm, startn, midn-1, matrix, target);
//	}
//	else {
//		return solve(midm+1, endm, startn, endn, matrix, target) || 
//				solve(startm, midm, midn+1, endn, matrix, target);
//	}
//}