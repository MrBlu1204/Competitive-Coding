class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = lowerBound(nums, target);
        if(left == nums.length || nums[left] != target){
            return new int[]{-1,-1};
        }
        int right = upperBound(nums, target) -1;

        return new int[]{left,right};
        
    }

    private int lowerBound(int[] nums, int target){
        int left = 0;
        int right = nums.length;

        while(left < right){
            int mid = left + (right - left)/2;

            if(nums[mid] < target){
                left = mid+1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    private int upperBound(int[] nums, int target){
        int left = 0;
        int right = nums.length;

        while(left < right){
            int mid = left + (right - left)/2;

            if(nums[mid] <= target){
                left = mid+1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}