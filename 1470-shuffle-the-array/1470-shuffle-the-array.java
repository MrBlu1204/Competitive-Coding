class Solution {
    public int[] shuffle(int[] nums, int n) {

       int max = 1001;  //1 <= nums[i] <= 10^3

       for(int i = 0; i < n ; i++){
        nums[2*i+1] += (nums[n+i]%max)*max;
        nums[2*i] += (nums[i]%max)*max;
       }

       for(int i = 0; i<2*n ;i++){
        nums[i] /=max;
       }
        
        return nums;
    }
}