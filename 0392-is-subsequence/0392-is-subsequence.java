class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        char[] strS = s.toCharArray();
        char[] strT = t.toCharArray();

        int m = strS.length;
        int n = strT.length;

        while(i<m && j<n){
            if(strS[i] == strT[j]){
                i++;
            }
            j++;
        }

        if(i<m){
            return false;
        }

        return true;

        
    }
}