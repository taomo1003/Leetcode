package leetcoder;

public class no_74 {
    public boolean searchMatrix(int[][] matrix, int target) {
    	if(matrix.length == 0) return false;
    	if(matrix[0].length == 0) return false;
    	//if(matrix.length==1 && )
    	int k =0;
        int[] result = binarySearch(matrix, true, target, k);
        if (result.length==1) return true;
        if (matrix[result[1]][0] > target) k= result[0]; else k = result[1];  
        result = binarySearch(matrix, false, target, k);
        if (result.length==1) return true;
        else return matrix[k][result[0]] == target || matrix[k][result[1]] == target;

    }
    
    public int[] binarySearch(int[][] matrix, boolean first, int target, int k) {
    	int i = 0;
    	int j;
    	if (first) j = matrix.length-1; else j  = matrix[0].length-1;
    	
    	while(i<j-1) {
    		int mid = i+ (j-i)/2;
    		int num;
    		//k is the index for which line or column to search.
    		if (first) num = matrix[mid][k]; else num = matrix[k][mid];
    		if (num > target) j = mid-1;
    		else if (num < target) i = mid;
    		else return new int[] {mid};
    	}
    	return new int[] {i,j};
	}
    
    
    public static void main(String[] args) {
		no_74 test = new no_74();
		int[][] matrix = {{2}};
		System.out.println(test.searchMatrix(matrix, 1));
	}
}
