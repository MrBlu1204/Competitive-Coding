class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int left = 0;
        int right = 0;
        for(int weight : weights){
            left = Math.max(left, weight);
            right += weight;
        }
        int minCapacity = right;

         while(left <= right){
            int capacity = left + (right - left)/2;
            int totalDays = 0;
            int totalWeight = 0;

            for(int weight : weights){
                totalWeight += weight;
                if(totalWeight > capacity){
                    totalDays++;
                    totalWeight = weight;
                }
            }
            totalDays++;

            if( totalDays <= days){
                minCapacity = capacity;
                right = capacity - 1;
            }else{
                left = capacity + 1;
            }
        }

        return minCapacity;


        
    }
}