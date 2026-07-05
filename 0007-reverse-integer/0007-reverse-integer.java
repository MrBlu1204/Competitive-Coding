class Solution {
    public int reverse(int x) {

        long result = 0;

        while(x!=0){
            int digit = x % 10;
            x /= 10;

            result = result * 10 + digit;
        }

        if(result >= Integer.MIN_VALUE && result<= Integer.MAX_VALUE)
        return (int)result;

        return 0;
        
    }
}