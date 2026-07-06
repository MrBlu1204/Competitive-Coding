class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }

        long reverse = 0;
        int digit;
        int num = x;

        while(x > 0){
            digit = x%10;
            reverse = reverse*10 + digit;

            x /= 10;
        }

        return num==reverse;
        
    }
}