class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length - 1;
        int cols = matrix[0].length -1;

        boolean present = false;

        if(target < matrix[0][0] || target > matrix[rows][cols]){
            return present;
        }
        
        int low = 0, high = rows;
        
        while(low <= high){
            int i = low + (high-low)/2;

            if(target > matrix[i][cols]){
                low = i + 1;
            }
            else if(target < matrix[i][0]){
                high = i - 1;
            }
            else{
                break;
            }
        }

        if(!(low<=high)){
            return present;
        }
        int i = low + (high-low)/2;

        low = 0;
        high = cols;

        while(low <= high){
            int j = low + (high-low)/2;

            if(target > matrix[i][j]){
                low = j + 1;
            }
            else if(target < matrix[i][j]){
                high = j - 1;
            }
            else{
                return true;
            }
        }

        return present;
    }
}