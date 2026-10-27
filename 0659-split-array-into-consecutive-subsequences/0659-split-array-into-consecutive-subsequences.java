class Solution {
    public boolean isPossible(int[] nums) {

        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> tails = new HashMap<>();

        for(int num : nums){
            freq.merge(num,1, Integer::sum);
        }

        for(int num : nums){
            if(freq.get(num) == 0){
                continue;
            }

            if(tails.getOrDefault(num,0) > 0){
                tails.put(num, tails.get(num) -1);
                tails.put(num + 1, tails.getOrDefault(num+1,0) + 1);
            }
            else if(freq.getOrDefault(num+1,0) > 0 
                && freq.getOrDefault(num+2,0) > 0){
                    freq.put(num+1, freq.get(num+1) - 1);
                    freq.put(num+2, freq.get(num+2) - 1);
                    tails.put(num+3, tails.getOrDefault(num+3,0)+1);
            }
            else {
                return false;
            }

            freq.put(num, freq.get(num) -1);
        }

        return true;
        
    }
}