/**
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */
class Solution {
    public void findSecretWord(String[] words, Master master) {

        List<String> candidates = new ArrayList<>(Arrays.asList(words));

        while(!candidates.isEmpty()){

            String guess = candidates.get(0);

            int best = Integer.MAX_VALUE;

            for(String word: candidates){
                Map<Integer,Integer> buckets = new HashMap<>();

                for(String w: candidates){
                    int k = match(word, w);
                    buckets.merge(k, 1, Integer::sum);
                }

                int worst = Collections.max(buckets.values());
                if(worst < best){
                    best = worst;
                    guess = word;
                }
            }

            int matches = master.guess(guess);

            if(matches == 6){
                return;
            }

            List<String> filtered = new ArrayList<>();

            for(String word: candidates){
                if(match(word,guess) == matches){
                    filtered.add(word);
                }
            }

            candidates = filtered;
        }
        
    }

    private int match(String a, String b){
    int count = 0;
    for(int i= 0; i<6 ; i++){
        if(a.charAt(i) == b.charAt(i)){
            count++;
        }
    }

    return count;
}
}

