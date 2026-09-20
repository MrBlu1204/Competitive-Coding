class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        if(ransomNote.length() > magazine.length()){
            return false;
        }

        int[] charCount = new int[26];

        for(char c : magazine.toCharArray()){
            charCount[c - 'a']++;
        }

        for(char c : ransomNote.toCharArray()){
            charCount[c - 'a']--;

            if(charCount[c - 'a'] < 0){
                return false;
            }
        }

        return true;        
    }
}