class Solution {
    public int minimumPushes(String word) {

        Map<Character,Integer> frequency = new HashMap<>();

        for(char c : word.toCharArray()){
            frequency.put(c, frequency.getOrDefault(c,0)+1);
        }

        PriorityQueue<Integer> frequencyQ = new PriorityQueue<>((a,b) -> b - a);

        frequencyQ.addAll(frequency.values());

        int totalPushes = 0;
        int i = 0;

        while(!frequencyQ.isEmpty()){
            totalPushes += (i/8 +1)*frequencyQ.poll();
            i++;
        }

        return totalPushes;

        
    }
}