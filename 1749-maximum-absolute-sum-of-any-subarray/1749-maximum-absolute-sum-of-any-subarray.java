class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int currMax = 0;
        int currMin = 0;
        int maxSum = 0;
        int minSum = 0;

        for(int num : nums){
            currMax = Math.max(currMax + num, num);
            currMin = Math.min(currMin + num, num);

            maxSum = Math.max(currMax, maxSum);
            minSum = Math.min(currMin, minSum); 
        }

        return Math.max(maxSum, Math.abs(minSum));
        
    }
}