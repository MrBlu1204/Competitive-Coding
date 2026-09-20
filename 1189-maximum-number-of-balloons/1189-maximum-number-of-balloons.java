class Solution {
    public int maxNumberOfBalloons(String text) {

        int[] charCount = new int[26];

        for(char c : text.toCharArray()){
            charCount[c - 'a'] += 1;
        }

        int result = Integer.MAX_VALUE;

        result = Math.min(result, charCount['b' - 'a']);
        result = Math.min(result, charCount['a' - 'a']);
        result = Math.min(result, charCount['l' - 'a']/2);
        result = Math.min(result, charCount['o' - 'a']/2);
        result = Math.min(result, charCount['n' - 'a']);

        return result;
        
    }
}