class Solution {
    public int removeDuplicates(int[] nums) {

        int k = 0;

        if(nums.length == 1){
            return k+1;
        }

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[k]){
                continue;
            }
            k++;
            nums[k] = nums[i];
        }

        return k+1;
        
    }
}