class Solution {
    public int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int light = 0;
        int heavy = people.length - 1;

        int boats = 0;

        while(light <= heavy){
            if(people[light] + people[heavy] <= limit){
                light++;
            }

            heavy--;
            boats++;
        }

        return boats;
        
    }
}