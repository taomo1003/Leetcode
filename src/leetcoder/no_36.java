package leetcoder;

public class no_36 {
	 public static boolean isValidSudoku(char[][] board) {
	        int[][][] check = new int [3][9][9];
	        for (int i = 0; i < 9 ; i++){
	            for (int j = 0; j < 9 ;j++){
	                if (board[i][j]=='.'){continue;} 
	                int x = Integer.valueOf(board[i][j])-49;
	                if (check[0][i][x] == 1) {return false;} else {check[0][i][x] = 1;} 
	                if (check[1][j][x] == 1) {return false;} else {check[1][j][x] = 1;} 
	                if (check[2][j/3+3*(i/3)][x] == 1) {return false;} else {check[2][j/3+3*(i/3)][x] = 1;} 
	                
	            }
	        }
	     return true;   
	    }
	 public static void main(String[] args) {	
		 char[][] board = {
				 {'.','.','.','.','.','.','.','.','.'},
				 {'4','.','.','.','.','.','.','.','.'},
				 {'.','.','.','.','.','.','6','.','.'},
				 {'.','.','.','3','8','.','.','.','.'},
				 {'.','5','.','.','.','6','.','.','1'},
				 {'8','.','.','.','.','.','.','.','6'},
				 {'.','.','.','.','.','.','.','.','.'},
				 {'.','.','7','.','9','.','.','.','.'},
				 {'.','.','.','6','.','.','.','.','.'}
		 };
		 
			System.out.println(isValidSudoku(board));
		
		
	}
}
