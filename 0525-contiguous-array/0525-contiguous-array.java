class Solution {
    public int findMaxLength(int[] nums) {

        int prefixSum = 0;
        
        Map<Integer, Integer> sum = new HashMap<>();
        sum.put(0,-1);

        int maxLen = 0;

        for(int i = 0; i < nums.length; i++){

            prefixSum += (nums[i] == 0) ? -1 : 1;

            if(sum.containsKey(prefixSum)){
                maxLen = Math.max(maxLen, i - sum.get(prefixSum));
            }else{
                sum.put(prefixSum, i);
            }

        }

        return maxLen;
        
    }
}