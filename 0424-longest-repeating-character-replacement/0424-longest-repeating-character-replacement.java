class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character,Integer> freq = new HashMap<>();

        int left = 0, maxFreq = 0;

        int result = 0;

        for(int right = 0; right< s.length(); right++){
            freq.put(s.charAt(right), freq.getOrDefault(s.charAt(right),0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(s.charAt(right)));

            if((right - left + 1) - maxFreq > k){
                freq.put(s.charAt(left), freq.get(s.charAt(left)) - 1);
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;
        
    }
}