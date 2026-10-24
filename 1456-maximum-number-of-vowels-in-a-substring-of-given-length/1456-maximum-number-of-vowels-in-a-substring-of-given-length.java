class Solution {
    public int maxVowels(String s, int k) {
      
    boolean[] isVowel = new boolean[128];
    isVowel['a'] = isVowel['e'] = isVowel['i'] = isVowel['o'] = isVowel['u'] = true;

    // Count vowels in the first window
    int currentCount = 0;
    for (int i = 0; i < k; i++) {
        if (isVowel[s.charAt(i)]) {
            currentCount++;
        }
    }

    int maxVowels = currentCount;

 
    for (int i = k; i < s.length(); i++) {
       
        if (isVowel[s.charAt(i - k)]) currentCount--;
        if (isVowel[s.charAt(i)]) currentCount++;
        maxVowels = Math.max(maxVowels, currentCount);
    }

    return maxVowels;
        
    }
}