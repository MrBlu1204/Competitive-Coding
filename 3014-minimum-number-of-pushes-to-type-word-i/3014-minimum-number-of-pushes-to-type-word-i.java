class Solution {
    public int minimumPushes(String word) {

        int len = word.length();

        int group = (len-1)/8 + 1;

        int totalPushes =  group * (group-1) * 4 + (len - (group - 1) * 8) * group;

        return totalPushes;

    }
}