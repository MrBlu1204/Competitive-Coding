class Solution {
    public int myAtoi(String s) {

        if (s==null || s.length() == 0){
            return 0;
        }

        int i = 0;
        int n = s.length();
        
        while(i < n && s.charAt(i) == ' '){
            i++;
        }

        int sign = 1;

        if(i==n){
            return 0;
        }
        
        if(s.charAt(i) == '+'){
            i++;
        }else if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }

        long result = 0;
        int digit;

        while(i<n && Character.isDigit(s.charAt(i))){
            digit = s.charAt(i) - '0';
            result = result*10 + digit;

            if(sign * result >= Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }

            if (sign*result <= Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(result*sign);
    }
}