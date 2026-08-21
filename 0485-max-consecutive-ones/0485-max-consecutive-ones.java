class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxOnes =0;

        for(int i : nums){
            if(i==0)
                count=0;
            else{
                count++;
            }
            maxOnes = Math.max(count, maxOnes);
        }

        return maxOnes;
        
    }
}