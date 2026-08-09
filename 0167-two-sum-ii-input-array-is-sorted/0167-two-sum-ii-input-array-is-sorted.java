class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int l = 0, r = numbers.length - 1;

        int sum;

        while(l < r){
            sum = numbers[l] + numbers[r];

            if(sum == target){
                return new int[] { l + 1, r + 1 };
            }
            else if( sum > target){
                r--;
            }
            else{
                l++;
            }
            
        }

        return new int[0];
        
    }
}