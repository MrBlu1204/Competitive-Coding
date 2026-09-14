class Solution {
    public static final int[][] directions = {{1,0}, {-1,0},
                                                    {0,1}, {0,-1}};


    public int numIslands(char[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int islands = 0;


        for(int r=0; r<rows; r++){
            for(int c=0; c< cols; c++){
                if(grid[r][c] == '1'){
                    dfs(grid,r,c);
                    islands++;
                }
            }
        }

        return islands;      
        
    }

    private void dfs(char[][] grid, int row, int col){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == '0'){
            return;
        }

        grid[row][col] = '0';

        for(int[] dir : directions){
            dfs(grid, row + dir[0] , col + dir[1]);
        }
    }
}