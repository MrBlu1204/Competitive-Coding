class Solution {
    public int majorityElement(int[] nums) {
        int result = nums[0];
        int count = 0;

        for(int num : nums){
            if(count == 0){
                result = num;
                count++;
            }
            else if(result == num){
                count++;
            }else{
                count--;
            }
        }

        return result;
        
    }
}