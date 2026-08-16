class Solution {

    private static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {

        long evenIndices = (n + 1)/2;
        long oddIndices = n/2;

        long evenPower = power(5, evenIndices);
        long oddPower = power(4, oddIndices);

        return (int) ((evenPower*oddPower) % MOD);     
    }

    public long power(long base, long exp){
        long result = 1;
        base %= MOD;

        while(exp  > 0){
            if(exp%2 == 1){
                result = (result*base) % MOD;
            }
            base = (base*base)% MOD;
            exp /=2;
        }

        return result;

    }
}