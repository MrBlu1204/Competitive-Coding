class NumArray {

    private final int[] prefixSum;

    public NumArray(int[] nums) {

        int n = nums.length;
        prefixSum = new int[n];

        int sum = 0;

        for(int i =0; i< n; i++){
            sum += nums[i];
            prefixSum[i] = sum;
        }
        
    }
    
    public int sumRange(int left, int right) {
        int lSum = left > 0 ? prefixSum[left -1] : 0;
        int rSum = prefixSum[right];

        return rSum - lSum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */