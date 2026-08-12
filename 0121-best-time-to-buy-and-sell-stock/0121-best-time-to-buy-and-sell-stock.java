class Solution {
    public int maxProfit(int[] prices) {

        if(prices == null || prices.length < 2 ){
            return 0;
        }
        
        int left=0, right = 1;

        int profit = 0;

        while(right < prices.length){
            if(prices[left] < prices[right]){
                profit = Math.max(profit, prices[right] - prices[left]);
            }else{
                left = right;
            }
            right++;
        }

        return profit;
        
    }
}