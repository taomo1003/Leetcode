package leetcoder;

public class no_64 {
    public int minPathSum(int[][] grid) {
	    int m = grid.length;
	    int n = grid[0].length;
    	if (m*n ==0) return 0;
	    int[][] map = new int[m][n];
	    map[0][0] = grid[0][0];
	    for (int i = 0; i<m; i++){
	    	for (int j = 0; j < n; j++) {
	    		if (i==0&&j==0) continue;
	    		if (i==0) map[i][j]=map[i][j-1]+grid[i][j];
		    	else if (j==0) map[i][j]=map[i-1][j]+grid[i][j];
		    	else map[i][j]=Math.min(map[i-1][j], map[i][j-1])+grid[i][j];
			}
	    }
	    
	    return map[m-1][n-1];
    }
}
