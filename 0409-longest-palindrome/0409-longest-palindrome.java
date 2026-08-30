class Solution {
    public int longestPalindrome(String s) {

        HashSet<Character> freq = new HashSet<>();

        int length = 0;

        for(char c : s.toCharArray()){
            if(freq.contains(c)){
                length += 2;
                freq.remove(c);
            }else{
                freq.add(c);
            }
        }

        if(!freq.isEmpty()){
            length++;
        }

        return length;
        
    }
}