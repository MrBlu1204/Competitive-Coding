class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        int left = 0;
        int sum = 0;

        Map<Integer, Integer> prefixSum = new HashMap<>();

        prefixSum.put(0,-1);

        for(int right = 0; right < nums.length ; right++){
            sum += nums[right];
            int diff = (( sum % k ) + k ) % k;

            if(prefixSum.containsKey(diff) && (right - prefixSum.get(diff)) >= 2){
                return true;
            }

            prefixSum.putIfAbsent(diff, right);
        }

        return false;
        
    }
}