class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s == null){
            return 0;
        }

        char[] str = s.toCharArray();
        int start = 0;

        int maxLen = 0;

        HashMap<Character, Integer> element = new HashMap<>();

        for(int i = 0; i < str.length; i++){
            if(element.containsKey(str[i])){
                start = Math.max(element.get(str[i]) + 1, start);                                        
            }
            element.put(str[i], i);
            maxLen = Math.max(maxLen, i - start + 1);
        }

        return maxLen;


        

    }
}