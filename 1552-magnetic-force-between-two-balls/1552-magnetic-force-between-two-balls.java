class Solution {
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);

        
        int left = 1;
        int right = position[n-1] - position[0];
        int result = 1;

        while(left <= right){
            int mid = left + (right - left)/2;
            int balls = 1;
            int lastPosition = position[0];

            for(int post : position){
                int nextPosition = lastPosition + mid;

                if(post >= nextPosition){
                    lastPosition = post;
                    balls++;
                }

                if (balls == m){
                    break;
                }
            }

            if(balls >= m){
                result = mid;
                left = mid + 1;
            } else{
                right = mid -1;
            }
        }

        return result;
        
    }
}