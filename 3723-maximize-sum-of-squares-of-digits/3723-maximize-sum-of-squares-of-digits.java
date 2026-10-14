class Solution {
    public String maxSumOfSquares(int num, int sum) {

        if(sum > 9L * num){
            return "";
        }

        int r = sum % 9;
        int q = sum / 9;

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < q; i++){
            result.append('9');
        }

        if(r>0){
            result.append((char) ('0' + r));
        }

        int zeros =  num - result.length();

        while(zeros>0){
            result.append('0');
            zeros--;
        }



        return result.toString();
        
    }
}