class Solution {
    public int[] findErrorNums(int[] nums) {
        int duplicate = -1;
        int missing = -1;

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num : nums){
            freq.put(num, freq.getOrDefault(num,0) + 1);
        }

        for(int i = 1; i<= nums.length; i++){
            if(freq.getOrDefault(i,0) == 2){
                duplicate = i;
            }
            if(freq.getOrDefault(i,0) == 0){
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
        
    }
}