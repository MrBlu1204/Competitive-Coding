class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {

        int[][] sum = new int[n+1][n+1];

        for(int[] query : queries){
            sum[query[0]][query[1]]++;
            sum[query[0]][query[3] + 1]--;
            sum[query[2] + 1][query[1]]--;
            sum[query[2] + 1][query[3] + 1]++;
        }


        for(int r = 0; r < n; r++){
            for(int c =1; c < n; c++){
                sum[r][c] += sum[r][c-1];
            }
        }

        for(int c = 0; c < n; c++){
            for(int r =1; r < n; r++){
                sum[r][c] += sum[r-1][c];
            }
        }


        int[][] result = new int[n][n];

        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                result[r][c] = sum[r][c];
            }
        }

        return result;



        
        
    }
}