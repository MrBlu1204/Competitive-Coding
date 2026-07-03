class Solution {
    public String longestPalindrome(String s) {
        int[] str = new int[]{0,0};

        for (int i =0; i< s.length(); i++){
            int oddLength = expand(i,i,s);
            if(oddLength > str[1] - str[0]+1){
                int dist = oddLength/2;
                str[0] = i - dist;
                str[1] =i + dist;
            }

            int evenLength = expand(i, i+1, s);
            if(evenLength > str[1] - str[0] +1){
                int dist = (evenLength/2) - 1;
                str[0] = i - dist;
                str[1] = i + 1 + dist;
            }
        }

        int i = str[0];
        int j = str[1];

        return s.substring(i,j+1);
        
    }

    private int expand(int i, int j, String s){
        int left = i;
        int right = j;

        while(
            left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)
        ){
            left--;
            right++;
        }

        return right-left-1;
    }
}