class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;


        if(target < matrix[0][0] || target > matrix[rows-1][cols-1]){
            return false;
        }
        
        int low = 0, high = rows*cols - 1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            int i = mid / cols;
            int j = mid % cols;

            if(target > matrix[i][j]){
                low = mid + 1;
            }
            else if(target < matrix[i][j]){
                high = mid - 1;
            }
            else{
                return true;
            }
        }

       return false;
    }
}