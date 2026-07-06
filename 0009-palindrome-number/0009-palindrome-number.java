class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }else if(x < 10){
            return true;
        }

        long reverse = 0;
        int digit;
        long num = x;

        while(x !=0){
            digit = x%10;
            reverse = reverse*10 + digit;

            x /= 10;
        }

        if(num == reverse){
            return true;
        }

        return false;


        
    }
}