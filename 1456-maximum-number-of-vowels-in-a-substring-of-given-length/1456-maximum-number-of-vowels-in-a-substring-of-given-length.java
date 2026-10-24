class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowel = Set.of('a','e','i', 'o', 'u');
        int n = s.length();

        int currCount = 0;
        

        for(int i = 0; i<k && i<n; i++){
            char c = s.charAt(i);
            if(vowel.contains(c)){
                currCount++;
            }
        }

        int maxCount = currCount;


        for(int i= k; i<n; i++){
            char c = s.charAt(i);
            if(vowel.contains(c)){
                currCount++;
            }
            
            c =s.charAt(i-k);
            if(vowel.contains(c)){
                currCount--;
            }

            maxCount = Math.max(maxCount, currCount);

        }

        return maxCount;
        
    }
}