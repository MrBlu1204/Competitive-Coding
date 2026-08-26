class Solution {
    public long zeroFilledSubarray(int[] nums) {

        long subArrays = 0;
        long consecutiveZeros = 0;

        for(int num : nums){
            if(num == 0){
                consecutiveZeros++;

                subArrays += consecutiveZeros;
            }else{
                consecutiveZeros = 0;
            }

        }

        return subArrays;
        
    }
}