class Solution {
    public long maxAlternatingSum(int[] nums) {

        long result = 0;

        for(int i = 0; i < nums.length ; i++){
            nums[i] *= nums[i];
        }

        Arrays.sort(nums);

        int right = nums.length - 1;
        int left  = 0;

        while(left < right){
            result = result + nums[right] - nums[left];
            right--;
            left++;
        }

        if(left == right){
            result += nums[right];
        }

        return result;
        
    }
}