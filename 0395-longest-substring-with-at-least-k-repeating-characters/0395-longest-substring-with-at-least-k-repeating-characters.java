class Solution {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        int maxLen = 0;

        int maxUnique = 0;

        boolean[] seen = new boolean[26];

        for(char c: s.toCharArray()){
            if(!seen[c - 'a']){
                seen[c - 'a'] = true;
                maxUnique++;
            }
        }


        for(int i = 1; i <= maxUnique; i++){
            int[] freq = new int[26];
            int left = 0;
            int unique = 0;
            int atLeastK = 0;


            for(int right = 0; right < n; right++){
                int rIdx = s.charAt(right) - 'a';
                if(freq[rIdx] == 0){
                    unique++;
                }
                freq[rIdx]++;

                if(freq[rIdx] ==k){
                    atLeastK++;
                }

                while(unique > i){
                    int lIdx = s.charAt(left) - 'a';
                    if(freq[lIdx] == k){
                        atLeastK--;
                    }
                    freq[lIdx]--;

                    if(freq[lIdx] == 0){
                        unique--;
                    }

                    left++;
                }

                if(unique == i && atLeastK == i){
                    maxLen = Math.max(maxLen, right - left + 1);
                }
            }
        }

        return maxLen;
    }
}