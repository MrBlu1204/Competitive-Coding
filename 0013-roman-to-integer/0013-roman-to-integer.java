class Solution {
    public int romanToInt(String s) {

    

        int num = 0;

        for(int i = 0; i < s.length() - 1; i++){

            if(roman(s.charAt(i)) < roman(s.charAt(i+1))){
                num -= roman(s.charAt(i));
            } else {
                num += roman(s.charAt(i));
            }

        }
        
        return num + roman(s.charAt(s.length()-1));
        
    }

     static int roman(char ch){
        if(ch == 'I') return 1;
        if(ch == 'V') return 5;
        if(ch == 'X') return 10;
        if(ch == 'L') return 50;
        if(ch == 'C') return 100;
        if(ch == 'D') return 500;
        if(ch == 'M') return 1000;
        return 0;
    }
}