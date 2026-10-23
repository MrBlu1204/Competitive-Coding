class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int i = 0;
        int sum = 0;

        while(i < k && i < nums.length){
            sum += nums[i];
            i++;
        }

        double result = sum;

        while(i < nums.length){
            sum = sum + nums[i] - nums[i-k];
            result = Math.max(result, sum);
            i++;
        }

        return (double) result/k;
        
    }
}