class Solution {
    public int maxScoreSightseeingPair(int[] values) {

        int maxLeftScore = values[0] + 0;

        int maxScore = 0;

        for(int j = 1; j < values.length; j++){
            maxScore = Math.max(maxScore, maxLeftScore + values[j] - j);
            maxLeftScore = Math.max(maxLeftScore, values[j] + j);
        }

        return maxScore;
        
    }
}