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
            int currSum = 0;
            int count = 1;

            for(int num : nums){
                currSum += num;
                if(currSum > mid){
                    count++;
                    currSum = num;
                }

                if(count > k){
                    break;
                }
            }

            if(count <= k){
                result = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }

        }

        return result;
        
    }
}