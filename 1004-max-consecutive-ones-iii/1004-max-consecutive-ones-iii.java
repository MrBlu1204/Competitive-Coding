class Solution {
    public int longestOnes(int[] nums, int k) {

        int flips = 0;
        int left = 0;
        for(int right = 0; right< nums.length; right++){

            if(nums[right] == 0){
                flips++;
            }

            if(flips> k){
                if(nums[left]==0){
                    flips--;
                }
                left++;
            }


        }

        return nums.length - left;
        
    }
}