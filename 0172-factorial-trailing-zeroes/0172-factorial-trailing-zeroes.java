class Solution {
    public int trailingZeroes(int n) {

        int zeros = 0;
        int multiple = 5;

        while(n>= multiple){
            zeros += (n/multiple);
            multiple *= 5; 

        }

        return zeros;
        
    }
}