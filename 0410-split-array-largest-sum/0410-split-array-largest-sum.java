class Solution {
    public int splitArray(int[] nums, int k) {

        int n = nums.length;
        int left = Integer.MIN_VALUE;
        int right = 0;
        for(int num : nums){
            left = Math.max(left, num);
            right += num;
        }

        int result = right;

        while(left <= right){

            int mid = left + (right - left)/2;

            if(canSplit(nums, k, mid)){
                result = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }

        }

        return result;
        
    }


    private boolean canSplit(int[] nums, int k, long maxSum) {
    int subarrays = 1;
    long currentSum = 0;

    for (int num : nums) {
        currentSum += num;
        if (currentSum > maxSum) {
            subarrays++;
            currentSum = num;
            if (subarrays > k) return false;
        }
    }

    return true;
}
}