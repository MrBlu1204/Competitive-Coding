class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> numSet = new HashSet<>();
        int count = 0;

        for(int num : nums){
            numSet.add(num);
        }



        for(int num : numSet){
            int c = 0;
            if(!numSet.contains(num - 1)){
                int n = num;
                while(numSet.contains(n++)){
                    c++;
                }
                count = Math.max(count, c);
            }
        }

        return count;
        
    }
}