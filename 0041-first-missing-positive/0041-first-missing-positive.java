class Solution {
    public int firstMissingPositive(int[] nums) {

        HashSet<Integer> numbers = new HashSet<>();

        for(int num: nums){
            numbers.add(num);
        }

        for(int i = 1; i<=nums.length; i++){
            if(!numbers.contains(i)){
                return i;
            }
        }

        return nums.length + 1;
        
        
    }
}