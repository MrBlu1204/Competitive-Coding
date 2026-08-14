class Solution {
    public String minWindow(String s, String t) {
        

        if(s.length() < t.length() || t == null || s == null){
            return "";
        }

        Map<Character,Integer> freqT = new HashMap<>();
        Map<Character,Integer> freqWin = new HashMap<>();

        for(char ch : t.toCharArray()){
            freqT.put(ch, freqT.getOrDefault(ch, 0) + 1);
        }

        int match = 0, req = freqT.size();
        int[] result = {-1,-1};
        int resultLen =  Integer.MAX_VALUE;

        int left = 0;

        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);

            freqWin.put(ch, freqWin.getOrDefault(ch, 0) + 1);

            if(freqT.containsKey(ch) && freqT.get(ch).equals(freqWin.get(ch))){
                match++;
            }

            while(match == req){
                if(right - left + 1 < resultLen){
                    resultLen = right - left + 1;
                    result[0] = left;
                    result[1] = right;
                }

                ch = s.charAt(left);
                freqWin.put(ch, freqWin.getOrDefault(ch, 0) - 1);

                if(freqT.containsKey(ch) && freqT.get(ch) > (freqWin.get(ch))){
                    match --;
                }

                left++;

            }

        }

        return resultLen == Integer.MAX_VALUE ? "" : s.substring(result[0],result[1]+1);
        
    }
}