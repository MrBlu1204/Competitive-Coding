class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int result = right;

        while(left <= right){
            int speed = left + (right - left)/2;
            long totalTime = 0;

            for(int pile : piles){
                totalTime +=(pile + speed - 1)/speed;
            }

            if( totalTime <= h){
                result = speed;
                right = speed - 1;
            }else{
                left = speed + 1;
            }
        }

        return result;
        
    }
}