class Solution {
    public int maximumSum(int[] arr) {

        int currSum = arr[0];
        int maxSum = arr[0];
        int delSum = 0;

        for(int i = 1; i < arr.length; i++){

            delSum = Math.max(currSum, delSum + arr[i]);
            currSum = Math.max(currSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, Math.max(delSum, currSum));

        }

        return maxSum;
        
    }
}