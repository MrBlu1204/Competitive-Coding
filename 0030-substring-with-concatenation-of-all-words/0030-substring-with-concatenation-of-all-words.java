class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        
        int w = words[0].length();
        int m =  words.length;
        int windowSize = w*m;
        List<Integer> result = new ArrayList<>();

        if(s.length() < windowSize){
            return result;
        }


        Map<String, Integer> target = new HashMap<>();
        for(String word : words){
            target.merge(word, 1, Integer::sum);
        }

        int distinctWords = target.size();

        for(int k = 0; k < w; k++){
            Map<String, Integer> seen = new HashMap<>();
            int matchCount = 0;
            int left = k;

            for(int right = k; right + w - 1 < s.length(); right += w){

                String rightWord = s.substring(right, right+w);

                if(target.containsKey(rightWord)){
                    int count = seen.merge(rightWord, 1, Integer::sum);
                    if(count == target.get(rightWord)){
                        matchCount++;
                    }
                    else if(count == target.get(rightWord) + 1){
                        matchCount--;
                    }
                }

                if(right - left + 1 > windowSize){
                    String leftWord = s.substring(left, left + w);
                    if(target.containsKey(leftWord)){
                        int count = seen.get(leftWord);
                        seen.put(leftWord, count -1);
                        if(count == target.get(leftWord)){
                            matchCount--;
                        }
                        else if(count - 1 == target.get(leftWord)){
                            matchCount++;
                        }
                    }
                    left +=  w;
                }

                if(matchCount == distinctWords){
                    result.add(left);
                }
            }
        }

        return result;   
    }
}