class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int result = Integer.MIN_VALUE;
        int diff = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length -2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            
            int j =  i+1;
            int k = nums.length - 1;

            while(j<k){
                int currSum = nums[i] + nums[j] + nums[k];
                int currDiff = Math.abs(target - currSum);
                if(currDiff<diff){
                    result = currSum;
                    diff = currDiff;
                }
                

                if(currSum > target){
                    k--;
                }else if(currSum < target){
                    j++;
                }else{
                    return currSum;
                }
            }

        }

        return result;
        
    }
}