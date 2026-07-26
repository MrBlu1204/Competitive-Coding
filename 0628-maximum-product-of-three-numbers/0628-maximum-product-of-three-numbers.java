class Solution {
    public int maximumProduct(int[] nums) {

        int product;

        if(nums.length == 3){
            return nums[0] * nums[1] * nums[2];
        }

        Arrays.sort(nums);
        int len = nums.length;

        product = nums[len-1] * nums[len-2] * nums[len-3];

        if(nums[1]<0 && nums[len-1] >0 && (nums[0] * nums[1] * nums[len-1]) > product){
            product = nums[0] * nums[1] * nums[len-1];
        }

        return product;
        
    }
}