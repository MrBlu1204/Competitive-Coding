class Solution {
    public void setZeroes(int[][] matrix) {

        boolean firstRowZero = false;
        boolean firstColZero = false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int row =0; row < rows; row++){
            for(int col =0; col < cols; col++ ){
                if(matrix[row][col]==0){
                    if(row==0){
                        firstRowZero = true;
                    }
                    if(col==0){
                        firstColZero = true;
                    }

                    matrix[0][col] = 0;
                    matrix[row][0] = 0;
                }
            }
        }

        for(int row = 1; row < rows; row++){
            for(int col = 1; col < cols; col++){
                if(matrix[0][col] == 0 || matrix[row][0] == 0){
                    matrix[row][col]=0;
                }
            }
        }

        if(firstRowZero){
            for(int col = 0; col < cols; col++){
                matrix[0][col] = 0;
            }
        }

        if(firstColZero){
            for(int row = 0; row < rows; row++){
                matrix[row][0] = 0;
            }
        }
        
    }
}