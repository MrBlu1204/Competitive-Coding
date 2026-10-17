class Solution {
    public int numSplits(String s) {

        int n = s.length();

        int[] leftDist = new int[n];
        Set<Character> seen = new HashSet<>();

        for(int i = 0; i<n; i++){
            seen.add(s.charAt(i));
            leftDist[i] = seen.size();
        }

        int[] rightDist = new int[n];
        seen.clear();

        for(int i = n-1; i>=0; i--){
            seen.add(s.charAt(i));
            rightDist[i] = seen.size();
        }

        int count = 0;

        for(int i = 1; i< n; i++){
            if(leftDist[i-1] == rightDist[i]){
                count++;
            }
        }

        return count;
        
    }
}