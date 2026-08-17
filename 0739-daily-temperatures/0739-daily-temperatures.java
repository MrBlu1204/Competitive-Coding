class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];
        Deque<int[]> tempIndex = new ArrayDeque<>();

        for(int i = 0; i < temperatures.length; i++){

            while(!tempIndex.isEmpty() && temperatures[i] > tempIndex.peek()[0]){
                int[] temp = tempIndex.pop();
                result[temp[1]] = i - temp[1];
            }

            tempIndex.push(new int[]{temperatures[i], i});
        }

        return result;
        
    }
}