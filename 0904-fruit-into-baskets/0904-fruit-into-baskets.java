class Solution {
    public int totalFruit(int[] fruits) {

        int n = fruits.length;

        int left = 0;
        int maxFruits = 0;
        int secondFruit = 0;
        int fruitA = fruits[0];
        int fruitB = -1;


        for(int right = 0; right < fruits.length; right++){

            if(fruits[right] != fruitA && fruits[right] != fruitB){
                if(fruitB != -1){
                    left = secondFruit;
                }
                fruitA =  fruits[right -1];
                fruitB = fruits[right];
            }

            if(right >0  && fruits[right] != fruits[right-1]){
                secondFruit = right;
            }

            maxFruits = Math.max(maxFruits, right - left + 1);

        }

        return maxFruits;
        
    }
}