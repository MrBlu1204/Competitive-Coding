class Solution {
    private int[][] maxCoinDP;

    public int maxCoins(int[] nums) {
        int len = nums.length;
        int[] newNums = new int[len + 2];

        newNums[0] = 1;
        newNums[len +1] = 1;

        for(int i= 0; i <len; i++){
            newNums[i+1] = nums[i];
        }

        

        maxCoinDP = new int[len+2][len+2];

        for(int i = 1; i<=len ; i++){
            for(int j = 1; j<=len; j++){
                maxCoinDP[i][j] = -1;
            }
        }

        return dfs(newNums, 1,len);
        
    }

    private int dfs(int[] nums, int left, int right){
        if(left > right){
            return 0;
        }

        if(maxCoinDP[left][right] != -1){
            return maxCoinDP[left][right];
        }

        maxCoinDP[left][right] = 0;

        for(int i = left; i <= right ; i++){
            int coins = nums[left-1]*nums[i]*nums[right+1];
            coins += dfs(nums, left, i-1) + dfs(nums, i+1 , right);

            maxCoinDP[left][right] = Math.max(maxCoinDP[left][right], coins);

        }

        return maxCoinDP[left][right];        
    }
}