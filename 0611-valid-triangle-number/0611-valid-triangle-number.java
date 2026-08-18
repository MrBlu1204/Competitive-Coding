class Solution {
    public int triangleNumber(int[] nums) {

        int count = 0;
        Arrays.sort(nums);
        int n = nums.length;

        for(int c = n-1; c >=2 ; c--){
            int a = 0, b = c-1;
            while(a < b){
                if(nums[a] + nums[b] > nums[c]){
                    count += b - a;
                    b--;
                }else{
                    a++;
                }
            }
        }

        return count;
        
    }
}