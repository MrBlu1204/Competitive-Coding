class Solution {
    public String reorganizeString(String s) {

        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }

        int maxFreq = 0;

        char maxChar = 'a';

        for(int i = 0; i < 26 ; i++){

            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                maxChar = (char) ('a' + i);
            }
        }

        if(maxFreq > (s.length()+1)/2){
            return "";
        }

        char[] result = new char[s.length()];
        int idx = 0;

        while(freq[maxChar - 'a']>0){
            result[idx] = maxChar;
            idx +=  2;
            freq[maxChar -'a']--;
        }

        for(int i =0; i< 26; i++){
            while(freq[i] > 0){
                if(idx >= result.length){
                    idx = 1;
                }
                result[idx] = (char) (i + 'a');
                idx += 2;
                freq[i]--;
            }
        }

        return new String(result);
        
    }
}