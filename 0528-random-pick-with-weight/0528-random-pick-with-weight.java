class Solution {
    private int[] prefixSum;
    private int totalWeight = 0;
    private Random random;


    public Solution(int[] w) {
        int n =  w.length;
        prefixSum = new int[n];
        prefixSum[0] = w[0];

        for(int i = 1; i< n; i++){
            prefixSum[i] = prefixSum[i-1] + w[i];
        }

        totalWeight = prefixSum[n-1];

        random = new Random(); 
    }
    
    public int pickIndex() {

        int target = random.nextInt(totalWeight) + 1;

        int left = 0;
        int right  =  prefixSum.length;

        while(left < right){
            int mid = left + (right - left)/2;

            if(prefixSum[mid] < target){
                left = mid + 1;
            }else{
                right = mid;
            }
        }

        return left;

        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */