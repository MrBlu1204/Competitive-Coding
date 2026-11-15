class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        if((long) m * k > n){
            return -1;
        }

        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;

        for(int bloom : bloomDay){
            left = Math.min(left, bloom);
            right = Math.max(right, bloom);
        }

        while(left <= right){

            int mid = left + (right - left)/2;

            int currFlower = 0;
            int bouquet = 0;

            for(int bloom : bloomDay){
                if(bloom <= mid){
                    currFlower++;
                    if(currFlower == k){
                        bouquet++;
                        currFlower = 0;
                    }
                }else{
                    currFlower = 0;
                }
            }

            if(bouquet >= m){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return left;
        
    }
}