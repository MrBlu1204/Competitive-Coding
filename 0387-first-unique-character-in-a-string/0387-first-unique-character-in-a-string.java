class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> count = new HashMap<>();
        Deque<Integer> queue = new ArrayDeque<>();

        
        
        for(int i = 0; i < s.length() ; i++){
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c,0) + 1);
            queue.addLast(i);

            while(!queue.isEmpty()  && count.get(s.charAt(queue.peekFirst())) >1){
                queue.pollFirst();
            }
        }

        return queue.isEmpty() ? -1 : queue.pollFirst();
        
    }
}