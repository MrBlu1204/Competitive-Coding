class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s2.length() < s1.length()){
            return false;
        }

        int[] freqS1 = new int[26];
        int[] freqS2 = new int[26];

        for(int i = 0; i< s1.length(); i++){
            freqS1[s1.charAt(i) - 'a']++;
            freqS2[s2.charAt(i) - 'a']++;
        }

        int match = 0;

        for(int i = 0; i<26; i++){
            if(freqS1[i] == freqS2[i]){
                match++;
            }
        }

        int left = 0;

        for(int right = s1.length(); right < s2.length(); right++){
            if(match == 26){
                return true;
            }

            int index = s2.charAt(right) - 'a';
            freqS2[index]++;

            if(freqS1[index] == freqS2[index]){
                match++;
            }else if(freqS1[index] + 1 == freqS2[index]){
                match--;
            }

            index = s2.charAt(left) - 'a';
            freqS2[index]--;

            if(freqS1[index] == freqS2[index]){
                match++;
            }else if(freqS1[index] - 1 == freqS2[index]){
                match--;
            }

            left++;
        }

        return match == 26;
        
    }
}