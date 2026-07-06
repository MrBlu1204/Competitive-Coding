class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0 || x%10 ==0 && x!=0){
            return false;
        }

        int reverse = 0;
        int digit;


        while(reverse < x){
            digit = x%10;
            reverse = reverse*10 + digit;

            x /= 10;
        }

        return reverse==x || reverse/10 == x;
        
    }
}