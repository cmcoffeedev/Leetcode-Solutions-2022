class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] frequencyArray = new int[101];
        int count = 0;
        for(int num: nums){
            count += frequencyArray[num];
            frequencyArray[num]++;
        }
        return count;
    }
}