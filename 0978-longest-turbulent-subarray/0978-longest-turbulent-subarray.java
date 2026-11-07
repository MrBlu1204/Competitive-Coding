class Solution {
    public int maxTurbulenceSize(int[] arr) {

        int n = arr.length;

        int inc = 1;
        int dec = 1;
        int maxTur = 1;


        for(int i = 1; i < n ; i++){

            if(arr[i] > arr[i-1]){
                inc = dec + 1;
                dec = 1;
            }else if(arr[i] < arr[i-1]){
                dec = inc + 1;
                inc = 1;
            }else{
                inc = 1;
                dec = 1;
            }

            maxTur = Math.max(maxTur, Math.max(inc, dec));
        }
        
        return maxTur;
    }
}