class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        val frequencyArray = IntArray(101)
        var count = 0
        for(num in nums){
            count += frequencyArray[num]
            frequencyArray[num]++
        }
        return count
    }
}