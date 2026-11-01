class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int left = 0;
        int sum = 0;
        int count = 0;

        Map<Integer, Integer> prefixSum = new HashMap<>();

        prefixSum.put(0,1);

        for(int right = 0; right < nums.length ; right++){
            sum += nums[right];
            int diff = (( sum % k ) + k ) % k;

            if(prefixSum.containsKey(diff)){
                count += prefixSum.get(diff);
            }

            prefixSum.put(diff, prefixSum.getOrDefault(diff,0) + 1);
        }

        return count;
        
    }
}