class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        
        List<Integer> result = new ArrayList<>();
        int n = p.length();
        int m = s.length();

        if(m<n){
            return result;
        }


        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        for(int i = 0; i < n; i++){
            pCount[p.charAt(i) - 'a']++;
            windowCount[s.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (pCount[i] == windowCount[i]) matches++;
        }
        if (matches == 26) result.add(0);

   
        for (int i = n; i < m; i++) {
            int inChar = s.charAt(i) - 'a';
            int outChar = s.charAt(i - n) - 'a';


            windowCount[inChar]++;
            if (windowCount[inChar] == pCount[inChar]) matches++;
            else if (windowCount[inChar] == pCount[inChar] + 1) matches--;


            windowCount[outChar]--;
            if (windowCount[outChar] == pCount[outChar]) matches++;
            else if (windowCount[outChar] == pCount[outChar] - 1) matches--;

            if (matches == 26) result.add(i - n + 1);
        }
        return result;
        
    }
}