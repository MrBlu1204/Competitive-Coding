class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];

        for(char c: s.toCharArray()){
            freq[c - 'a']++;
        }

        List<Integer> freqs = new ArrayList<>();

        for(int f: freq){
            if(f > 0){
                freqs.add(f);
            }
        }

        freqs.sort(Collections.reverseOrder());

        int deletions = 0;
        int ceiling = freqs.get(0) + 1;

        for(int count : freqs){
            int target = Math.max(Math.min(count, ceiling - 1), 0);
            deletions += count - target;
            ceiling = target;
        }

        return deletions;
        
    }
}