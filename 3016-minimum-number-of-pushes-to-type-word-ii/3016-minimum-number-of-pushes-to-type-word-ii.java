class Solution {
    public int minimumPushes(String word) {

        int ans=0;
        int[] fre=new int[26];
        int n=word.length();
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            fre[ch-'a']++;
        }
        Arrays.sort(fre);
        for(int i=25;i>=0;i--){
            ans+=fre[i]*((25-i)/8+1);
        }
        return ans;

        
    }
}