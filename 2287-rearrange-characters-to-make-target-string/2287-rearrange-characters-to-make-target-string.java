class Solution {
    public int rearrangeCharacters(String s, String target) {

        Map<Character, Integer> charFreq =  new HashMap<>();
        Map<Character, Integer> targetFreq = new HashMap<>();

        for(char c: s.toCharArray()){
            charFreq.put(c, charFreq.getOrDefault(c,0) + 1);
        }

        for(char c: target.toCharArray()){
            targetFreq.put(c, targetFreq.getOrDefault(c,0) + 1);
        }

        int result = Integer.MAX_VALUE;
        
        for(Map.Entry<Character,Integer> c : targetFreq.entrySet()){
            
            result = Math.min(result, charFreq.getOrDefault(c.getKey(),0)/c.getValue());

        }

        return result;
    }
}