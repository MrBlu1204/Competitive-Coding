class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length;

        for(int i = 1; i<n; i++){
            nums[i] = nums[i] + nums[i-1];
        }

        int sum = nums[n-1];

        if(nums[0] == sum){
            return 0;
        }

        for(int i = 1; i < n; i++){
            if(nums[i] == sum - nums[i-1]){
                return i;
            }
        }
        
        return -1;
    }
}