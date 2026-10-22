class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int maxLen = 1;

        for (int i =0; i< n; i++){
            int oddLength = expand(i,i,s);

            int evenLength = expand(i, i+1, s);

            int len = Math.max(oddLength, evenLength);

            if(len > maxLen){
                maxLen = len;
                start = i - (len-1)/2;
            }

        }

        return s.substring(start,start+maxLen);
        
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