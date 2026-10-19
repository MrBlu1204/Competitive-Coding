class Solution {
    public int[] sortedSquares(int[] nums) {

        int n  = nums.length;

        int[] result = new int[n];

        int left = 0;
        int right  = n-1;

        for(int i =n-1; i>= 0; i--){
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if(leftSq > rightSq){
                result[i] = leftSq;
                left++;
            }else{
                result[i] = rightSq;
                right--;
            }
        }

        return result;
        
    }
}