class Solution {
    public int[] productExceptSelf(int[] nums) {

        int product = 1;
        int zero = 0;

        for(int num: nums){
            if(num == 0){
                zero++;
                continue;
            }
            product *= num;
        }
        
        int[] answer = new int[nums.length];

        for(int i = 0; i< nums.length; i++){
            if(zero == 0){
                answer[i] = product/nums[i];
            }
            else if(zero==1 && (nums[i] == 0)){
                answer[i] = product;
            }
            else{
                answer[i] = 0;
            }

        }

        return answer;
    }
}