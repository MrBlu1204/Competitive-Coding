class Solution {
    public int countPrimes(int n) {

        if(n<2){
            return 0;
        }

        int count = 0;

        boolean[] isPrime = new boolean[n];

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        int i = 2;


        while(i*i < n){
            if(isPrime[i]){
                count++;
                for(int j = i*i; j < n ; j+=i){
                    isPrime[j] = false;
                }
            }
            i++;
        }

        while(i<n){
            if(isPrime[i]){
                count++;
            }
            i++;
        }

        return count;
        
    }
}