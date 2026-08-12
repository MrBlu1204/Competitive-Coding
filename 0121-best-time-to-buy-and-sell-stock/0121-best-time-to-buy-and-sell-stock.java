class Solution {
    public int maxProfit(int[] prices) {

        if(prices == null || prices.length == 0){
            return 0;
        }
        
        int leftMin =  prices[0];

        int profit = 0;

        for(int i=1; i< prices.length; i++){
            leftMin = Math.min(leftMin, prices[i]);
            profit = Math.max(profit, prices[i] - leftMin);
        }

        return profit;
        
    }
}