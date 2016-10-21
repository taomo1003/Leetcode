package leetcoder;

public class no_200 {
	private boolean[][] visited;
    public int numIslands(char[][] grid) {
    	if (grid.length==0) return 0;    	
        visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (visited[i][j]||grid[i][j] == '0') continue;
				visit(i,j,grid);
				count++;
			}
		}
        return count;
        
    }
    
    private void visit(int i, int j, char[][] grid){
    	visited[i][j] = true;
    	if (i>0 && !visited[i-1][j] && grid[i-1][j] == '1') visit(i-1,j,grid);
    	if (j>0 && !visited[i][j-1] && grid[i][j-1] == '1') visit(i,j-1,grid);
    	if (i<grid.length-1 && !visited[i+1][j] && grid[i+1][j] == '1') visit(i+1,j,grid);
    	if (j<grid[0].length-1 && !visited[i][j+1] && grid[i][j+1] == '1') visit(i,j+1,grid);
    }
    
    public static void main(String[] args) {
    	no_200 test = new no_200();
		char[][] grid = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','0','1'}};
		System.out.println(test.numIslands(grid));
    }
}
