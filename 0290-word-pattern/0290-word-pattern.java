class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] words = s.split(" ");

        if(pattern.length() != words.length){
            return false;
        }

        Map<Character,String> charToWord = new HashMap<>();
        Map<String,Character> wordToChar = new HashMap<>();

        for(int i = 0; i< words.length; i++){

            char ch = pattern.charAt(i);
            String word = words[i];

            if(charToWord.containsKey(ch) && !charToWord.get(ch).equals(word)){
                return false;
            }

            if(wordToChar.containsKey(word) && wordToChar.get(word) != ch){
                return false;
            }

            charToWord.putIfAbsent(ch,word);
            wordToChar.putIfAbsent(word,ch);     

        }

        return true;
    }
}