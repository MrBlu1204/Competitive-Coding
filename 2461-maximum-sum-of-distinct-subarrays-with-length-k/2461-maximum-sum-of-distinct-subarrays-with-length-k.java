class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        long result = 0;
        long currSum = 0;

        Map<Integer, Integer> freq =  new HashMap<>();

        for(int i = 0; i < nums.length && i <k; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            currSum += nums[i];
        }

        if(freq.size() == k){
            result = currSum;
        }

        for(int i = k; i < nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            currSum += nums[i];

            freq.put(nums[i-k], freq.get(nums[i-k])-1);
            

            if(freq.get(nums[i-k])==0){
                freq.remove(nums[i-k]);
            }

            currSum -= nums[i-k];

            if(freq.size() == k){
                result = Math.max(result, currSum);
            }


        }

        return result;
        
    }
}