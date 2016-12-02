package leetcoder;

public class no_289 {
    public void gameOfLife(int[][] board) {
    	int m = board.length;
    	int n = board[0].length;
        int[][] status = new int[m][n];
        for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j]==1){
					if (i>0)          status[i-1][j]++;
					if (i>0&&j>0)     status[i-1][j-1]++;
					if (i<m-1)        status[i+1][j]++;	
					if (i>0&&j<n-1)   status[i-1][j+1]++;
					if (j>0)          status[i][j-1]++;
					if (j<n-1)        status[i][j+1]++;	
					if (i<m-1&&j<n-1) status[i+1][j+1]++;	
					if (i<m-1&&j>0)   status[i+1][j-1]++;
				}
			}
		}
        
        for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(board[i][j]==1){
					if (status[i][j]<2) {board[i][j]=0; continue;}
					if (status[i][j]>3) {board[i][j]=0; continue;}
				} else {
					if (status[i][j]==3) board[i][j]=1;
				}
			}
		}
    }
}
