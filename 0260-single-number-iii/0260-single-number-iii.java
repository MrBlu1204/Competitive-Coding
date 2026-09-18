class Solution {
    public int[] singleNumber(int[] nums) {

        HashMap<Integer,Integer> freq = new HashMap<>();

        int[] result = new int[2];
        int i = 0;

        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for(int num : freq.keySet()){
            if(freq.get(num) == 1){
                result[i++] = num;
            }
        }


        return result;
        
    }
}