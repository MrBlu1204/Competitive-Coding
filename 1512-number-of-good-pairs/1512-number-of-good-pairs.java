class Solution {
    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer, Integer> numCount = new HashMap<>();
        int count = 0;

        for(int num : nums){
            if(numCount.containsKey(num)){
                count +=  numCount.get(num);
            }

            numCount.put(num, numCount.getOrDefault(num,0) + 1);
        }

        return count;
        
    }
}