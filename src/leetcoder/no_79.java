package leetcoder;

public class no_79 {
	private boolean checkResult = false;
    public boolean exist(char[][] board, String word) {
    	if (board.length==0) return word.length()==0;
    	if (board[0].length==0) return word.length()==0;
    	if (word.length() == 0) return true;
    	
    	char[] target = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j]==target[0]) {
					board[i][j] = '$';
					check(i,j,1,board,target); 
					board[i][j] = target[0];
				}
				if (checkResult) return checkResult;
			}
		}
    	return checkResult;
    }
    
    public void check(int i, int j, int k, char[][] board,char[] target) {
		if (k == target.length) {checkResult = true; return;}
		if (i>0) {if (board[i-1][j] == target[k]){
			board[i-1][j] = '$';
			check(i-1,j,k+1,board,target); 
			board[i-1][j] = target[k];
		}}
		if (j>0) {if (board[i][j-1] == target[k]){
			board[i][j-1] = '$';
			check(i,j-1,k+1,board,target); 
			board[i][j-1] = target[k];
		}}
		if (i<board.length-1) {if (board[i+1][j] == target[k]){
			board[i+1][j] = '$';
			check(i+1,j,k+1,board,target); 
			board[i+1][j] = target[k];
		}}
		if (j<board[0].length-1) {if (board[i][j+1] == target[k]){
			board[i][j+1] = '$';
			check(i,j+1,k+1,board,target); 
			board[i][j+1] = target[k];
		}}
		
	}
    
    public static void main(String[] args) {
		no_79 test = new no_79();
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCB";
		System.out.println(test.exist(board, word));
	}
}



//private boolean exist(char[][] board, int y, int x, char[] word, int i) {
//	if (i == word.length) return true;
//	if (y<0 || x<0 || y == board.length || x == board[y].length) return false;
//	if (board[y][x] != word[i]) return false;
//	board[y][x] ^= 256;
//	boolean exist = exist(board, y, x+1, word, i+1)
//		|| exist(board, y, x-1, word, i+1)
//		|| exist(board, y+1, x, word, i+1)
//		|| exist(board, y-1, x, word, i+1);
//	board[y][x] ^= 256;
//	return exist;
//}