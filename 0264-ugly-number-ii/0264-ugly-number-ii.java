class Solution {
    public int nthUglyNumber(int n) {

        int[] uglyNumbers = new int[n];

        uglyNumbers[0] = 1;

        int index2 = 0, index3 = 0, index5 = 0;
        int next2 = 2, next3 = 3, next5 =5;

        for(int i = 1; i<n ; i++){
            int nextUgly = Math.min(next2, Math.min(next3, next5));

            uglyNumbers[i] = nextUgly;

            if(nextUgly == next2){
                index2++;
                next2 = uglyNumbers[index2]*2;
            }

            if(nextUgly == next3){
                index3++;
                next3 = uglyNumbers[index3]*3;
            }


            if(nextUgly == next5){
                index5++;
                next5 = uglyNumbers[index5]*5;
            }

        }


        return uglyNumbers[n-1];
        
    }
}