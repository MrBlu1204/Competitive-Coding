class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s == null){
            return 0;
        }

        int start = 0;

        int maxLen = 0;

        HashMap<Character, Integer> element = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(element.containsKey(s.charAt(i))){
                maxLen = Math.max(maxLen, i - start);
                start = Math.max(element.get(s.charAt(i)) + 1, start);                                                        
            }
            element.put(s.charAt(i), i);    
        }

        return Math.max(maxLen, s.length() - start);


        

    }
}