class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> result= new HashMap<>();

        for(String str: strs){
           
            String key = frequency(str);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(str);

        }

        return new ArrayList<>(result.values());
        
    }

    public String frequency(String str){
        char[] count = new char[26];
            for(char c : str.toCharArray()){
                count[c-'a']++;
            }
        return Arrays.toString(count);
    }

}