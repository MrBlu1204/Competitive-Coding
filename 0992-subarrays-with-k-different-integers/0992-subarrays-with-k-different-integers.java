class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums, k-1);
    }

    private int atMost(int[] nums, int k){
        int n = nums.length;

        int[] freq = new int[n+1];

        int left = 0;
        int distinct = 0;
        int result = 0;

        for(int right = 0; right < n; right++){
            if(freq[nums[right]] == 0){
                distinct++;
            }

            freq[nums[right]]++;

            while(distinct > k){
                freq[nums[left]]--;
                if(freq[nums[left]]==0){
                    distinct--;
                }
                left++;
            }

            result += right - left + 1;
        }

        return result;
    }
}