class Solution {
    private static final int[][] directions = {{1,0}, {-1,0},
                                                {0,1}, {0,-1}};

    int[][] longestPath;

    public int dfs(int[][] matrix, int row, int col, int preValue){
        if(row<0 || col<0 || row >= matrix.length || col >= matrix[0].length || matrix[row][col] <= preValue){
            return 0;
        }

        if(longestPath[row][col] != -1){
            return longestPath[row][col];
        }

        int len = 1;

        for(int[] dir : directions){
            len = Math.max(len, 1 + dfs(matrix, row + dir[0], col + dir[1], matrix[row][col]));
        }

        longestPath[row][col] = len;

        return len;
    }

    public int longestIncreasingPath(int[][] matrix) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int result = 0;

        longestPath = new int[rows][cols];

        for(int r = 0; r< rows; r++){
            for(int c = 0; c<cols; c++){
                longestPath[r][c] = -1;
            }
        }

        for(int r = 0; r < rows; r++){
            for(int c = 0; c< cols; c++){
                result = Math.max(result, dfs(matrix, r, c, Integer.MIN_VALUE));
            }
        }

        return result;
    }
}