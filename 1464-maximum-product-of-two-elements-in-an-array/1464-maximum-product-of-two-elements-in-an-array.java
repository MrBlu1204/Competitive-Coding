class Solution {
    public int maxProduct(int[] nums) {

        if(nums.length ==2){
            return (nums[0]-1) * (nums[1] -1);
        }

        Arrays.sort(nums);
        int len = nums.length;

        return Math.max((nums[len-1] - 1) * (nums[len-2] - 1), (nums[0] - 1) * (nums[1] -1));
        
    }
}