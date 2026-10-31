class Solution {
    public int maximumPopulation(int[][] logs) {

        int[] lifeHistory = new int[101];

        for(int[] log : logs){
            lifeHistory[log[0] - 1950]++;
            lifeHistory[log[1] - 1950]--;
        }

        int population = 0;
        int year = 0;
        int maxPopulation = 0;

        for(int i = 0; i<101; i++){
            population += lifeHistory[i];

            if(population > maxPopulation){
                maxPopulation = population;
                year = i;
            }
        }

        return year + 1950;

        
    }
}