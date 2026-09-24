class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> numCount = new HashMap<>();

        List<Integer> result= new ArrayList<>();

        for(int num : nums1){
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }

        for(int num : nums2){
            if(numCount.getOrDefault(num,0) > 0){
                result.add(num);
                numCount.put(num, numCount.get(num) - 1);
            }
        }

         int[] arr = new int[result.size()];
         for (int k = 0; k < result.size(); k++) {
            arr[k] = result.get(k);
        }
        return arr;
        
    }
}