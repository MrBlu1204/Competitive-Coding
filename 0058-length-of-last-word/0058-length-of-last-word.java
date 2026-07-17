class Solution {
    public int lengthOfLastWord(String s) {

        if(!s.contains(" "))
            return s.length();

        int length = 0;
        char[] str = s.toCharArray();
        int i = str.length-1;

        while(str[i]== ' ' && i>=0){
            i--;
        }

        while(i>=0 && str[i] != ' '){
            length++;
            i--;
        }

        return length;
        
    }
}