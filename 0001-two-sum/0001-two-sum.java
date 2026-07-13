class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> prevMap = new HashMap<>();
        int diff;

        for(int i = 0; i < nums.length; i++){
            diff = target - nums[i];
            if(prevMap.containsKey(diff)){
                return new int[] {prevMap.get(diff), i};
            }
            prevMap.put(nums[i], i);

        }

        return new int[] {};
    }
}