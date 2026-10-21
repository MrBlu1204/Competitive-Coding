class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {

        long count = 0;

        int lastMin = -1;
        int lastMax = -1;
        int lastBad = -1;

        for(int i = 0; i< nums.length; i++){

            if(nums[i] < minK || nums[i] > maxK){
                lastBad = i;
            }

            if(nums[i] == minK){
                lastMin = i;
            }

            if(nums[i] == maxK){
                lastMax = i;
            }

            int validStart = Math.min(lastMin, lastMax) - lastBad;

            if(validStart > 0){
                count += validStart;
            }
        }

        return count;
        
    }
}