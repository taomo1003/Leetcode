package leetcoder;

import java.util.HashSet;
import java.util.Iterator;

public class no_130 {
	private boolean[][] visited;
	private boolean change = true; 
	private int m;
	private int n;
	
	private class Pair{
		int i;
		int j;
		Pair(int x, int y){
			i = x;
			j = y;
		}
		public int getX() {
			return i;
		}
		public int getY() {
			return j;
		}
	}
	
    public void solve(char[][] board) {
    	if (board.length==0) return;
    	m = board.length;
    	n = board[0].length;
    	visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
        	for (int j = 0; j < board[0].length; j++) {
        		if (!visited[i][j]&& board[i][j]=='O')
        		{
        			change = true;
        			HashSet<Pair> temp = getUnion(i,j,board);
        			if (change) changeUnion(temp, board);
        		}
        		visited[i][j]=true;
        	}
        }
    }
    
    private HashSet<Pair> getUnion(int i, int j, char[][] board){
    	HashSet<Pair> temp = new HashSet<>();
    	Pair curr = new Pair(i, j);
    	temp.add(curr);
    	if (i==0 || j==0 || i==m-1 || j==n-1) change = false;
    	visited[i][j]=true; 
    	
    	HashSet<Pair> tempSearchSet = new HashSet<>();
    	tempSearchSet.add(curr);
    	
    	while(!tempSearchSet.isEmpty()){
    		Iterator<Pair> it = tempSearchSet.iterator();
    		tempSearchSet = new HashSet<>();
    		while(it.hasNext()){
    			Pair tempPair = it.next();
    			i = tempPair.getX();
    			j = tempPair.getY();
    			if (i-1>=0 && !visited[i-1][j] && board[i-1][j]=='O') 
    				{
    					Pair te = visit(i-1, j, board);
    					temp.add(te);
    					tempSearchSet.add(te);
    				}
    	    	if (j-1>=0 && !visited[i][j-1] && board[i][j-1]=='O') 
					{
						Pair te = visit(i, j-1, board);
						temp.add(te);
						tempSearchSet.add(te);
					}
    	    	if (i+1<m && !visited[i+1][j] && board[i+1][j]=='O') 
					{
    	    			Pair te = visit(i+1, j, board);
    	    			temp.add(te);
    	    			tempSearchSet.add(te);
					}
    	    	if (j+1<n && !visited[i][j+1] && board[i][j+1]=='O') 
					{
	    				Pair te = visit(i, j+1, board);
	    				temp.add(te);
	    				tempSearchSet.add(te);
					}
    		}
    	}
    	return temp;
    } 
    
    private Pair visit(int i ,int j, char[][] board){
    	Pair curr = new Pair(i, j);
    	if (i==0 || j==0 || i==m-1 || j==n-1) change = false;
    	visited[i][j]=true; 
    	return curr;
    }
    
    private void changeUnion(HashSet<Pair> temp , char[][] board){
    	Iterator<Pair> it = temp.iterator();
    	while(it.hasNext()){
    		Pair pair = it.next();
    		board[pair.getX()][pair.getY()] = 'X';
    	}
    }
    
    public static void main(String[] args) {
		no_130 test = new no_130();
		char[][] board = {{'O','O','O'},{'O','O','O'},{'O','O','O'}};
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		test.solve(board);
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
    
}



//public void solve(char[][] board) {
//    if (board == null || board.length == 0) {
//        return;
//    }
//
//    int m = board.length;
//    int n = board[0].length;
//
//    for (int i = 0; i < m; i++) {
//        for (int j = 0; j < n; j++) {
//            if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
//                if (board[i][j] == 'O') {
//                    BFS(board, i, j, m, n);
//                }
//            }
//        }
//    }
//
//    for (int i = 0; i < m; i++) {
//        for (int j = 0; j < n; j++) {
//            if (board[i][j] == 'O') {
//                board[i][j] = 'X';
//            } else if (board[i][j] == '1') {
//                board[i][j] = 'O';
//            }
//        }
//    }
//}
//
//public void BFS(char[][] board, int i, int j, int m, int n) {
//    if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != 'O') {
//        return;
//    }
//
//    board[i][j] = '1';
//    if (i + 1 < m) {
//        BFS(board, i + 1, j, m, n);
//    }
//    if (i > 1) {
//        BFS(board, i - 1, j, m, n);
//    }
//    if (j + 1 < n) {
//        BFS(board, i, j + 1, m, n);
//    }
//    if (j > 1) {
//        BFS(board, i, j - 1, m, n);
//    }
//}