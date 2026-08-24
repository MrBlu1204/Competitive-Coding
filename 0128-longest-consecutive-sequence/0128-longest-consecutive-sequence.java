class Solution {
    public int longestConsecutive(int[] nums) {

        Map<Integer, Integer> numMap = new HashMap<>();
        int count = 0;


        for(int num : nums){
            if(!numMap.containsKey(num)){
                numMap.put(num, numMap.getOrDefault(num-1,0) + numMap.getOrDefault(num+1,0) + 1);
                numMap.put(num - numMap.getOrDefault(num-1,0), numMap.get(num));
                numMap.put(num + numMap.getOrDefault(num+1,0), numMap.get(num));

                count = Math.max(count, numMap.get(num));
            }
        }

        return count;
        
    }
}