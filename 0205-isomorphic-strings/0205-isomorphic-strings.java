class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character,Character> sMap = new HashMap<>();
        Map<Character,Character> tMap = new HashMap<>();

        for(int i= 0; i< s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if(sMap.containsKey(charS) && sMap.get(charS) != charT){
                return false;
            }
            if(tMap.containsKey(charT) && tMap.get(charT) != charS){
                return false;
            }

            sMap.put(charS, charT);
            tMap.put(charT, charS);

        }
        
        return true;
    }
}