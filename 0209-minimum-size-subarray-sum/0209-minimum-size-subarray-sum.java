class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int result = Integer.MAX_VALUE;

        int left = 0;
        int currentSum = 0;
        
        for(int right = 0; right < nums.length ; right++){
            currentSum += nums[right];

            while(currentSum>=target){
                result = Math.min(result, right - left + 1);
                currentSum -= nums[left];
                left++;
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
        
    }
}