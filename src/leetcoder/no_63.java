package leetcoder;

public class no_63 {
	 public int uniquePathsWithObstacles(int[][] obstacleGrid) {
	    int m = obstacleGrid.length;
	    int n = obstacleGrid[0].length;
	    int[][] map = new int[m][n]; 	 

	    if (obstacleGrid[0][0]==1) return 0;
	    else map[0][0]=1;
	    for (int i = 0; i<m; i++){
	    	for (int j = 0; j < n; j++) {
	    		if (i==0&&j==0) continue;
	    		if (obstacleGrid[i][j]==1) map[i][j]=0;
		    	else if (i==0) map[i][j]=map[i][j-1];
		    	else if (j==0) map[i][j]=map[i-1][j];
		    	else map[i][j]=map[i-1][j]+map[i][j-1];
			}
	    }
	    
	    return map[m-1][n-1];
	 }
	 
	 public static void main(String[] args) {
		no_63 test = new no_63();
		int[][] obstacleGrid = {{0}};
		System.out.println(test.uniquePathsWithObstacles(obstacleGrid));
	}
}
