class Solution {
    public int maximumLengthSubstring(String s) {

        int result = 0;

        int[] freq  = new int[26];

        for(int left = 0, right = 0; right < s.length() ; right++){
            freq[s.charAt(right) - 'a']++;

            while(freq[s.charAt(right) - 'a'] > 2){
                freq[s.charAt(left) - 'a']--;
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
        
    }
}