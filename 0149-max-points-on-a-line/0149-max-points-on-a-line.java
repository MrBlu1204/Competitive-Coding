class Solution {
    public int maxPoints(int[][] points) {
        
        int maxCount = 2;
        int n = points.length;

        if(n < 3){
            return n;
        }

        for(int i = 0; i < n; i++){

            HashMap<String,Integer> slopeFreq = new HashMap<>();
            int localMaxCount = 0;

            for(int j = 0; j < n; j++){
                if(i==j){
                    continue;
                }

                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];


                int f = gcd(Math.abs(dy), Math.abs(dx));
                dy /= f;
                dx /= f;

                // Normalize sign: ensure dx >= 0; if dx == 0, ensure dy > 0
                if (dx < 0) {
                    dy = -dy;
                    dx = -dx;
                } else if (dx == 0) {
                    dy = Math.abs(dy);
                }

                String slope = dy + "/" + dx;
                slopeFreq.put(slope, slopeFreq.getOrDefault(slope,0) + 1);
                localMaxCount = Math.max(localMaxCount, slopeFreq.get(slope));
            }

            maxCount = Math.max(maxCount,localMaxCount + 1);
        }

        return maxCount;


    }


    public int gcd(int a, int b){
        while (b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}