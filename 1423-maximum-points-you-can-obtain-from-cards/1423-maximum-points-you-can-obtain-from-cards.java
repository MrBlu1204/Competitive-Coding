class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int currPoints = 0;
        int n = cardPoints.length;

        for(int i =0; i < k; i++){
            currPoints += cardPoints[i];
        }

        int maxPoints = currPoints;

        for(int i = 1; i<=k; i++){
            currPoints -= cardPoints[k-i];
            currPoints +=  cardPoints[n-i];

            maxPoints = Math.max(maxPoints, currPoints);
        }

        return maxPoints;
        
    }
}