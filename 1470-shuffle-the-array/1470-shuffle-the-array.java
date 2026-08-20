class Solution {
    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[2*n];

        int i = 0, j = 0, k = n;

        while(j < n){
            result[i++] = nums[j++];
            result[i++] = nums[k++];
        }


        return result;

        
    }
}